package tours.typechecker;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import tours.SymbolTable;
import tours.Type;
import tours.grammar.ToursBaseListener;
import tours.grammar.ToursParser;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker extends ToursBaseListener {
    private final SymbolTable symbolTable;
    private List<String> errors;

    public TypeChecker() {
        symbolTable = new SymbolTable();
        errors = new ArrayList<>();
    }

    @Override
    public void enterProgram(@NotNull ToursParser.ProgramContext ctx) {
        for (ToursParser.VoidFunctionContext function : ctx.voidFunction()) {
            Type returnType = Type.VOID;
            List<Type> argumentTypes = new ArrayList<>();

            for (int i = 0; i < function.variableType().size(); i++) {
                ToursParser.VariableTypeContext variableType = function.variableType(i);
                Type type = new Type(variableType.arrayType() != null ?
                        variableType.arrayType().getText() : variableType.primitiveType().getText());
                argumentTypes.add(type);
            }

            if (symbolTable.contains(function.IDENTIFIER(0).getText())) {
                errors.add(String.format("Error <function name already defined> on line %s, pos %s", function.IDENTIFIER(0).getSymbol().getLine(), function.IDENTIFIER(0).getSymbol().getCharPositionInLine()));
            }

            symbolTable.addFunction(function.IDENTIFIER(0).getText(), returnType, argumentTypes);
        }

        for (ToursParser.ReturnFunctionContext function : ctx.returnFunction()) {
            Type returnType = new Type((function.variableType(0).arrayType() != null ?
                    function.variableType(0).arrayType().getText() :
                    function.variableType(0).primitiveType().getText()));
            List<Type> argumentTypes = new ArrayList<>();

            // TODO argumenten die meegegeven worden moeten in de nieuwe scope vallen
            for (int i = 1; i < function.variableType().size(); i++) {
                ToursParser.VariableTypeContext variableType = function.variableType(i);
                Type type = new Type(variableType.arrayType() != null ?
                        variableType.arrayType().getText() : variableType.primitiveType().getText());
                argumentTypes.add(type);
            }

            if (symbolTable.contains(function.IDENTIFIER(0).getText())) {
                errors.add(String.format("Error <function name already defined> on line %s, pos %s", function.IDENTIFIER(0).getSymbol().getLine(), function.IDENTIFIER(0).getSymbol().getCharPositionInLine()));
            }

            symbolTable.addFunction(function.IDENTIFIER(0).getText(), returnType, argumentTypes);
        }
    }

    @Override
    public void exitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx) {
        // declarations
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            String id = identifier.getText();
            if (symbolTable.containsInCurrentScope(id)) {
                errors.add(String.format("Error <variable already defined> on line %s, pos %s", identifier.getSymbol().getLine(), identifier.getSymbol().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(id, new Type(ctx.primitiveType().getText()));
                symbolTable.addVariable(ctx.getText(), new Type(ctx.primitiveType().getText()));
            }
        }

        // assignment
        if (ctx.expression() != null && !(new Type(ctx.primitiveType().getText())).equals(symbolTable.getType(ctx.expression().getText()))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void exitVariableArray(@NotNull ToursParser.VariableArrayContext ctx) {
        // declarations
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            String id = identifier.getText();
            if (symbolTable.containsInCurrentScope(id)) {
                errors.add(String.format("Error <variable already defined> on line %s, pos %s", identifier.getSymbol().getLine(), identifier.getSymbol().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(id, new Type(ctx.arrayType().getText()));
                symbolTable.addVariable(ctx.getText(), new Type(ctx.arrayType().getText()));
            }
        }

        Type arrayType = new Type(ctx.arrayType().getText());
        String assignmentType = symbolTable.getType(ctx.arrayAssignment().getText()).toString();
        // assignment
        if (!arrayType.getPrimitiveType().equals(assignmentType)) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void exitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        List<ToursParser.ExpressionContext> expressions = ctx.expression();
        String expression = expressions.get(expressions.size() - 1).getText();
        Type type = symbolTable.getType(identifier);

        if (expressions.size() > 1 && (symbolTable.getType(ctx.expression(0).getText()) == null || !symbolTable.getType(expressions.get(0).getText()).equals(Type.INTEGER))) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", expressions.get(0).getStart().getLine(), expressions.get(0).getStart().getCharPositionInLine()));
        }

        // if it is an array, remove the array part in the type of type[i]
        if (ctx.LBLOCK() != null) {
            if (type.equals(Type.BOOLEAN_ARRAY)) {
                type = Type.BOOLEAN;
            } else if(type.equals(Type.CHARACTER_ARRAY)) {
                type = Type.CHARACTER;
            } else if(type.equals(Type.INTEGER_ARRAY)) {
                type = Type.INTEGER;
            } else if(type.equals(Type.STRING_ARRAY)) {
                type = Type.STRING;
            } else {
                errors.add(String.format("Error <type of array element not defined> on line %s, pos %s", ctx.LBLOCK().getSymbol().getLine(), ctx.LBLOCK().getSymbol().getCharPositionInLine()));
            }

        }

        if (type == null ) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        } else if (!type.equals(symbolTable.getType(expression))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }

        symbolTable.addVariable(ctx.getText(), type);
    }


    @Override
    public void enterVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        symbolTable.openScope();
        for (int i = 0; i < ctx.variableType().size(); i++) {
            ToursParser.VariableTypeContext variableType = ctx.variableType(i);
            Type type = new Type(variableType.arrayType() != null ?
                    variableType.arrayType().getText() : variableType.primitiveType().getText());
            symbolTable.addVariable(ctx.IDENTIFIER(i + 1).getText(), type);
        }
    }

    @Override
    public void exitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        symbolTable.closeScope();
    }


    @Override
    public void enterReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        symbolTable.openScope();
        for (int i = 1; i < ctx.variableType().size(); i++) {
            ToursParser.VariableTypeContext variableType = ctx.variableType(i);
            Type type = new Type(variableType.arrayType() != null ?
                    variableType.arrayType().getText() : variableType.primitiveType().getText());
            symbolTable.addVariable(ctx.IDENTIFIER(i).getText(), type);
        }
    }

    @Override
    public void enterMainFunction(@NotNull ToursParser.MainFunctionContext ctx) {
         symbolTable.openScope();
    }

    @Override
    public void exitMainFunction(@NotNull ToursParser.MainFunctionContext ctx) {
        symbolTable.closeScope();
    }

    @Override
    public void exitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        String returnExpression = ctx.returnBlock().returnStatement().expression().getText();
        String identifier = ctx.IDENTIFIER(0).getText();

        if (symbolTable.getType(identifier) != null &&
                !symbolTable.getType(identifier).equals(symbolTable.getType(returnExpression))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.returnBlock().getStart().getLine(), ctx.returnBlock().getStart().getCharPositionInLine()));
        }

        symbolTable.addVariable(ctx.getText(), symbolTable.getType(identifier));
        symbolTable.closeScope();
    }

    @Override
    public void exitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.IDENTIFIER().getText()));
    }

    @Override
    public void enterIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        Type type = symbolTable.getType(ctx.expression().getText());
        if (type != null && !type.equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.LPAR().getSymbol().getLine(), ctx.LPAR().getSymbol().getCharPositionInLine()));
        }

        symbolTable.closeScope();
    }

    @Override
    public void enterWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        Type type = symbolTable.getType(ctx.expression().getText());

        if (type != null && !type.equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.LPAR().getSymbol().getLine(), ctx.LPAR().getSymbol().getCharPositionInLine()));
        }

        symbolTable.closeScope();
    }

    @Override
    public void enterForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        Type type = symbolTable.getType(ctx.expression().getText());

        if (type != null && !type.equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.closeScope();
    }

    @Override public void exitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitArrayExpression(@NotNull ToursParser.ArrayExpressionContext ctx) {
        if (!symbolTable.contains(ctx.expression().getText())) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        } else if(!symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }

        symbolTable.addType(ctx.getText(), new Type(symbolTable.getType(ctx.IDENTIFIER().getText()).getPrimitiveType()));
    }

    @Override
    public void exitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx) {
        Type type = symbolTable.getType(ctx.compound(0).getText());

        if (type != null && !type.equals(symbolTable.getType(ctx.compound(1).getText()))) {
            errors.add(String.format("Error <mismatching expression types> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }

        symbolTable.addType(ctx.getText(), type);
    }

    @Override
    public void exitStringExpression(@NotNull ToursParser.StringExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.STRING);
    }

    @Override
    public void exitCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.CHARACTER);
    }

    @Override
    public void exitTrueExpression(@NotNull ToursParser.TrueExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
    }

    @Override
    public void exitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        if ((symbolTable.getType(ctx.expression(0).getText()) != null &&
                !symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER)) ||
                (symbolTable.getType(ctx.expression(1).getText()) != null &&
                        !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER))) {
            errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), Type.INTEGER);

    }

    @Override
    public void exitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        if ((symbolTable.getType(ctx.expression(0).getText()) == null &&
                !symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN)) ||
                (symbolTable.getType(ctx.expression(1).getText()) == null &&
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN))) {
            errors.add(String.format("Error <expected booleans> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

    }

    @Override public void enterCompound(@NotNull ToursParser.CompoundContext ctx) {
        symbolTable.openScope();
    }

    @Override public void exitCompound(@NotNull ToursParser.CompoundContext ctx) {
        Type type = symbolTable.getType(ctx.getChild(ctx.getChildCount() - 3).getText());
        symbolTable.closeScope();
        symbolTable.addVariable(ctx.getText(), type);
    }

    @Override
    public void exitArrayAssignmentWithInitialisation(@NotNull ToursParser.ArrayAssignmentWithInitialisationContext ctx) {
        Type expressionType = symbolTable.getType(ctx.expression(0).getText());

        for(int i = 1; i < ctx.expression().size(); i++) {
            if (symbolTable.getType(ctx.expression(i).getText()) != null &&
                    !symbolTable.getType(ctx.expression(i).getText()).equals(expressionType)) {
                errors.add(String.format("Error <mismatching array types> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            }
        }

        symbolTable.addType(ctx.getText(), expressionType);
    }

    @Override
    public void exitArrayAssignmentNew(@NotNull ToursParser.ArrayAssignmentNewContext ctx) {
        if (symbolTable.getType(ctx.expression().getText()) != null &&
                !symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.addType(ctx.getText(), new Type(ctx.primitiveType().getText()));
    }

    @Override
    public void exitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        if ((symbolTable.getType(ctx.expression(0).getText()) != null &&
                !symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN)) ||
                (symbolTable.getType(ctx.expression(1).getText()) != null &&
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN))) {
            errors.add(String.format("Error <expected booleans> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

    }

    @Override
    public void exitIntegerExpression(@NotNull ToursParser.IntegerExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.INTEGER);
    }

    @Override
    public void exitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        if (ctx.prefixOperator().MINUS() != null || ctx.prefixOperator().PLUS() != null) {
            if (symbolTable.getType(ctx.expression().getText()) != null &&
                    !symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
                errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            }
            symbolTable.addVariable(ctx.getText(), Type.INTEGER);

        } else {
            assert(ctx.prefixOperator().NOT() != null);
            if (!symbolTable.getType(ctx.expression().getText()).equals(Type.BOOLEAN)) {
                errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            }
            symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

        }
    }

    @Override
    public void exitFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx) {
        if (!symbolTable.contains(ctx.IDENTIFIER().getText())) {
            errors.add(String.format("Error <function not defined> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void exitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        if (ctx.compareOperator().GE() != null || ctx.compareOperator().GT() != null ||
                ctx.compareOperator().LE() != null || ctx.compareOperator().LT() != null) {
            if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER) ||
                    !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER)) {
                errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            }
            symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

        } else {
            assert(ctx.compareOperator().EQ() != null || ctx.compareOperator().NE() != null);
            if (!symbolTable.getType(ctx.expression(0).getText()).equals(symbolTable.getType(ctx.expression(1).getText()))) {
                errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            }
            symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

        }
    }

    @Override public void exitArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx) {
        Type type = symbolTable.getType(ctx.IDENTIFIER().getText());
        if (type != null && !(type.equals(Type.BOOLEAN_ARRAY) || type.equals(Type.CHARACTER_ARRAY) ||
                type.equals(Type.INTEGER_ARRAY) || type.equals(Type.STRING_ARRAY))) {
            errors.add(String.format("Error <expected array> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }

        symbolTable.addType(ctx.getText(), Type.INTEGER);

    }

    @Override
    public void exitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        if ((symbolTable.getType(ctx.expression(0).getText()) != null &&
                !symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER) ||
                (symbolTable.getType(ctx.expression(1).getText()) != null &&
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER)))) {
            errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), Type.INTEGER);

    }

    @Override
    public void enterFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
    }

    @Override
    public void exitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx) {
        if (!symbolTable.contains(ctx.getText())) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }
    }

    public List<String> getErrors() {
        return errors;
    }
}

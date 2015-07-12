package tours.typechecker;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
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
            }
            symbolTable.addVariable(id, new Type(ctx.primitiveType().getText()));
            symbolTable.addVariable(ctx.getText(), new Type(ctx.primitiveType().getText()));

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
            }
            symbolTable.addVariable(id, new Type(ctx.arrayType().getText()));
            symbolTable.addVariable(ctx.getText(), new Type(ctx.arrayType().getText()));
        }

        Type arrayType = new Type(ctx.arrayType().getText());
        if (ctx.expression() != null ) {
            Type assignmentType = symbolTable.getType(ctx.expression().getText());
            // assignment
            if (!arrayType.equals(assignmentType)) {
                errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
            }
        }
    }

    @Override
    public void exitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        ToursParser.ExpressionContext leftHandExpression = ctx.expression(0);

        if (ctx.expression().size() > 1 && (!symbolTable.getType(leftHandExpression.getText()).equals(Type.INTEGER))) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", leftHandExpression.getStart().getLine(), leftHandExpression.getStart().getCharPositionInLine()));
        }

        Type type = symbolTable.getType(ctx.IDENTIFIER().getText());
        // if it is an array, remove the array part in the type of type[i]
        if (ctx.LBLOCK() != null) {
            type = new Type(type.toPrimitive());
        }

        String rightHandExpression = ctx.expression().get(ctx.expression().size() - 1).getText();
        Token assignmentSymbol = ctx.ASSIGNMENT().getSymbol();
        if (type == null) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", assignmentSymbol.getLine(), assignmentSymbol.getCharPositionInLine()));
        } else if (!type.equals(symbolTable.getType(rightHandExpression))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", assignmentSymbol.getLine(), assignmentSymbol.getCharPositionInLine()));
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
    public void exitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        String returnExpression = ctx.returnBlock().returnStatement().expression().getText();
        String identifier = ctx.IDENTIFIER(0).getText();

        if (!symbolTable.getType(identifier).equals(symbolTable.getType(returnExpression))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.returnBlock().getStart().getLine(), ctx.returnBlock().getStart().getCharPositionInLine()));
        }

        symbolTable.addVariable(ctx.getText(), symbolTable.getType(identifier));
        symbolTable.closeScope();
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
    public void exitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        if (symbolTable.getType(ctx.expression().getText()).toPrimitive() != null) {
            errors.add(String.format("Error <print not defined for array element> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        if (symbolTable.getType(ctx.IDENTIFIER().getText()).toPrimitive() != null) {
            errors.add(String.format("Error <input not defined for array element> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.IDENTIFIER().getText()));
    }

    @Override
    public void enterIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitInputStatement(@NotNull ToursParser.InputStatementContext ctx) {
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            Type type = symbolTable.getType(identifier.getText());

            if (type == null) {
                errors.add(String.format("Error <variable not defined> on line %s, pos %s", identifier.getSymbol().getLine(),  identifier.getSymbol().getCharPositionInLine()));
            }
            if (type != null && type.toPrimitive() != null) {
                errors.add(String.format("Error <input not defined for array element> on line %s, pos %s", identifier.getSymbol().getLine(), identifier.getSymbol().getCharPositionInLine()));
            }
        }

        symbolTable.addType(ctx.getText(), Type.VOID);
    }

    @Override
    public void exitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx) {
        for (ToursParser.ExpressionContext expression : ctx.expression()) {
            Type type = symbolTable.getType(expression.getText());

            if (type != null && type.toPrimitive() != null) {
                errors.add(String.format("Error <print not defined for array element> on line %s, pos %s", expression.getStart().getLine(), expression.getStart().getCharPositionInLine()));
            }
        }

        symbolTable.addType(ctx.getText(), Type.VOID);
    }

    @Override
    public void exitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        Type type = symbolTable.getType(ctx.expression().getText());
        if (!type.equals(Type.BOOLEAN)) {
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
        if (!type.equals(Type.BOOLEAN)) {
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
        if (!type.equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.closeScope();
    }

    @Override public void exitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitArrayElementExpression(@NotNull ToursParser.ArrayElementExpressionContext ctx) {
        if (!symbolTable.contains(ctx.IDENTIFIER().getText())) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        } else if (symbolTable.getType(ctx.IDENTIFIER().getText()).toArray() != null) {
            errors.add(String.format("Error <expected array> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        } else if(!symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        } else {
            symbolTable.addType(ctx.getText(), new Type(symbolTable.getType(ctx.IDENTIFIER().getText()).toPrimitive()));
        }
    }

    @Override
    public void exitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx) {
        Type type = symbolTable.getType(ctx.compound(0).getText());

        if (!type.equals(symbolTable.getType(ctx.compound(1).getText()))) {
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
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN) ||
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected booleans> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);

    }

    @Override public void enterCompound(@NotNull ToursParser.CompoundContext ctx) {
        symbolTable.openScope();
    }

    @Override public void exitCompound(@NotNull ToursParser.CompoundContext ctx) {
        ParseTree lastElement = ctx.getChild(ctx.getChildCount() - 3);
        Type type = symbolTable.getType(lastElement.getText());
        symbolTable.closeScope();

        if (type.equals(Type.VOID)) {
            errors.add(String.format("Error <last type is a void> on line %s, pos %s", ctx.RBRACE().getSymbol().getLine(), ctx.RBRACE().getSymbol().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), type);
    }

    @Override
    public void exitArrayInitializationExpression(@NotNull ToursParser.ArrayInitializationExpressionContext ctx) {
        Type expressionType = symbolTable.getType(ctx.expression(0).getText());

        for (int i = 1; i < ctx.expression().size(); i++) {
            if (!symbolTable.getType(ctx.expression(i).getText()).equals(expressionType)) {
                errors.add(String.format("Error <mismatching array types> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            }
        }

        symbolTable.addType(ctx.getText(), new Type(expressionType.toArray()));
    }

    @Override
    public void exitArrayNewExpression(@NotNull ToursParser.ArrayNewExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.addType(ctx.getText(), new Type(ctx.primitiveType().getText() + "[]"));
    }

    @Override
    public void exitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN) ||
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN)) {
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
            if (!symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
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
        symbolTable.addType(ctx.getText(), symbolTable.getType(ctx.IDENTIFIER().getText()));
    }

    @Override
    public void exitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        Type expression0Type = symbolTable.getType(ctx.expression(0).getText());
        Type expression1Type = symbolTable.getType(ctx.expression(0).getText());
        if (expression0Type.equals(Type.STRING) || expression1Type.equals(Type.STRING)) {
            errors.add(String.format("Error <compare not implemented for strings> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }

        if (expression0Type.toArray() == null || expression1Type.toArray() == null) {
            errors.add(String.format("Error <compare not implemented for arrays> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        }

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
        if (!(type.equals(Type.BOOLEAN_ARRAY) || type.equals(Type.CHARACTER_ARRAY) ||
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
    public void exitParenthesisExpression(@NotNull ToursParser.ParenthesisExpressionContext ctx) {
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

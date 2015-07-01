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
    public void enterBody(@NotNull ToursParser.BodyContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitBody(@NotNull ToursParser.BodyContext ctx) {
        symbolTable.closeScope();
    }

    @Override
    public void exitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx) {
        // declarations
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            String id = identifier.getText();
            if (symbolTable.containsInCurrentScope(id)) {
                errors.add(String.format("Error <variable already defined> on line %s, pos %s", identifier.getSymbol().getLine(), identifier.getSymbol().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(id, new Type(ctx.variableType().getStart().getType()));
                symbolTable.addVariable(ctx.getText(), new Type(ctx.variableType().getStart().getType()));
            }
        }

        // assignment
        if (ctx.expression() != null && !(new Type(ctx.variableType().getStart().getType())).equals(symbolTable.getType(ctx.expression().getText()))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void exitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String expression = ctx.expression().getText();

        if (symbolTable.getType(identifier) == null ) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        } else if (!symbolTable.getType(identifier).equals(symbolTable.getType(expression))) {
            errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(identifier));
    }

    @Override
    public void enterVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        Type returnType = Type.VOID;
        List<Type> argumentTypes = new ArrayList<>();

        for (int i = 0; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getStart().getType());
            argumentTypes.add(type);
            symbolTable.addVariable(ctx.IDENTIFIER(i + 1).getText(), type);
        }

        if (symbolTable.contains(ctx.IDENTIFIER(0).getText())) {
            errors.add(String.format("Error <function name already defined> on line %s, pos %s", ctx.IDENTIFIER(0).getSymbol().getLine(), ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine()));
        }

        symbolTable.addFunction(ctx.IDENTIFIER(0).getText(), returnType, argumentTypes);

        symbolTable.openScope();
    }

    @Override
    public void exitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        symbolTable.closeScope();
    }


    @Override
    public void enterReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        Type returnType = new Type(ctx.variableType(0).getStart().getType());
        List<Type> argumentTypes = new ArrayList<>();
    // TODO argumenten die meegegeven worden moeten in de nieuwe scope vallen
        for (int i = 1; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getStart().getType());
            argumentTypes.add(type);
            symbolTable.addVariable(ctx.IDENTIFIER(i).getText(), type);
        }

        if (symbolTable.contains(ctx.IDENTIFIER(0).getText())) {
            errors.add(String.format("Error <function name already defined> on line %s, pos %s", ctx.IDENTIFIER(0).getSymbol().getLine(), ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine()));
        }

        symbolTable.addFunction(ctx.IDENTIFIER(0).getText(), returnType, argumentTypes);
        symbolTable.openScope();
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
        if (!symbolTable.getType(ctx.expression().getText()).equals(Type.BOOLEAN)) {
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
        if (!symbolTable.getType(ctx.expression().getText()).equals(Type.BOOLEAN)) {
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
        if (!symbolTable.getType(ctx.expression().getText()).equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.closeScope();
    }

    @Override public void exitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }


    @Override
    public void exitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.STRING);
    }

    @Override
    public void exitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.CHARACTER);
    }

    @Override
    public void exitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
    }

    @Override
    public void exitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER) ||
               !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.addVariable(ctx.getText(), Type.INTEGER);
        }
    }

    @Override
    public void exitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN) ||
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected booleans> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
        }
    }

    @Override
    public void exitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.BOOLEAN) ||
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.BOOLEAN)) {
            errors.add(String.format("Error <expected booleans> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
        }
    }

    @Override
    public void exitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.INTEGER);
    }

    @Override
    public void exitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        if (ctx.prefixOperator().MINUS() != null || ctx.prefixOperator().PLUS() != null) {
            if (!symbolTable.getType(ctx.expression().getText()).equals(Type.INTEGER)) {
                errors.add(String.format("Error <expected integer> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(ctx.getText(), Type.INTEGER);
            }
        } else {
            assert(ctx.prefixOperator().NOT() != null);
            if (!symbolTable.getType(ctx.expression().getText()).equals(Type.BOOLEAN)) {
                errors.add(String.format("Error <expected boolean> on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
            }
        }
    }

    @Override
    public void enterCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        Type type = symbolTable.getType(ctx.getChild(ctx.getChildCount() - 3).getText());
        symbolTable.closeScope();
        symbolTable.addVariable(ctx.getText(), type);
    }

    @Override
    public void exitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        if (ctx.compareOperator().GE() != null || ctx.compareOperator().GT() != null ||
                ctx.compareOperator().LE() != null || ctx.compareOperator().LT() != null) {
            if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER) ||
                    !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER)) {
                errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
            }
        } else {
            assert(ctx.compareOperator().EQ() != null || ctx.compareOperator().NE() != null);
            if (!symbolTable.getType(ctx.expression(0).getText()).equals(symbolTable.getType(ctx.expression(1).getText()))) {
                errors.add(String.format("Error <mismatching types> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            } else {
                symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
            }
        }
    }

    @Override
    public void exitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        if (!symbolTable.getType(ctx.expression(0).getText()).equals(Type.INTEGER) ||
                !symbolTable.getType(ctx.expression(1).getText()).equals(Type.INTEGER)) {
            errors.add(String.format("Error <expected integers> on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.addVariable(ctx.getText(), Type.INTEGER);
        }
    }

    @Override
    public void enterFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        symbolTable.addVariable(ctx.getText(), Type.BOOLEAN);
    }

    @Override
    public void exitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        symbolTable.addVariable(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        if (!symbolTable.contains(ctx.getText())) {
            errors.add(String.format("Error <variable not defined> on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}

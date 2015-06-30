package tours.typechecker;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
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
    public void exitVariable(@NotNull ToursParser.VariableContext ctx) {
        // declarations
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            String id = identifier.getText();
            if (symbolTable.containsInCurrentScope(id)) {
                errors.add(String.format("Error on line %s, pos %s", identifier.getSymbol().getLine(), identifier.getSymbol().getCharPositionInLine()));
            } else {
                symbolTable.add(id, ctx.variableType().getStart().getType());
                symbolTable.add(ctx.getText(), ctx.variableType().getStart().getType());
            }
        }

        // assignment
        if (ctx.expression() != null && ctx.variableType().getStart().getType() != symbolTable.getType(ctx.expression().getText())) {
            errors.add(String.format("Error on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void enterBlock(@NotNull ToursParser.BlockContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitBlock(@NotNull ToursParser.BlockContext ctx) {
        symbolTable.closeScope();
    }

    @Override
    public void exitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String expression = ctx.expression().getText();

        if (symbolTable.getType(identifier) != symbolTable.getType(expression)) {
            errors.add(String.format("Error on line %s, pos %s", ctx.ASSIGNMENT().getSymbol().getLine(), ctx.ASSIGNMENT().getSymbol().getCharPositionInLine()));
        }
        symbolTable.add(ctx.getText(), symbolTable.getType(identifier));
    }

    @Override
    public void exitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        symbolTable.add(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        symbolTable.add(ctx.getText(), symbolTable.getType(ctx.IDENTIFIER().getText()));
    }

    @Override
    public void exitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        if (symbolTable.getType(ctx.expression().getText()) != ToursParser.BOOLEAN) {
            errors.add(String.format("Error on line %s, pos %s", ctx.LPAR().getSymbol().getLine(), ctx.LPAR().getSymbol().getCharPositionInLine()));
        }

    }

    @Override
    public void exitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        if (symbolTable.getType(ctx.expression().getText()) != ToursParser.BOOLEAN) {
            errors.add(String.format("Error on line %s, pos %s", ctx.LPAR().getSymbol().getLine(), ctx.LPAR().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void enterForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        if (symbolTable.getType(ctx.expression().getText()) != ToursParser.BOOLEAN) {
            errors.add(String.format("Error on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
        }
        symbolTable.closeScope();
    }


    @Override
    public void exitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        symbolTable.add(ctx.getText(), ToursParser.STRING);
    }

    @Override
    public void exitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        symbolTable.add(ctx.getText(), ToursParser.CHARACTER);
    }

    @Override
    public void exitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
    }

    @Override
    public void exitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        if (symbolTable.getType(ctx.expression(0).getText()) != ToursParser.INTEGER ||
                symbolTable.getType(ctx.expression(1).getText()) != ToursParser.INTEGER) {
            errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.add(ctx.getText(), ToursParser.INTEGER);
        }
    }

    @Override
    public void exitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        if (symbolTable.getType(ctx.expression(0).getText()) != ToursParser.BOOLEAN ||
                symbolTable.getType(ctx.expression(1).getText()) != ToursParser.BOOLEAN) {
            errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
        }
    }

    @Override
    public void exitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        if (symbolTable.getType(ctx.expression(0).getText()) != ToursParser.BOOLEAN ||
                symbolTable.getType(ctx.expression(1).getText()) != ToursParser.BOOLEAN) {
            errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
        }
    }

    @Override
    public void exitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx) {
        symbolTable.add(ctx.getText(), ToursParser.INTEGER);
    }

    @Override
    public void exitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        if (ctx.prefixOperator().MINUS() != null || ctx.prefixOperator().PLUS() != null) {
            if (symbolTable.getType(ctx.expression().getText()) != ToursParser.INTEGER) {
                errors.add(String.format("Error on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            } else {
                symbolTable.add(ctx.getText(), ToursParser.INTEGER);
            }
        } else {
            assert(ctx.prefixOperator().NOT() != null);
            if (symbolTable.getType(ctx.expression().getText()) != ToursParser.BOOLEAN) {
                errors.add(String.format("Error on line %s, pos %s", ctx.expression().getStart().getLine(), ctx.expression().getStart().getCharPositionInLine()));
            } else {
                symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
            }
        }
    }

    @Override
    public void enterCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        int type = symbolTable.getType(ctx.getChild(ctx.getChildCount() - 3).getText());
        symbolTable.closeScope();
        symbolTable.add(ctx.getText(), type);
    }

    @Override
    public void exitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        if (ctx.compareOperator().GE() != null || ctx.compareOperator().GT() != null ||
                ctx.compareOperator().LE() != null || ctx.compareOperator().LT() != null) {
            if (symbolTable.getType(ctx.expression(0).getText()) != ToursParser.INTEGER ||
                    symbolTable.getType(ctx.expression(1).getText()) != ToursParser.INTEGER) {
                errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            } else {
                symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
            }
        } else {
            assert(ctx.compareOperator().EQ() != null || ctx.compareOperator().NE() != null);
            if (symbolTable.getType(ctx.expression(0).getText()) != symbolTable.getType(ctx.expression(1).getText())) {
                errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
            } else {
                symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
            }
        }
    }

    @Override
    public void exitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        if (symbolTable.getType(ctx.expression(0).getText()) != ToursParser.INTEGER ||
                symbolTable.getType(ctx.expression(1).getText()) != ToursParser.INTEGER) {
            errors.add(String.format("Error on line %s, pos %s", ctx.expression(0).getStart().getLine(), ctx.expression(0).getStart().getCharPositionInLine()));
        } else {
            symbolTable.add(ctx.getText(), ToursParser.INTEGER);
        }
    }

    @Override
    public void enterFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        symbolTable.add(ctx.getText(), ToursParser.BOOLEAN);
    }

    @Override
    public void exitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        symbolTable.add(ctx.getText(), symbolTable.getType(ctx.expression().getText()));
    }

    @Override
    public void exitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        if (!symbolTable.contains(ctx.getText())) {
            errors.add(String.format("Error on line %s, pos %s", ctx.IDENTIFIER().getSymbol().getLine(),  ctx.IDENTIFIER().getSymbol().getCharPositionInLine()));
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}

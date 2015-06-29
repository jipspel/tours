package tours.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.FileUtils;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import tours.grammar.ToursBaseVisitor;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class Compiler extends ToursBaseVisitor<ST> {

    private final STGroup stGroup = new STGroupDir("src/main/java/tours/compiler/templates/");
    private String className;
    private List<String> identifiers;
    private Map<String, Type> types;

    public Compiler(String className) {
        this.className = className;
        identifiers = new ArrayList<>();
        types = new HashMap<>();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length == 0) {
            System.err.println("Usage: filename.tours [--execute]");
            System.exit(0);
        }

        String text = null;
        try {
            text = new String(readAllBytes(get(args[0])));
        } catch (IOException e) {
            System.err.println("Error reading file: " + args[0]);
        }

        System.out.println("<<<");
        System.out.println(CompilerTools.toByteCode(text));
        System.out.println(">>>");

        if (args.length == 2 && args[1].equals("--execute")) {
            new File("tmp/").mkdir();

            CompilerTools.toByteCode(text, "tmp/output.j");
            CompilerTools.compileByteCodeToClassFile("tmp/output.j", "tmp");
            System.out.println(CompilerTools.runClassFile("Tours", "tmp"));

            FileUtils.deleteDirectory(new File("tmp/"));
        }
    }

    public ST process(String text) {
        CharStream stream = new ANTLRInputStream(text);
        Lexer lexer = new ToursLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ToursParser parser = new ToursParser(tokens);
        ParseTree tree = parser.program();
        return visit(tree);
    }

    @Override
    public ST visitProgram(@NotNull ToursParser.ProgramContext ctx) {
        ST st = stGroup.getInstanceOf("program");
        st.add("class", className);
        st.add("locals_limit", 35);
        st.add("stack_limit", 35);
        st.add("body", visit(ctx.body()).render());
        return st;
    }

    public ST concatenate(@NotNull ParserRuleContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> blocks = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (visit(ctx.getChild(i)) != null) {
                blocks.add(visit(ctx.getChild(i)).render());
            }
        }
        st.add("blocks", blocks);
        return st;
    }

    @Override
    public ST visitBody(@NotNull ToursParser.BodyContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitVariableDeclaration(@NotNull ToursParser.VariableDeclarationContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitVariable(@NotNull ToursParser.VariableContext ctx) {
        return visitVariable(ctx, ctx.variableType().getText().toLowerCase());
    }

    public ST visitVariable(@NotNull ToursParser.VariableContext ctx, String type) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> stList = new ArrayList<>();
        if (ctx.expression() == null) {
            stList.add(stGroup.getInstanceOf(String.format("load_%s_0", type)).render());
        } else {
            stList.add(visit(ctx.expression()).render());
        }
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            identifiers.add(identifier.getText());
            types.put(identifier.getText(), new Type(ctx.variableType().getText()));
            ST stVariable = stGroup.getInstanceOf(String.format("variable_%s", type));
            stVariable.add("identifier_number", identifiers.indexOf(identifier.getText()));
            stList.add(stVariable.render());
        }
        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);
        return st;
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        return visitVariableAssignment(ctx, types.get(ctx.IDENTIFIER().getText()).toString());
    }

    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx, String type) {
        ST st = stGroup.getInstanceOf(String.format("assignment_%s", type));
        st.add("identifier_number", identifiers.indexOf(ctx.IDENTIFIER().getText()));
        st.add("expression", visit(ctx.expression()).render());
        return st;
    }

    @Override
    public ST visitFunction(@NotNull ToursParser.FunctionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitBlock(@NotNull ToursParser.BlockContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx) {
        return visit(ctx.variableAssignment());
    }

    @Override
    public ST visitInputStatement(@NotNull ToursParser.InputStatementContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx) {
        String block = visit(ctx.expression()).render();
        ST st = null;
        if (types.get(ctx.expression().getText()).equals(Type.STRING)) {
            st = stGroup.getInstanceOf("print_string");
        } else if (types.get(ctx.expression().getText()).equals(Type.INTEGER)){
            st = stGroup.getInstanceOf("print_integer");
        }
        st.add("block", block);
        return st;
    }

    @Override
    public ST visitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx) {
        ST st = stGroup.getInstanceOf("constant");
        st.add("text", ctx.getText());
        return st;
    }

    @Override
    public ST visitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        ST st = stGroup.getInstanceOf("constant");
        st.add("text", ctx.getText());
        types.put(ctx.getText(), Type.STRING);
        return st;
    }

    @Override
    public ST visitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        return visitIdentifierExpr(ctx, types.get(ctx.IDENTIFIER().getText()).toString());
    }

    public ST visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx, String type) {
        ST st = stGroup.getInstanceOf(String.format("load_%s_identifier", type));
        st.add("identifier_number", identifiers.indexOf(ctx.getText()));
        return st;
    }

    @Override
    public ST visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitPrefixOperator(@NotNull ToursParser.PrefixOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitMultiplyOperator(@NotNull ToursParser.MultiplyOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitPlusOperator(@NotNull ToursParser.PlusOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitIntType(@NotNull ToursParser.IntTypeContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitBoolType(@NotNull ToursParser.BoolTypeContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCharType(@NotNull ToursParser.CharTypeContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitStrType(@NotNull ToursParser.StrTypeContext ctx) {
        return concatenate(ctx);
    }
}

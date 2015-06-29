package tours.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
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
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class Compiler extends ToursBaseVisitor<ST> {

    private final STGroup stGroup = new STGroupDir("src/main/java/tours/compiler/templates/");
    private String className;

    public Compiler(String className) {
        this.className = className;
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
            System.err.println("Error reading file: "+ args[0]);
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
        return visitChildren(ctx);
    }

    @Override
    public ST visitVariable(@NotNull ToursParser.VariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitFunction(@NotNull ToursParser.FunctionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitBlock(@NotNull ToursParser.BlockContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitInputStatement(@NotNull ToursParser.InputStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx) {
        ST st = stGroup.getInstanceOf("print");
        st.add("text", ctx.expression().getText());
        return st;
    }

    @Override
    public ST visitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitPrefixOperator(@NotNull ToursParser.PrefixOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitMultiplyOperator(@NotNull ToursParser.MultiplyOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitPlusOperator(@NotNull ToursParser.PlusOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitIntType(@NotNull ToursParser.IntTypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitBoolType(@NotNull ToursParser.BoolTypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitCharType(@NotNull ToursParser.CharTypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ST visitStrType(@NotNull ToursParser.StrTypeContext ctx) {
        return visitChildren(ctx);
    }
}

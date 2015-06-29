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
    private int labelCount;
    private List<String> identifiers;
    private Map<String, Type> types;

    public Compiler(String className) {
        this.className = className;
        labelCount =0;
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

            CompilerTools.toByteCode(text, "./tmp/output.j");
            CompilerTools.compileByteCodeToClassFile("./tmp/output.j", "./tmp");
            System.out.println(CompilerTools.runClassFile("Tours", "./tmp"));

            FileUtils.deleteDirectory(new File("./tmp/"));
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

    public String getTypeClass(String type) {
        return type.equals(Type.STRING.toString()) ? Type.STRING.toString() : Type.INTEGER.toString();
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
        ST st = stGroup.getInstanceOf("concatenator");
        String type = ctx.variableType().getText().toLowerCase();
        String typeClass;
        List<String> stList = new ArrayList<>();

        if (ctx.expression() == null) {
            typeClass = type.equals(Type.STRING.toString()) ? "null" : "integer_0";
            stList.add(stGroup.getInstanceOf(String.format("load_%s", typeClass)).render());
        } else {
            stList.add(visit(ctx.expression()).render());
        }

        typeClass = getTypeClass(type);
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            identifiers.add(identifier.getText());
            types.put(identifier.getText(), new Type(ctx.variableType().getText()));

            ST stVariable = stGroup.getInstanceOf(String.format("variable_%s", typeClass));
            stVariable.add("identifier_number", identifiers.indexOf(identifier.getText()));
            stList.add(stVariable.render());
        }

        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);

        return st;
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        ST st = stGroup.getInstanceOf(String.format("assignment_%s", getTypeClass(types.get(ctx.IDENTIFIER().getText()).toString())));

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
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> expressions = new ArrayList<>();

        for (ToursParser.ExpressionContext expression : ctx.expression()) {
            String block = visit(expression).render();
            ST stExpression = stGroup.getInstanceOf(String.format("print_%s", types.get(expression.getText()).toString()));
            stExpression.add("block", block);
            expressions.add(stExpression.render());
        }

        st.add("blocks", expressions);

        return st;
    }

    @Override
    public ST visitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        ST st;
        String block = visit(ctx.expression()).render();
        st = stGroup.getInstanceOf(String.format("print_%s_dup", types.get(ctx.expression().getText()).toString()));
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
        types.put(ctx.getText(), Type.INTEGER);

        ST st = stGroup.getInstanceOf("bipush");
        st.add("text", ctx.getText());

        return st;
    }

    @Override
    public ST visitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        types.put(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_1");
    }

    @Override
    public ST visitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        types.put(ctx.getText(), Type.BOOLEAN);

        ST st = stGroup.getInstanceOf("ior");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        types.put(ctx.getText(), Type.INTEGER);

        ST st = ctx.multiplyOperator().STAR() != null ? stGroup.getInstanceOf("imul") :
                ctx.multiplyOperator().SLASH() != null ? stGroup.getInstanceOf("idiv")
                        : stGroup.getInstanceOf("irem");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        types.put(ctx.getText(), Type.STRING);

        ST st = stGroup.getInstanceOf("load_constant");
        st.add("text", ctx.getText());

        return st;
    }

    @Override
    public ST visitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        types.put(ctx.getText(), Type.BOOLEAN);

        String block = concatenate(ctx).render();
        labelCount++;
        ST st = null;
        if (ctx.compareOperator().LE() != null) {
            st = stGroup.getInstanceOf("le");
        } else if (ctx.compareOperator().LT() != null) {
            st = stGroup.getInstanceOf("lt");
        } else if (ctx.compareOperator().GE() != null) {
            st = stGroup.getInstanceOf("ge");
        } else if (ctx.compareOperator().GT() != null) {
            st = stGroup.getInstanceOf("gt");
        } else if (ctx.compareOperator().EQ() != null) {
            st = stGroup.getInstanceOf("eq");
        } else if (ctx.compareOperator().NE() != null) {
            st = stGroup.getInstanceOf("ne");
        }
        st.add("block", block);
        st.add("label_number", labelCount);
        return st;
    }

    @Override
    public ST visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        if (ctx.prefixOperator().MINUS() != null) {
            types.put(ctx.getText(), Type.INTEGER);
            ST st = stGroup.getInstanceOf("ineg");
            st.add("block", concatenate(ctx));
            return st;
        } else if (ctx.prefixOperator().PLUS() != null) {
            types.put(ctx.getText(), Type.INTEGER);
            return visit(ctx.expression());
        } else {
            types.put(ctx.getText(), Type.BOOLEAN);
            ST st = stGroup.getInstanceOf("not");
            st.add("block", concatenate(ctx));
            return st;
        }
    }

    @Override
    public ST visitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        ST st = stGroup.getInstanceOf("bipush");

        st.add("text", (int) ctx.getText().charAt(1));
        types.put(ctx.getText(), Type.CHARACTER);

        return st;
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        types.put(ctx.getText(), Type.INTEGER);

        ST st = ctx.plusOperator().MINUS() == null ? stGroup.getInstanceOf("iadd") : stGroup.getInstanceOf("isub");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        types.put(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_0");
    }

    @Override
    public ST visitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        String type = types.get(ctx.IDENTIFIER().getText()).toString();
        ST st = stGroup.getInstanceOf(String.format("load_identifier_%s", getTypeClass(type)));

        st.add("identifier_number", identifiers.indexOf(ctx.getText()));

        return st;
    }

    @Override
    public ST visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        types.put(ctx.getText(), Type.BOOLEAN);

        ST st = stGroup.getInstanceOf("iand");
        st.add("block", concatenate(ctx));
        return st;
    }

    public ST visitBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx) {
        return concatenate(ctx);
    }
}

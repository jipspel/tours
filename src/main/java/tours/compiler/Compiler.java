package tours.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.FileUtils;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import tours.SymbolTable;
import tours.Type;
import tours.grammar.ToursBaseVisitor;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class Compiler extends ToursBaseVisitor<ST> {
    private static final int SCANNER_LOCATION = 0;
    private final STGroup stGroup = new STGroupDir("src/main/java/tours/compiler/templates/");
    private String className;
    private int labelCount;
    private SymbolTable symbolTable;

    public Compiler(String className) {
        this.className = className;
        labelCount =0;
        symbolTable = new SymbolTable();
    }

    public static void main(String[] args) {
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

            String filename = "./tmp/output.j";
            String workingDirectory = "./tmp";
            try {
                CompilerTools.toByteCode(text, filename);
                CompilerTools.compileByteCodeToClassFile(filename, workingDirectory);
                System.out.println(CompilerTools.runClassFile("Tours", workingDirectory));

                FileUtils.deleteDirectory(new File(workingDirectory));
            } catch (NoSuchMethodException | InvocationTargetException | IOException | IllegalAccessException | ClassNotFoundException e) {
                System.out.println("Error compiling and running: " + filename);
                e.printStackTrace();
            }
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
        st.add("locals_limit", 100);
        st.add("stack_limit", 35);

        ST variables = stGroup.getInstanceOf("concatenator");
        List<String> header = new ArrayList<>();
        ctx.body().variableDeclaration().stream().forEach(variableDeclaration ->
                header.add(visit(variableDeclaration).render()));
        ctx.body().variableAssignment().stream().forEach(variableAssignment ->
                header.add(visit(variableAssignment).render()));
        st.add("header", header);

        List<String> functions = new ArrayList<>();
        for (ToursParser.FunctionContext function : ctx.body().function()) {
            if (function instanceof ToursParser.VoidFunctionContext &&
                    ((ToursParser.VoidFunctionContext) function).IDENTIFIER(0).getText().toLowerCase().equals("main")) {
                st.add("main", visit(function).render());
            } else {
                functions.add(visit(function).render());
            }
        }
        st.add("functions", functions);

        return st;
    }

    public ST concatenate(@NotNull ParserRuleContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> blocks = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ST child = visit(ctx.getChild(i));
            if (child != null) {
                blocks.add(child.render());
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
            symbolTable.addVariable(identifier.getText(), new Type(ctx.variableType().getText()));

            ST stVariable = stGroup.getInstanceOf(String.format("variable_%s", typeClass));
            stVariable.add("identifier_number", symbolTable.getIdentifier(identifier.getText()));
            stList.add(stVariable.render());
        }

        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);

        return st;
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        ST st = stGroup.getInstanceOf(String.format("assignment_%s", getTypeClass(symbolTable.getType(ctx.IDENTIFIER().getText()).toString())));

        st.add("identifier_number", symbolTable.getIdentifier(ctx.IDENTIFIER().getText()));
        st.add("expression", visit(ctx.expression()).render());

        return st;
    }

    @Override
    public ST visitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        Type returnType = Type.VOID;
        List<Type> argumentTypes = new ArrayList<>();
        Map<String, Type> variables = new HashMap<>();

        for (int i = 0; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getStart().getType());
            argumentTypes.add(type);
            variables.put(ctx.IDENTIFIER(i + 1).getText(), type);
        }

        symbolTable.addFunction(ctx.IDENTIFIER(0).getText(), returnType, argumentTypes);

        symbolTable.openScope();
        symbolTable.addVariables(variables);

        ST st;

        if (ctx.IDENTIFIER(0).getText().toLowerCase().equals("main")) {
            st = visitChildren(ctx);
        } else{
            st = stGroup.getInstanceOf("function");
            st.add("locals_limit", 35);
            st.add("stack_limit", 35);
            st.add("return_type", returnType.getJavaObjectType());
            st.add("function_name", ctx.IDENTIFIER(0).getText());

            List<String> arguments = argumentTypes.stream().map(Type::getJavaObjectType).collect(Collectors.toList());
            st.add("argument_types", arguments);
            st.add("block", Arrays.asList(visit(ctx.block()).render(), stGroup.getInstanceOf("return").render()));
        }

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {

        List<Type> argumentTypes = new ArrayList<>();
        Map<String, Type> variables = new HashMap<>();

        for (int i = 1; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getStart().getType());
            argumentTypes.add(type);
            variables.put(ctx.IDENTIFIER(i).getText(), type);
        }

        Type returnType = new Type(ctx.variableType(0).getStart().getType());
        symbolTable.addFunction(ctx.IDENTIFIER(0).getText(), returnType, argumentTypes);

        symbolTable.openScope();
        symbolTable.addVariables(variables);

        ST st;

        if (ctx.IDENTIFIER(0).getText().toLowerCase().equals("main")) {
            st = visitChildren(ctx);
        } else{
            st = stGroup.getInstanceOf("function");
            st.add("locals_limit", 35);
            st.add("stack_limit", 35);
            st.add("return_type", returnType.getJavaObjectType());
            st.add("function_name", ctx.IDENTIFIER(0).getText());

            List<String> arguments = argumentTypes.stream().map(Type::getJavaObjectType).collect(Collectors.toList());
            st.add("argument_types", arguments);
            st.add("block", visit(ctx.returnBlock()).render());
        }

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), symbolTable.getType(ctx.IDENTIFIER().getText()));

        ST st = stGroup.getInstanceOf("concatenator");
        String identifier = ctx.IDENTIFIER().getText();

        ST stInvokeFunction = stGroup.getInstanceOf("invokestatic");
        stInvokeFunction.add("class", className);
        stInvokeFunction.add("function_name", identifier);

        List<String> argumentTypes = symbolTable.getArgumentTypes(identifier)
                .stream().map(Type::getJavaObjectType).collect(Collectors.toList());
        stInvokeFunction.add("function_argument_types", argumentTypes);
        stInvokeFunction.add("function_type", symbolTable.getType(identifier).getJavaObjectType());

        List<String> expressions = new ArrayList<>();
        ctx.expression().stream().forEach(expression ->
                expressions.add(visit(expression).render()));
        st.add("blocks", Arrays.asList(expressions, stInvokeFunction.render()));

        return st;
    }

    @Override
    public ST visitBlock(@NotNull ToursParser.BlockContext ctx) {
        ST st = concatenate(ctx);
        return st;
    }

    @Override
    public ST visitReturnBlock(@NotNull ToursParser.ReturnBlockContext ctx) {
        ST st = concatenate(ctx);
        return st;
    }
    @Override
    public ST visitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx) {
        return visit(ctx.variableAssignment());
    }

    @Override
    public ST visitInputStatement(@NotNull ToursParser.InputStatementContext ctx) {
        List<String> stList = new ArrayList<>();
        ST st = stGroup.getInstanceOf(String.format("read_%s", symbolTable.getType(ctx.IDENTIFIER(0).getText()).toString()));
        st.add("reader_number", SCANNER_LOCATION);

        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            ST stVariable = stGroup.getInstanceOf(String.format("variable_%s",
                    getTypeClass(symbolTable.getType(identifier.getText()).toString())));
            stVariable.add("identifier_number", symbolTable.getIdentifier(identifier.getText()));

            stList.add(stVariable.render());
        }

        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);
        return st;
    }

    @Override
    public ST visitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        TerminalNode identifier = ctx.IDENTIFIER();
        ST st = stGroup.getInstanceOf(String.format("read_%s", symbolTable.getType(identifier.getText()).toString()));
        ST stVariable = stGroup.getInstanceOf(String.format("variable_%s", getTypeClass(symbolTable.getType(identifier.getText()).toString())));
        stVariable.add("identifier_number", symbolTable.getIdentifier(identifier.getText()));

        st.add("reader_number", SCANNER_LOCATION);
        st.add("blocks", stVariable.render());

        return st;
    }

    @Override
    public ST visitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> expressions = new ArrayList<>();

        for (ToursParser.ExpressionContext expression : ctx.expression()) {
            String block = visit(expression).render();
            ST stExpression;
            if (ctx.expression().size() > 1) {
                stExpression = stGroup.getInstanceOf("print");
            } else {
                stExpression = stGroup.getInstanceOf("print_dup");
            }
            stExpression.add("block", block);
            stExpression.add("type", symbolTable.getType(expression.getText()).getJavaObjectType());
            expressions.add(stExpression.render());
        }

        // for compound expressions, this pop will be removed, thus `dup` will remain
        // and the print statement can be assigned to a certain identifier
        if (ctx.expression().size() == 1) {
            expressions.add(stGroup.getInstanceOf("pop").render());
        }

        st.add("blocks", expressions);

        return st;
    }

    @Override
    public ST visitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        String block = visit(ctx.expression()).render();
        ST st = stGroup.getInstanceOf("print_dup");
        st.add("block", block);
        st.add("type",  symbolTable.getType(ctx.expression().getText()).getJavaObjectType());

        return st;
    }

    @Override
    public ST visitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        symbolTable.openScope();

        ST st;
        if (ctx.ELSE() == null) {
            st = stGroup.getInstanceOf("if");
            st.add("block_if", visit(ctx.block(0)).render());
        } else {
            st = stGroup.getInstanceOf("if_else");
            st.add("block_if", visit(ctx.block(0)).render());
            st.add("block_else", visit(ctx.block(1)).render());
        }
        labelCount++;

        st.add("expression", visit(ctx.expression()).render());
        st.add("label_number", labelCount);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("while");
        st.add("expression", visit(ctx.expression()).render());
        st.add("block_while", visit(ctx.block()).render());
        st.add("label_number", labelCount);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("for");
        labelCount++;
        st.add("label_number", labelCount);

        st.add("initialization", (ctx.variable() != null) ? visit(ctx.variable()).render() :
                (ctx.statement().size() == 2) ?
                        visit(ctx.statement(0)).render() : "");
        st.add("termination", visit(ctx.expression()).render());
        st.add("increment", visit(ctx.statement(ctx.statement().size() - 1)).render());
        st.add("block_for", visit(ctx.block()).render());

        symbolTable.closeScope();

        return st;
    }

    @Override
    public ST visitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");

        String expression = visit(ctx.expression()).render();
        String templateFile = symbolTable.getType(ctx.expression().getText()).equals(Type.STRING) ? "areturn" : "ireturn";

        st.add("blocks", Arrays.asList(expression, stGroup.getInstanceOf(templateFile).render()));

        return st;
    }

    @Override
    public ST visitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx) {
      symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = stGroup.getInstanceOf("bipush");
        st.add("text", ctx.getText());

        return st;
    }

    @Override
    public ST visitTrueExpr(@NotNull ToursParser.TrueExprContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_1");
    }

    @Override
    public ST visitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);

        ST st = stGroup.getInstanceOf("ior");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = ctx.multiplyOperator().STAR() != null ? stGroup.getInstanceOf("imul") :
                ctx.multiplyOperator().SLASH() != null ? stGroup.getInstanceOf("idiv")
                        : stGroup.getInstanceOf("irem");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitStringExpr(@NotNull ToursParser.StringExprContext ctx) {
        symbolTable.addType(ctx.getText(), Type.STRING);

        ST st = stGroup.getInstanceOf("load_constant");
        st.add("text", ctx.getText());

        return st;
    }

    @Override
    public ST visitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);

        String block = concatenate(ctx).render();
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
        labelCount++;
        st.add("block", block);
        st.add("label_number", labelCount);
        return st;
    }

    @Override
    public ST visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        if (ctx.prefixOperator().MINUS() != null) {
            symbolTable.addType(ctx.getText(), Type.INTEGER);
            ST st = stGroup.getInstanceOf("ineg");
            st.add("block", concatenate(ctx));
            return st;
        } else if (ctx.prefixOperator().PLUS() != null) {
            symbolTable.addType(ctx.getText(), Type.INTEGER);
            return visit(ctx.expression());
        } else {
            symbolTable.addType(ctx.getText(), Type.BOOLEAN);
            ST st = stGroup.getInstanceOf("not");
            st.add("block", concatenate(ctx));
            return st;
        }
    }

    @Override
    public ST visitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("concatenator");
        List<String> blocks = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            ST child = visit(ctx.getChild(i));
            if (child != null) {
                blocks.add(child.render());
            }
        }

        // for assignments the `pop` instruction is deleted
        // to return the last value as result
        String lastBlock = blocks.get(blocks.size() - 1);
        if (lastBlock.endsWith("pop")) {
            blocks.set(blocks.size() - 1, lastBlock.substring(0, lastBlock.lastIndexOf("pop")));
        }
        st.add("blocks", blocks);

        symbolTable.closeScope();

        return st;
    }

    @Override
    public ST visitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx) {
        symbolTable.addType(ctx.getText(), Type.CHARACTER);

        ST st = stGroup.getInstanceOf("bipush");
        st.add("text", (int) ctx.getText().charAt(1));

        return st;
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = ctx.plusOperator().MINUS() == null ? stGroup.getInstanceOf("iadd") : stGroup.getInstanceOf("isub");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitFalseExpr(@NotNull ToursParser.FalseExprContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_0");
    }

    @Override
    public ST visitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), symbolTable.getType(ctx.expression().getText()));

        return concatenate(ctx);
    }

    @Override
    public ST visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx) {
        String type = symbolTable.getType(ctx.IDENTIFIER().getText()).toString();
        ST st = stGroup.getInstanceOf(String.format("load_identifier_%s", getTypeClass(type)));

        st.add("identifier_number", symbolTable.getIdentifier(ctx.getText()));

        return st;
    }

    @Override
    public ST visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);

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

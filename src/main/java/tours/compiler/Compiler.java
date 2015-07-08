package tours.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.FileUtils;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import tours.SymbolTable;
import tours.SymbolTable.Function;
import tours.SymbolTable.Variable;
import tours.Type;
import tours.grammar.ToursBaseVisitor;
import tours.grammar.ToursParser;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Compiler extends ToursBaseVisitor<ST> {
    private static final int SCANNER_LOCATION = 0;
    private final STGroup stGroup = new STGroupDir("src/main/java/tours/compiler/templates/");
    private String className;
    private int labelCount;
    private SymbolTable symbolTable;

    public Compiler(String className) {
        this.className = className;
        labelCount = 0;
        symbolTable = new SymbolTable();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: filename.tours [--execute]");
            System.exit(0);
        }

        System.out.println("<<<");
        System.out.println(CompilerTools.toByteCode(args[0]));
        System.out.println(">>>");

        if (args.length == 2 && args[1].equals("--execute")) {
            new File("tmp/").mkdir();

            String filename = "./tmp/output.j";
            String workingDirectory = "./tmp";
            try {
                CompilerTools.toByteCode(args[0], filename);
                CompilerTools.compileByteCodeToClassFile(filename, workingDirectory);
                System.out.println(CompilerTools.runClassFile("Tours", workingDirectory));

                FileUtils.deleteDirectory(new File(workingDirectory));
            } catch (Throwable e) {
                System.err.println("Error compiling and running: " + filename);
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    public ST process(String filename) {
         return visit(CompilerTools.toToursParseTree(filename));
    }

    @Override
    public ST visitProgram(@NotNull ToursParser.ProgramContext ctx) {
        // TODO refactor
        // Listing all functions in symbol table
        for (ToursParser.VoidFunctionContext function : ctx.voidFunction()) {
            Type returnType = Type.VOID;
            List<Type> argumentTypes = new ArrayList<>();

            for (int i = 0; i < function.variableType().size(); i++) {
                ToursParser.VariableTypeContext variableType = function.variableType(i);
                Type type = new Type(variableType.arrayType() != null ?
                        variableType.arrayType().getText() : variableType.primitiveType().getText());
                argumentTypes.add(type);
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

            symbolTable.addFunction(function.IDENTIFIER(0).getText(), returnType, argumentTypes);
        }

        ST st = stGroup.getInstanceOf("program");
        st.add("class", className);

        List<String> functions = new ArrayList<>();
        functions.addAll(ctx.voidFunction().stream().map(function -> visit(function).render()).collect(Collectors.toList()));
        functions.addAll(ctx.returnFunction().stream().map(function -> visit(function).render()).collect(Collectors.toList()));

        st.add("functions", functions);
        st.add("main", visit(ctx.mainFunction()).render());

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
    public ST visitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        String type = ctx.primitiveType().getText().toLowerCase();
        String typeClass;
        List<String> stList = new ArrayList<>();

        if (ctx.expression() == null) {
            typeClass = type.equals(Type.STRING.toString()) ? "null" : "integer_0";
            stList.add(stGroup.getInstanceOf(String.format("load_%s", typeClass)).render());
        } else {
            stList.add(visit(ctx.expression()).render());
        }

        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            symbolTable.addVariable(identifier.getText(), new Type(type));

            ST stVariable = stGroup.getInstanceOf("store_variable");
            Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
            stVariable.add("store_type", variable.getType().getPrefix());
            stVariable.add("identifier_number", variable.getIdentifier());
            stList.add(stVariable.render());
        }

        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);

        return st;
    }

    @Override
    public ST visitVariableArray(@NotNull ToursParser.VariableArrayContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");

        ST stNewArray;
        if (ctx.expression() instanceof ToursParser.FunctionExpressionContext) {
            stNewArray = stGroup.getInstanceOf("new_array_function_initialisation");
        } else if (ctx.arrayType().getText().toLowerCase().equals(Type.STRING_ARRAY.toString())) {
            stNewArray = stGroup.getInstanceOf("new_array_string");
        } else {
            stNewArray = stGroup.getInstanceOf("new_array");
        }

        if (ctx.expression() instanceof ToursParser.ArrayInitialisationExpressionContext) {
            ST stExpression = stGroup.getInstanceOf("load_constant");
            stExpression.add("text", ((ToursParser.ArrayInitialisationExpressionContext) ctx.expression()).expression().size());
            stNewArray.add("expression", stExpression.render());
            stNewArray.add("initialisation", visit(ctx.expression()).render());
        } else if (ctx.expression() instanceof ToursParser.FunctionExpressionContext) {
            stNewArray.add("function_call", visit(ctx.expression()).render());
        } else{
                stNewArray.add("expression", visit(ctx.expression()).render());
                stNewArray.add("initialisation", "");
        }


        List<String> stList = new ArrayList<>();
        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            symbolTable.addVariable(identifier.getText(), new Type(ctx.arrayType().getText()));

            Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
            stNewArray.add("identifier_number", variable.getIdentifier());

            if (!(ctx.expression() instanceof  ToursParser.FunctionExpressionContext)) {
                stNewArray.add("array_type", variable.getType().getNewArrayType());
            }

            stList.add(stNewArray.render());
        }
        st.add("blocks", stList);

        return st;
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        ST st;

        // assignment of a primitive type
        if (ctx.LBLOCK() == null && symbolTable.getType(ctx.IDENTIFIER().getText()).getArrayType() != null) {
            st = stGroup.getInstanceOf(String.format("assignment_primitive"));

            Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
            st.add("identifier_number", variable.getIdentifier());
            st.add("expression", visit(ctx.expression(0)).render());
            st.add("store_type", variable.getType().getPrefix());
        } // assignment of array type
        else if(ctx.LBLOCK() == null && symbolTable.getType(ctx.IDENTIFIER().getText()).getArrayType() == null) {
            st = stGroup.getInstanceOf(String.format("assignment_array_with_function"));

            Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
            st.add("identifier_number", variable.getIdentifier());
            st.add("expressions", visit(ctx.expression(0)).render());
        } // assignment of element of array type
        else{
            st = stGroup.getInstanceOf(String.format("assignment_array_per_element"));

            Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
            st.add("identifier_number", variable.getIdentifier());
            st.add("expressions", Arrays.asList(visit(ctx.expression(0)).render(), visit(ctx.expression(1)).render()));

            Type type = variable.getType();
            st.add("store_type", type.getPrefix());
        }

        return st;
    }

    @Override
    public ST visitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        symbolTable.resetCount();
        symbolTable.openScope();

        Type returnType = Type.VOID;
        List<Type> argumentTypes = new ArrayList<>();
        Map<String, Type> variables = new HashMap<>();

        for (int i = 0; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getText());
            argumentTypes.add(type);
            variables.put(ctx.IDENTIFIER(i + 1).getText(), type);
        }

        symbolTable.addArgumentVariables(variables);

        ST st = stGroup.getInstanceOf("function");
        st.add("return_type", returnType.getJavaObjectType());
        st.add("function_name", ctx.IDENTIFIER(0).getText());

        List<String> arguments = argumentTypes.stream().map(Type::getJavaObjectType).collect(Collectors.toList());
        st.add("argument_types", arguments);
        st.add("block", Arrays.asList(visit(ctx.block()).render(), stGroup.getInstanceOf("return").render()));

        st.add("locals_limit", symbolTable.getIdentifierCount() + 1);
        st.add("stack_limit", 100);
        st.add("return", "return");


        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        symbolTable.resetCount();
        symbolTable.openScope();

        List<Type> argumentTypes = new ArrayList<>();
        Map<String, Type> variables = new HashMap<>();

        for (int i = 1; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getText());
            argumentTypes.add(type);
            variables.put(ctx.IDENTIFIER(i).getText(), type);
        }

        Type returnType = new Type(ctx.variableType(0).getText());

        symbolTable.addArgumentVariables(variables);

        ST st = stGroup.getInstanceOf("function");
        st.add("return_type", returnType.getJavaObjectType());
        st.add("function_name", ctx.IDENTIFIER(0).getText());

        List<String> arguments = argumentTypes.stream().map(Type::getJavaObjectType).collect(Collectors.toList());
        st.add("argument_types", arguments);
        st.add("block", visit(ctx.returnBlock()).render());

        st.add("locals_limit", symbolTable.getIdentifierCount() + 100);
        st.add("stack_limit", 100);

        // TODO test bouwen
        String returnString = returnType.equals(Type.BOOLEAN) ||
                returnType.equals(Type.CHARACTER) ||
                returnType.equals(Type.INTEGER)
                ? "ireturn" : "areturn";
        st.add("return", returnString);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitMainFunction(@NotNull ToursParser.MainFunctionContext ctx) {
        symbolTable.resetCount();
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("function");
        st.add("return_type", "V");
        st.add("function_name", "main");

        st.add("argument_types", "[Ljava/lang/String;");
        st.add("block", visit(ctx.block()).render());

        st.add("locals_limit", symbolTable.getIdentifierCount() + 1);
        st.add("stack_limit", 100);

        st.add("return", "return");
        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx) {
        symbolTable.openScope();

        ST st;
        if (ctx.compound().size() == 2) {
            st = stGroup.getInstanceOf("if_else");
            st.add("block_if", visit(ctx.compound(0)).render());
            st.add("block_else", visit(ctx.compound(1)).render());
        } else {
            st = stGroup.getInstanceOf("if");
            st.add("block_if", visit(ctx.compound(0)).render());
        }

        labelCount++;

        st.add("expression", visit(ctx.expression()).render());
        st.add("label_number", labelCount);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx) {
        Function function = (Function) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
        symbolTable.addType(ctx.getText(), function.getType());

        ST st = stGroup.getInstanceOf("concatenator");
        String identifier = ctx.IDENTIFIER().getText();

        ST stInvokeFunction = stGroup.getInstanceOf("invokestatic");
        stInvokeFunction.add("class", className);
        stInvokeFunction.add("function_name", identifier);

        List<String> argumentTypes = function.getArgumentTypes()
                .stream().map(Type::getJavaObjectType).collect(Collectors.toList());
        stInvokeFunction.add("function_argument_types", argumentTypes);
        stInvokeFunction.add("function_type", function.getType().getJavaObjectType());

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
        ST st = stGroup.getInstanceOf(String.format("read_%s", symbolTable.getSymbol(ctx.IDENTIFIER(0).getText()).getType().toString()));
        st.add("reader_number", SCANNER_LOCATION);

        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
            ST stVariable = stGroup.getInstanceOf("store_variable");
            stVariable.add("store_type", variable.getType().getPrefix());
            stVariable.add("identifier_number", variable.getIdentifier());

            stList.add(stVariable.render());
        }

        stList.add(stGroup.getInstanceOf("pop").render());
        st.add("blocks", stList);
        return st;
    }

    @Override
    public ST visitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());

        ST st = stGroup.getInstanceOf(String.format("read_%s", variable.getType().toString()));
        ST stVariable = stGroup.getInstanceOf("store_variable");
        stVariable.add("store_type", variable.getType().getPrefix());
        stVariable.add("identifier_number", variable.getIdentifier());

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
            stExpression.add("type", symbolTable.getSymbol(expression.getText()).getType().getJavaObjectType());
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
        st.add("type", symbolTable.getSymbol(ctx.expression().getText()).getType().getJavaObjectType());

        return st;
    }

    @Override
    public ST visitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        symbolTable.openScope();

        ST st;
        if (ctx.ELSE() == null) {
            st = stGroup.getInstanceOf("if");
            String block_if = visit(ctx.compound(0)).render() + "\n" +
                    stGroup.getInstanceOf("pop").render();
            st.add("block_if", block_if);
        } else {
            st = stGroup.getInstanceOf("if_else");
            String block_if = visit(ctx.compound(0)).render() + "\n" +
                    stGroup.getInstanceOf("pop").render();
            st.add("block_if", block_if);
            String block_else = visit(ctx.compound(1)).render() + "\n" +
                    stGroup.getInstanceOf("pop").render();
            st.add("block_else", block_else);
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
        st.add("block_while", visit(ctx.compound()).render());
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
        st.add("block_for", visit(ctx.compound()).render());

        symbolTable.closeScope();

        return st;
    }

    @Override
    public ST visitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ST visitIntegerExpression(@NotNull ToursParser.IntegerExpressionContext ctx) {
      symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = stGroup.getInstanceOf("load_constant");
        st.add("text", ctx.getText());

        return st;
    }

    @Override
    public ST visitArrayElementExpression(@NotNull ToursParser.ArrayElementExpressionContext ctx) {
        ST st = stGroup.getInstanceOf("load_array_entry");
        Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
        st.add("identifier_number", variable.getIdentifier());
        st.add("expression", visit(ctx.expression()).render());

        Type arrayType = variable.getType();
        Type primitiveType = new Type(arrayType.getPrimitiveType());
        st.add("load_type", arrayType.getPrefix());
        symbolTable.addType(ctx.getText(), primitiveType);

        return st;
    }

    @Override
    public ST visitTrueExpression(@NotNull ToursParser.TrueExpressionContext ctx) {
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
    public ST visitStringExpression(@NotNull ToursParser.StringExpressionContext ctx) {
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

        ST st = visit(ctx.compound());

        symbolTable.closeScope();

        return st;
    }

    @Override
    public ST visitCompound(@NotNull ToursParser.CompoundContext ctx) {
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
        return st;
    }

    @Override
    public ST visitCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.CHARACTER);

        ST st = stGroup.getInstanceOf("load_constant");
        st.add("text", (int) ctx.getText().charAt(1));

        return st;
    }

    @Override
    public ST visitArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx) {
        ST st = stGroup.getInstanceOf("array_length");
        st.add("identifier_number", ((Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText())).getIdentifier());

        symbolTable.addType(ctx.getText(), Type.INTEGER);
        return st;
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        System.out.println(ctx.getText());
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = ctx.plusOperator().MINUS() == null ? stGroup.getInstanceOf("iadd") : stGroup.getInstanceOf("isub");
        st.add("block", concatenate(ctx));
        return st;
    }

    @Override
    public ST visitFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_0");
    }

    @Override
    public ST visitParExpression(@NotNull ToursParser.ParExpressionContext ctx) {
        visit(ctx.expression());
        symbolTable.addType(ctx.getText(), symbolTable.getSymbol(ctx.expression().getText()).getType());

        return concatenate(ctx);
    }

    @Override
    public ST visitIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx) {
        Type type = symbolTable.getSymbol(ctx.IDENTIFIER().getText()).getType();
        ST st = stGroup.getInstanceOf("load_identifier");

        if (type.getArrayType() == null) {
            st.add("load_type", "a");
        } else {
            st.add("load_type", type.getPrefix());
        }

        st.add("identifier_number", ((Variable) symbolTable.getSymbol(ctx.getText())).getIdentifier());

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

    @Override
    public ST visitArrayInitialisationExpression(@NotNull ToursParser.ArrayInitialisationExpressionContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");

        List<String> expressions = new ArrayList<>();

        for (int i = 0; i < ctx.expression().size(); i++) {
            ST stExpression = stGroup.getInstanceOf("assignment_array_initialisation");
            stExpression.add("index", i);
            stExpression.add("expressions", visit(ctx.expression(i)).render());
            Type type = new Type(symbolTable.getSymbol(ctx.expression(i).getText()).getType().getArrayType());
            stExpression.add("store_type", type.getPrefix());
            expressions.add(stExpression.render());
        }

        st.add("blocks", expressions);
        return st;
    }

    @Override
    public ST visitArrayNewExpression(@NotNull ToursParser.ArrayNewExpressionContext ctx) {
        return visit(ctx.expression());
    }

}

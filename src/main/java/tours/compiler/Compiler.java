package tours.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
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
import tours.typechecker.TypeChecker;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compiler extends ToursBaseVisitor<ST> {
    private static final int SCANNER_LOCATION = 0;
    private static final int BASIC_STACK_SIZE = 4; // initializing an array requires four items on stack

    private final STGroup stGroup = new STGroupDir("src/main/java/tours/compiler/templates/");
    private final String className;

    private int labelCount;
    private int maxArgumentCount;
    private SymbolTable symbolTable;

    public Compiler(String className) {
        this.className = className;
        labelCount = 0;
        maxArgumentCount = 0;
        symbolTable = new SymbolTable();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: filename.tours [--execute --no-bytecode] [--save directory]");
            System.exit(0);
        }

        TypeChecker typeChecker = CompilerTools.typeCheck(args[0]);
        if (typeChecker.getErrors().size() > 0) {
            System.err.println("Error typechecking: " + args[0]);
            System.err.println(typeChecker.getErrors());
            System.exit(1);
        }

        boolean execute = false;
        boolean save = false;
        boolean noByteCode = false;
        if (args.length >= 2 && args[1].equals("--execute")) {
            execute = true;

            if (args.length >= 3 && args[2].equals("--no-bytecode")) {
                noByteCode = true;
            }
        }
        if (args.length >= 3 && args[1].equals("--save")) {
            save = true;
        }

        if (!noByteCode) {
            System.out.println("<<<");
            System.out.println(CompilerTools.toByteCode(args[0]));
            System.out.println(">>>");
        }

        if (execute || save) {
            String filename = "./tmp/output.j";
            String workingDirectory = "./tmp";
            String outputDirectory = workingDirectory;

            if (save) {
                outputDirectory = args[2];
            }

            new File(workingDirectory).mkdir();

            try {
                CompilerTools.toByteCode(args[0], filename);
                CompilerTools.compileByteCodeToClassFile(filename, outputDirectory);
                if (execute) {
                    System.out.println(CompilerTools.runClassFile("Tours", outputDirectory));
                }

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
        ctx.voidFunction().stream().forEach(function -> {
            Type returnType = Type.VOID;
            List<Type> argumentTypes = new ArrayList<>();

            function.variableType().stream().forEach(variableType -> {
                Type type = new Type(variableType.arrayType() != null ?
                        variableType.arrayType().getText() :
                        variableType.primitiveType().getText());
                argumentTypes.add(type);
            });
            maxArgumentCount = Math.max(maxArgumentCount, argumentTypes.size());
            symbolTable.addFunction(function.IDENTIFIER(0).getText(), returnType, argumentTypes);
        });

        ctx.returnFunction().stream().forEach(function -> {
            Type returnType = new Type((function.variableType(0).arrayType() != null ?
                    function.variableType(0).arrayType().getText() :
                    function.variableType(0).primitiveType().getText()));
            List<Type> argumentTypes = new ArrayList<>();

            function.variableType().stream().forEach(variableType -> {
                if (variableType == function.variableType(0)) { return; }
                Type type = new Type(variableType.arrayType() != null ?
                        variableType.arrayType().getText() : variableType.primitiveType().getText());
                argumentTypes.add(type);
            });
            maxArgumentCount = Math.max(maxArgumentCount, argumentTypes.size());
            symbolTable.addFunction(function.IDENTIFIER(0).getText(), returnType, argumentTypes);
        });

        ST st = stGroup.getInstanceOf("program");
        st.add("class", className);

        List<String> functions = new ArrayList<>();
        functions.addAll(ctx.voidFunction().stream().map(function -> visit(function).render()).collect(Collectors.toList()));
        functions.addAll(ctx.returnFunction().stream().map(function -> visit(function).render()).collect(Collectors.toList()));

        st.add("functions", functions);
        return st.add("main", visit(ctx.mainFunction()).render());
    }

    /**
     * Concatenates string templates after visiting its children
     * @param ctx context whose children are concatenated
     * @return string template
     */
    public ST concatenate(@NotNull ParserRuleContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> blocks = new ArrayList<>();
        ctx.children.stream().forEach(child -> {
            ST stChild = visit(child);
            if (stChild != null) {
                blocks.add(stChild.render());
            }
        });

        return st.add("blocks", blocks);
    }

    @Override
    public ST visitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        String type = ctx.primitiveType().getText().toLowerCase();
        List<String> stList = new ArrayList<>();

        if (ctx.expression() == null) {
            String filename = String.format("load_%s", type.equals(Type.STRING.toString()) ? "null" : "integer_0");
            stList.add(stGroup.getInstanceOf(filename).render());
        } else {
            stList.add(visit(ctx.expression()).render());
        }

        ctx.IDENTIFIER().stream().forEach(identifier -> {
            symbolTable.addVariable(identifier.getText(), new Type(type));

            ST stVariable = stGroup.getInstanceOf("store_variable");
            Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
            stVariable.add("store_type", variable.getType().javaByteCodePrefix());
            stVariable.add("identifier_number", variable.getIdentifier());
            stList.add(stVariable.render());
        });

        stList.add(stGroup.getInstanceOf("pop").render());
        return st.add("blocks", stList);
    }

    @Override
    public ST visitVariableArray(@NotNull ToursParser.VariableArrayContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");

        ToursParser.ExpressionContext expression = ctx.expression();

        ST stNewArray = null;
        if (expression instanceof ToursParser.FunctionExpressionContext) {
            stNewArray = stGroup.getInstanceOf("new_array_function_initialisation");
            stNewArray.add("function_call", visit(expression).render());
        } else if (expression != null) {
            stNewArray = visit(expression);
        }

        List<String> stList = new ArrayList<>();
        if (ctx.expression() != null){
            stList.add(stNewArray.render());
        }

        ctx.IDENTIFIER().stream().forEach(identifier -> {
            symbolTable.addVariable(identifier.getText(), new Type(ctx.arrayType().getText()));

            if (expression != null) {
                ST stStore = stGroup.getInstanceOf("store_array");
                Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
                stStore.add("identifier_number", variable.getIdentifier());

                stList.add(stStore.render());
            }
        });

        if (expression!= null) {
            stList.add(stGroup.getInstanceOf("pop").render());
        }
        return st.add("blocks", stList);
    }

    @Override
    public ST visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx) {
        ST st;

        if (ctx.LBLOCK() == null) {
            if (symbolTable.getType(ctx.IDENTIFIER().getText()).toArray() != null) {
                // assignment of a primitive type
                st = stGroup.getInstanceOf("assignment_primitive");

                Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
                st.add("identifier_number", variable.getIdentifier());
                st.add("expression", visit(ctx.expression(0)).render());
                st.add("store_type", variable.getType().javaByteCodePrefix());
            } else {
                // assignment of array type
                Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
                st = stGroup.getInstanceOf("concatenator");

                List<String> stList = new ArrayList<>();
                if (ctx.expression(0) instanceof ToursParser.FunctionExpressionContext) {
                    ST stArray = stGroup.getInstanceOf("new_array_function_initialisation");
                    stArray.add("function_call", visit(ctx.expression(0)).render());
                    stList.add(stArray.render());
                } else {
                    stList.add(visit(ctx.expression(0)).render());
                }

                ST stStore = stGroup.getInstanceOf("store_array");
                stStore.add("identifier_number", variable.getIdentifier());
                stList.add(stStore.render());
                stList.add(stGroup.getInstanceOf("pop").render());

                st.add("blocks", stList);
            }
        } else {
            // assignment of element of array type
            st = stGroup.getInstanceOf("assignment_array_per_element");

            Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
            st.add("identifier_number", variable.getIdentifier());
            st.add("expressions", Arrays.asList(visit(ctx.expression(0)).render(), visit(ctx.expression(1)).render()));

            Type type = variable.getType();
            st.add("store_type", type.javaByteCodePrefix());
        }

        return st;
    }

    @Override
    public ST visitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx) {
        symbolTable.resetCount();
        symbolTable.openScope();

        Type returnType = Type.VOID;
        List<Type> argumentTypes = new ArrayList<>();

        for (int i = 0; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getText());
            argumentTypes.add(type);
            symbolTable.addVariable(ctx.IDENTIFIER().get(i + 1).getText(), type);
        }

        ST st = stGroup.getInstanceOf("function");
        st.add("return_type", returnType.getJavaByteCodeType());
        st.add("function_name", ctx.IDENTIFIER(0).getText());

        List<String> arguments = argumentTypes.stream().map(Type::getJavaByteCodeType).collect(Collectors.toList());
        st.add("argument_types", arguments);
        st.add("block", visit(ctx.block()).render());

        st.add("locals_limit", symbolTable.getIdentifierCount());
        st.add("stack_limit", getStackLimit());
        st.add("return", "return");

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx) {
        symbolTable.resetCount();
        symbolTable.openScope();

        List<Type> argumentTypes = new ArrayList<>();

        for (int i = 1; i < ctx.variableType().size(); i++) {
            Type type = new Type(ctx.variableType(i).getText());
            argumentTypes.add(type);
            symbolTable.addVariable(ctx.IDENTIFIER(i).getText(), type);
        }

        Type returnType = new Type(ctx.variableType(0).getText());

        ST st = stGroup.getInstanceOf("function");
        st.add("return_type", returnType.getJavaByteCodeType());
        st.add("function_name", ctx.IDENTIFIER(0).getText());

        List<String> arguments = argumentTypes.stream().map(Type::getJavaByteCodeType).collect(Collectors.toList());
        st.add("argument_types", arguments);
        st.add("block", visit(ctx.returnBlock()).render());

        st.add("locals_limit", symbolTable.getIdentifierCount());
        st.add("stack_limit", getStackLimit());

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

        st.add("locals_limit", symbolTable.getIdentifierCount());
        st.add("stack_limit", getStackLimit());

        st.add("return", "return");
        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("if_else_expression");
        st.add("block_if", visit(ctx.compound(0)).render());
        st.add("block_else", visit(ctx.compound(1)).render());

        st.add("expression", visit(ctx.expression()).render());
        st.add("label_number", labelCount++);

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
                .stream().map(Type::getJavaByteCodeType).collect(Collectors.toList());
        stInvokeFunction.add("function_argument_types", argumentTypes);
        stInvokeFunction.add("function_type", function.getType().getJavaByteCodeType());

        List<String> expressions = new ArrayList<>();
        ctx.expression().stream().forEach(expression ->
                expressions.add(visit(expression).render()));

        return st.add("blocks", Arrays.asList(expressions, stInvokeFunction.render()));
    }

    @Override
    public ST visitBlock(@NotNull ToursParser.BlockContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitReturnBlock(@NotNull ToursParser.ReturnBlockContext ctx) {
        return concatenate(ctx);
    }
    @Override
    public ST visitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx) {
        return visit(ctx.variableAssignment());
    }

    @Override
    public ST visitInputStatement(@NotNull ToursParser.InputStatementContext ctx) {
        String filename = String.format("read_%s", symbolTable.getSymbol(ctx.IDENTIFIER(0).getText()).getType().toString());
        ST st = stGroup.getInstanceOf(filename);
        st.add("reader_number", SCANNER_LOCATION);

        List<String> stList = new ArrayList<>();
        ctx.IDENTIFIER().stream().forEach(identifier -> {
            Variable variable = (Variable) symbolTable.getSymbol(identifier.getText());
            ST stVariable = stGroup.getInstanceOf("store_variable");
            stVariable.add("store_type", variable.getType().javaByteCodePrefix());
            stVariable.add("identifier_number", variable.getIdentifier());

            stList.add(stVariable.render());
        });

        stList.add(stGroup.getInstanceOf("pop").render());
        return st.add("blocks", stList);
    }

    @Override
    public ST visitInputExpression(@NotNull ToursParser.InputExpressionContext ctx) {
        Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());

        ST st = stGroup.getInstanceOf(String.format("read_%s", variable.getType().toString()));
        ST stVariable = stGroup.getInstanceOf("store_variable");
        stVariable.add("store_type", variable.getType().javaByteCodePrefix());
        stVariable.add("identifier_number", variable.getIdentifier());

        st.add("reader_number", SCANNER_LOCATION);
        return st.add("blocks", stVariable.render());
    }

    @Override
    public ST visitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx) {
        ST st = stGroup.getInstanceOf("concatenator");
        List<String> expressions = new ArrayList<>();

        ctx.expression().stream().forEach(expression -> {
            String block = visit(expression).render();
            ST stExpression;
            if (ctx.expression().size() > 1) {
                stExpression = stGroup.getInstanceOf("print");
            } else {
                stExpression = stGroup.getInstanceOf("print_dup");
            }
            stExpression.add("block", block);
            stExpression.add("type", symbolTable.getSymbol(expression.getText()).getType().getJavaByteCodeType());

            expressions.add(stExpression.render());
        });

        // for compound expressions, this pop will be removed, thus `dup` will remain
        // and the print statement can be assigned to a certain identifier
        if (ctx.expression().size() == 1) {
            expressions.add(stGroup.getInstanceOf("pop").render());
        }

        return st.add("blocks", expressions);
    }

    @Override
    public ST visitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx) {
        String block = visit(ctx.expression()).render();
        ST st = stGroup.getInstanceOf("print_dup");
        st.add("block", block);
        return st.add("type", symbolTable.getSymbol(ctx.expression().getText()).getType().getJavaByteCodeType());
    }

    @Override
    public ST visitIfStatement(@NotNull ToursParser.IfStatementContext ctx) {
        symbolTable.openScope();

        ST st;
        if (ctx.ELSE() != null) {
            st = stGroup.getInstanceOf("if_else_statement");
            String block_if = visit(ctx.compound(0)).render();
            st.add("block_if", block_if);
            String block_else = visit(ctx.compound(1)).render();
            st.add("block_else", block_else);
        } else {
            st = stGroup.getInstanceOf("if");
            String block_if = visit(ctx.compound(0)).render();
            st.add("block_if", block_if);
        }

        st.add("expression", visit(ctx.expression()).render());
        st.add("label_number", labelCount++);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("while");
        st.add("expression", visit(ctx.expression()).render());
        st.add("block_while", visit(ctx.compound()).render());
        st.add("label_number", labelCount++);

        symbolTable.closeScope();
        return st;
    }

    @Override
    public ST visitForStatement(@NotNull ToursParser.ForStatementContext ctx) {
        symbolTable.openScope();

        ST st = stGroup.getInstanceOf("for");
        st.add("label_number", labelCount++);

        st.add("initialization", (ctx.variable() != null) ? visit(ctx.variable()).render() :
                (ctx.statement() != null) ?
                        visit(ctx.statement()).render() : "");
        st.add("termination", visit(ctx.expression()).render());
        st.add("increment", visit(ctx.variableAssignment()).render());
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
        return st.add("text", ctx.getText());
    }

    @Override
    public ST visitArrayElementExpression(@NotNull ToursParser.ArrayElementExpressionContext ctx) {
        ST st = stGroup.getInstanceOf("load_array_entry");
        Variable variable = (Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText());
        st.add("identifier_number", variable.getIdentifier());
        st.add("expression", visit(ctx.expression()).render());

        Type arrayType = variable.getType();
        Type primitiveType = new Type(arrayType.toPrimitive());
        symbolTable.addType(ctx.getText(), primitiveType);

        return st.add("load_type", arrayType.javaByteCodePrefix());
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
        return st.add("block", concatenate(ctx));
    }

    @Override
    public ST visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = ctx.multiplyOperator().STAR() != null ? stGroup.getInstanceOf("imul") :
                ctx.multiplyOperator().SLASH() != null ? stGroup.getInstanceOf("idiv")
                        : stGroup.getInstanceOf("irem");
        return st.add("block", concatenate(ctx));
    }

    @Override
    public ST visitStringExpression(@NotNull ToursParser.StringExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.STRING);

        ST st = stGroup.getInstanceOf("load_constant");
        return st.add("text", ctx.getText());
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
        } else {
            st = stGroup.getInstanceOf("ne");
        }
        st.add("block", block);
        return st.add("label_number", labelCount++);
    }

    @Override
    public ST visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx) {
        ST st;
        if (ctx.prefixOperator().MINUS() != null) {
            symbolTable.addType(ctx.getText(), Type.INTEGER);
            st = stGroup.getInstanceOf("ineg");
            st.add("block", concatenate(ctx));
        } else if (ctx.prefixOperator().PLUS() != null) {
            symbolTable.addType(ctx.getText(), Type.INTEGER);
            st = visit(ctx.expression());
        } else {
            symbolTable.addType(ctx.getText(), Type.BOOLEAN);
            st = stGroup.getInstanceOf("not");
            st.add("block", concatenate(ctx));
        }
        return st;
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
        ctx.children.stream().forEach(child -> {
            ST stChild = visit(child);
            if (stChild != null) {
                blocks.add(stChild.render());
            }
        });

        // for assignments the `pop` instruction is deleted
        // to return the last value as result
        String lastBlock = blocks.get(blocks.size() - 1);
        if (lastBlock.endsWith("pop")) {
            blocks.set(blocks.size() - 1, lastBlock.substring(0, lastBlock.lastIndexOf("pop")));
        }
        return st.add("blocks", blocks);
    }

    @Override
    public ST visitCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.CHARACTER);

        ST st = stGroup.getInstanceOf("load_constant");
        return st.add("text", (int) ctx.getText().charAt(1));
    }

    @Override
    public ST visitArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = stGroup.getInstanceOf("array_length");
        return st.add("identifier_number", ((Variable) symbolTable.getSymbol(ctx.IDENTIFIER().getText())).getIdentifier());
    }

    @Override
    public ST visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.INTEGER);

        ST st = ctx.plusOperator().MINUS() == null ? stGroup.getInstanceOf("iadd") : stGroup.getInstanceOf("isub");
        return st.add("block", concatenate(ctx));
    }

    @Override
    public ST visitFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);
        return stGroup.getInstanceOf("load_integer_0");
    }

    @Override
    public ST visitParenthesisExpression(@NotNull ToursParser.ParenthesisExpressionContext ctx) {
        visit(ctx.expression());
        symbolTable.addType(ctx.getText(), symbolTable.getSymbol(ctx.expression().getText()).getType());

        return concatenate(ctx);
    }

    @Override
    public ST visitIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx) {
        Type type = symbolTable.getSymbol(ctx.IDENTIFIER().getText()).getType();
        ST st = stGroup.getInstanceOf("load_identifier");

        if (type.toArray() != null) {
            st.add("load_type", type.javaByteCodePrefix());
        } else {
            st.add("load_type", "a");
        }

        return st.add("identifier_number", ((Variable) symbolTable.getSymbol(ctx.getText())).getIdentifier());
    }

    @Override
    public ST visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx) {
        symbolTable.addType(ctx.getText(), Type.BOOLEAN);

        ST st = stGroup.getInstanceOf("iand");
        return st.add("block", concatenate(ctx));
    }

    @Override
    public ST visitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx) {
        return concatenate(ctx);
    }

    @Override
    public ST visitArrayInitializationExpression(@NotNull ToursParser.ArrayInitializationExpressionContext ctx) {
        ST stExpressions = stGroup.getInstanceOf("concatenator");
        ST st = stGroup.getInstanceOf("new_array");

        List<String> expressions = new ArrayList<>();

        for (int i = 0; i < ctx.expression().size(); i++) {
            ST stExpression = stGroup.getInstanceOf("assignment_array_initialisation");
            stExpression.add("index", i);
            stExpression.add("expressions", visit(ctx.expression(i)).render());
            Type type = new Type(symbolTable.getSymbol(ctx.expression(i).getText()).getType().toArray());
            stExpression.add("store_type", type.javaByteCodePrefix());
            expressions.add(stExpression.render());
        }

        stExpressions.add("blocks", expressions);

        ST stLoadSize = stGroup.getInstanceOf("load_constant");
        stLoadSize.add("text", ctx.expression().size());
        st.add("expression", stLoadSize.render());
        st.add("initialisation", stExpressions.render());

        Type expressionType = symbolTable.getType(ctx.expression(0).getText());

        if (expressionType.equals(Type.STRING)) {
            st.add("prefix", "a");
        } else {
            st.add("prefix", "");
        }

        Type arrayType = new Type(expressionType.toArray());
        return st.add("array_type", arrayType.getJavaByteCodeArrayType());
    }

    @Override
    public ST visitArrayNewExpression(@NotNull ToursParser.ArrayNewExpressionContext ctx) {
        ST st = stGroup.getInstanceOf("new_array");
        st.add("expression", visit(ctx.expression()).render());
        st.add("initialisation", "");
        if (ctx.primitiveType().getText().equals(Type.STRING.toString())) {
            st.add("prefix", "a");
        } else {
            st.add("prefix", "");
        }

        Type arrayType = new Type(ctx.primitiveType().getText() + "[]");
        return st.add("array_type", arrayType.getJavaByteCodeArrayType());
    }

    /**
     * Gives the stack limit
     * Based on maximum argument count and basic stack size
     * @return stack limit
     */
    public int getStackLimit() {
        return maxArgumentCount + BASIC_STACK_SIZE;
    }
}

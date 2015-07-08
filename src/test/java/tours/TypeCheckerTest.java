package tours;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import tours.compiler.CompilerTools;
import tours.typechecker.TypeChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TypeCheckerTest {
    @Test
    public void testVariableDeclarations() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/variable_declaration.tours");
    }

    @Test
    public void testBooleanExpressions() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/boolean_expressions.tours");
    }

    @Test
    public void testForStatement() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_for.tours");
    }

    @Test
    public void testWhileStatement() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_while.tours");
    }

    @Test
    public void testIfStatement() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_if.tours");
    }

    @Test
    public void testAssignments() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_boolean.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_character.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_integer.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_string.tours");

        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_boolean.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_character.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_integer.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_string.tours");

        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_if_else.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_compound.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/array_length.tours");
    }

    @Test
    public void testFunctions() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/functions_arguments_primitive_type.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/functions_arguments_array_type.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/functions_return_array_type.tours");
    }

    @Test
    public void testInput() {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/input_expressions.tours");
    }

    @Test
    public void testMismatchingTypesBasic() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 2, pos 14",
                "Error <mismatching types> on line 3, pos 16",
                "Error <mismatching types> on line 4, pos 14",
                "Error <mismatching types> on line 5, pos 13",
                "Error <mismatching types> on line 7, pos 14",
                "Error <mismatching types> on line 8, pos 16",
                "Error <mismatching types> on line 9, pos 14",
                "Error <mismatching types> on line 10, pos 13"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type.tours");
    }

    @Test
    public void testMismatchingTypesArrays() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 3, pos 9",
                "Error <mismatching types> on line 4, pos 9",
                "Error <mismatching types> on line 5, pos 9",
                "Error <mismatching types> on line 7, pos 9",
                "Error <mismatching types> on line 8, pos 9",
                "Error <mismatching types> on line 9, pos 9",
                "Error <mismatching types> on line 11, pos 9",
                "Error <mismatching types> on line 12, pos 9",
                "Error <mismatching types> on line 13, pos 9",
                "Error <mismatching types> on line 15, pos 9",
                "Error <mismatching types> on line 16, pos 9",
                "Error <mismatching types> on line 17, pos 9",
                "Error <mismatching array types> on line 19, pos 20",
                "Error <mismatching array types> on line 19, pos 20",
                "Error <mismatching types> on line 19, pos 16",
                "Error <mismatching array types> on line 20, pos 22",
                "Error <mismatching array types> on line 20, pos 22",
                "Error <mismatching types> on line 20, pos 18",
                "Error <mismatching array types> on line 21, pos 20",
                "Error <mismatching array types> on line 21, pos 20",
                "Error <mismatching types> on line 21, pos 16",
                "Error <mismatching array types> on line 22, pos 19",
                "Error <mismatching array types> on line 22, pos 19",
                "Error <mismatching types> on line 22, pos 15",
                "Error <expected integer> on line 24, pos 6",
                "Error <expected integer> on line 25, pos 6",
                "Error <expected integer> on line 26, pos 6",
                "Error <expected integer> on line 27, pos 6",
                "Error <expected integer> on line 28, pos 6",
                "Error <expected integer> on line 29, pos 6",
                "Error <expected integer> on line 31, pos 30",
                "Error <expected integer> on line 32, pos 30",
                "Error <expected integer> on line 33, pos 30"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type_array.tours");
    }

    @Test
    public void testMismatchingTypesArrayLength() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 3, pos 15",
                "Error <mismatching types> on line 6, pos 17",
                "Error <mismatching types> on line 9, pos 14"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type_array_length.tours");
    }

    @Test
    public void testMismatchingTypesArrayReturn() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 22, pos 16",
                "Error <mismatching types> on line 23, pos 18",
                "Error <mismatching types> on line 24, pos 16",
                "Error <mismatching types> on line 25, pos 13"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type_return_array.tours");
    }

    @Test
    public void testMismatchingTypesIfElse() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 2, pos 15",
                "Error <mismatching types> on line 3, pos 17",
                "Error <mismatching types> on line 4, pos 15",
                "Error <mismatching types> on line 5, pos 14",
                "Error <mismatching expression types> on line 7, pos 21",
                "Error <mismatching expression types> on line 8, pos 23",
                "Error <mismatching expression types> on line 9, pos 21",
                "Error <mismatching expression types> on line 10, pos 20"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type_if_else.tours");
    }

    @Test
    public void testAlreadyDefinedVariables() {
        List<String> errors = Arrays.asList(
                "Error <variable already defined> on line 3, pos 12",
                "Error <variable already defined> on line 4, pos 14",
                "Error <variable already defined> on line 7, pos 14",
                "Error <variable already defined> on line 11, pos 12",
                "Error <variable already defined> on line 15, pos 12"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/already_defined_variables.tours");
    }

    @Test
    public void testAlreadyDefinedFunction() {
        List<String> errors = Arrays.asList(
                "Error <function name already defined> on line 4, pos 10",
                "Error <function name already defined> on line 5, pos 13",
                "Error <function name already defined> on line 7, pos 13",
                "Error <function name already defined> on line 8, pos 13"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/already_defined_function.tours");
    }

    @Test
    public void testNotDefinedVariables() {
        List<String> errors = Arrays.asList(
                "Error <variable not defined> on line 3, pos 6",
                "Error <variable not defined> on line 5, pos 4",
                "Error <variable not defined> on line 8, pos 4",
                "Error <variable not defined> on line 10, pos 6",
                "Error <variable not defined> on line 13, pos 4",
                "Error <variable not defined> on line 17, pos 11"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/not_defined_variables.tours");
    }

    @Test
    public void testNotDefinedVariablesIf() {
        List<String> errors = Arrays.asList(
            "Error <variable not defined> on line 8, pos 10"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/not_defined_variables_if.tours");
    }

    @Test
    public void testNotDefinedFunction() {
        List<String> errors = Arrays.asList(
            "Error <function not defined> on line 2, pos 4"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/not_defined_function.tours");
    }

    @Test
    public void testInvalidBooleanExpressions() {
        List<String> errors = Arrays.asList(
                "Error <expected booleans> on line 2, pos 4",
                "Error <expected booleans> on line 3, pos 4",
                "Error <expected booleans> on line 4, pos 4",
                "Error <expected booleans> on line 6, pos 4",
                "Error <expected booleans> on line 7, pos 4",
                "Error <expected booleans> on line 8, pos 4"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_boolean_expressions.tours");
    }

    @Test
    public void testInvalidPrefixExpressions() {
        List<String> errors = Arrays.asList(
                "Error <expected integer> on line 2, pos 5",
                "Error <expected integer> on line 3, pos 5",
                "Error <expected integer> on line 4, pos 5",
                "Error <expected boolean> on line 6, pos 5",
                "Error <expected boolean> on line 7, pos 5",
                "Error <expected boolean> on line 8, pos 5"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_prefix_expressions.tours");
    }

    @Test
    public void testInvalidForStatement() {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 6, pos 11",
                "Error <expected boolean> on line 7, pos 11",
                "Error <expected boolean> on line 8, pos 11",
                "Error <expected integers> on line 9, pos 11",
                "Error <expected boolean> on line 10, pos 11",
                "Error <expected boolean> on line 11, pos 11",
                "Error <expected boolean> on line 12, pos 11",
                "Error <expected boolean> on line 13, pos 11",
                "Error <expected boolean> on line 14, pos 11",
                "Error <expected boolean> on line 15, pos 11"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_for.tours");
    }

    @Test
    public void testInvalidIfStatement() {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 6, pos 7",
                "Error <expected boolean> on line 7, pos 7",
                "Error <expected boolean> on line 8, pos 7",
                "Error <expected integers> on line 9, pos 8",
                "Error <expected boolean> on line 10, pos 7",
                "Error <expected boolean> on line 11, pos 7",
                "Error <expected boolean> on line 12, pos 7",
                "Error <expected boolean> on line 13, pos 7",
                "Error <expected boolean> on line 14, pos 7",
                "Error <expected boolean> on line 15, pos 7"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_if.tours");
    }

    @Test
    public void testInvalidWhileStatement() {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 6, pos 10",
                "Error <expected boolean> on line 7, pos 10",
                "Error <expected boolean> on line 8, pos 10",
                "Error <expected integers> on line 9, pos 11",
                "Error <expected boolean> on line 10, pos 10",
                "Error <expected boolean> on line 11, pos 10",
                "Error <expected boolean> on line 12, pos 10",
                "Error <expected boolean> on line 13, pos 10",
                "Error <expected boolean> on line 14, pos 10",
                "Error <expected boolean> on line 15, pos 10"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_while.tours");
    }

    @Test
    public void testMismatchingFunctionAssignments() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 9, pos 13",
                "Error <mismatching types> on line 10, pos 14");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_function_assignments.tours");
    }

    @Test
    public void testMismatchingFunctionReturnType() {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 1, pos 27",
                "Error <mismatching types> on line 5, pos 29",
                "Error <mismatching types> on line 9, pos 26",
                "Error <mismatching types> on line 13, pos 25");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_function_return_type.tours");
    }

    @Test
    public void testMismatchingTypesOnArithmeticExpressions() {
        List<String> errors = Arrays.asList(
                "Error <expected integers> on line 2, pos 4",
                "Error <expected integers> on line 3, pos 4",
                "Error <expected integers> on line 5, pos 4",
                "Error <expected integers> on line 6, pos 4",
                "Error <expected integers> on line 8, pos 4",
                "Error <expected integers> on line 9, pos 4",
                "Error <expected integers> on line 11, pos 4",
                "Error <expected integers> on line 12, pos 4");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_types_arithmetic_expressions.tours");
    }

    @Test
    public void testMismatchingTypesOnComparisonExpressions() {
        List<String> errors = Arrays.asList(
                "Error <expected integers> on line 2, pos 4",
                "Error <expected integers> on line 3, pos 4",
                "Error <expected integers> on line 4, pos 4",
                "Error <expected integers> on line 5, pos 4",

                "Error <mismatching types> on line 7, pos 4",
                "Error <mismatching types> on line 8, pos 4"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_types_comparison_expressions.tours");
    }

    @Test
    public void testLengthOnPrimitiveType() {
        List<String> errors = Arrays.asList(
                "Error <expected array> on line 3, pos 10",
                "Error <expected array> on line 6, pos 10",
                "Error <expected array> on line 9, pos 10",
                "Error <expected array> on line 12, pos 10"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/length_on_primitive_type.tours");
    }

    private void testTypeCheckerErrors(List<String> expected, String filename) {
        ParseTree tree = CompilerTools.toToursParseTree(filename);
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeChecker typeChecker = new TypeChecker();
        walker.walk(typeChecker, tree);
        assertEquals(expected, typeChecker.getErrors());
    }
}

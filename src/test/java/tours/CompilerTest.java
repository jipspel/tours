package tours;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import tours.compiler.CompilerTools;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class CompilerTest {

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Before
    public void createWorkingDirectory() {
        new File("tmp/").mkdir();
    }

    @After
    public void destroyWorkingDirectory() throws IOException {
        FileUtils.deleteDirectory(new File("tmp/"));
    }

    private void assertEqualsOutput(List<String> expectedOutput, String filename) {
        assertEqualsOutput(expectedOutput, filename, null);
    }

    private void assertEqualsOutput(List<String> expectedOutput, String filename, List<String> input) {
        if (input != null) {
            systemInMock.provideLines(input.toArray(new String[input.size()]));
        }

        String expectedOutputString = "";
        for (String line : expectedOutput) {
            expectedOutputString += line + System.getProperty("line.separator");
        }
        try {
            assertEquals(expectedOutputString, compileAndRun(filename));
        } catch (Throwable throwable) {
            fail(throwable.toString());
        }
    }

    private void assertEqualsOutputException(List<String> expectedOutput, String filename) throws Throwable {
        assertEqualsOutputException(expectedOutput, filename, null);
    }

    private void assertEqualsOutputException(List<String> expectedOutput, String filename, List<String> input) throws Throwable {
        if (input != null) {
            systemInMock.provideLines(input.toArray(new String[input.size()]));
        }

        String expectedOutputString = "";
        for (String line : expectedOutput) {
            expectedOutputString += line + System.getProperty("line.separator");
        }
        assertEquals(expectedOutputString, compileAndRun(filename));
    }

    @Test
    public void testHelloWorld() {
        assertEqualsOutput(Arrays.asList("Hello World!"), "src/test/java/tours/examples/compiler/hello_world.tours");
    }

    @Test
    public void testAssignment() {
        assertEqualsOutput(Arrays.asList("true", "false", "false"), "src/test/java/tours/examples/compiler/assignments_boolean.tours");
        assertEqualsOutput(Arrays.asList("a", "b", "c"), "src/test/java/tours/examples/compiler/assignments_character.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/compiler/assignments_integer.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/compiler/assignments_string.tours");
        assertEqualsOutput(Arrays.asList("true", "false", "false", "true", "true", "false", "true", "false", "true"), "src/test/java/tours/examples/compiler/assignments_array_boolean.tours");
        assertEqualsOutput(Arrays.asList("a", "b", "c", "d", "e", "g", "i", "j", "k"), "src/test/java/tours/examples/compiler/assignments_array_character.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37", "38", "39", "41", "43", "44", "45"), "src/test/java/tours/examples/compiler/assignments_array_integer.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37", "39", "40", "42", "44", "45", "46"), "src/test/java/tours/examples/compiler/assignments_array_string.tours");
        assertEqualsOutput(Arrays.asList("35", "36"), "src/test/java/tours/examples/compiler/assignments_if_else.tours");
    }

    @Test
    public void testArithmeticExpressions() {
        assertEqualsOutput(Arrays.asList("35", "36", "70", "35", "35"), "src/test/java/tours/examples/compiler/arithmetic_expressions.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "35"), "src/test/java/tours/examples/compiler/arithmetic_expressions_order.tours");
    }

    @Test
    public void testPrefixExpressions() {
        assertEqualsOutput(Arrays.asList("35", "-36", "false", "true"), "src/test/java/tours/examples/compiler/prefix_expressions.tours");
    }

    @Test
    public void testBooleanExpressions() {
        assertEqualsOutput(Arrays.asList("true", "false", "false", "false", "true", "true", "true", "false"),
                "src/test/java/tours/examples/compiler/boolean_expressions.tours");
        assertEqualsOutput(Arrays.asList("true", "true", "false"), "src/test/java/tours/examples/compiler/boolean_expressions_order.tours");
    }

    @Test
    public void testCompareExpressions() {
        assertEqualsOutput(Arrays.asList("true", "false", "false",
                "true", "true", "false",
                "false", "false", "true",
                "false", "true", "true",
                "true", "true", "true",
                "false", "false", "false",
                "false", "false", "false",
                "true", "true", "true"), "src/test/java/tours/examples/compiler/compare_expressions.tours");
    }

    @Test
    public void testPrint() {
        assertEqualsOutput(Arrays.asList("true", "false", "35", "36", "a", "b", "35", "36", "5", "35"),
                "src/test/java/tours/examples/compiler/printing_assignments.tours");
    }

    @Test
    public void testInputExpressions() {
        assertEqualsOutput(Arrays.asList("true", "true", "a", "a", "35", "40", "35", "35"),
                "src/test/java/tours/examples/compiler/input_expressions.tours", Arrays.asList("true", "a", "35", "35"));
    }

    @Test
    public void testInputStatements() {
        assertEqualsOutput(Arrays.asList("true", "true", "a", "a", "35", "35", "35", "35"),
                "src/test/java/tours/examples/compiler/input_statements.tours", Arrays.asList("true", "a", "35", "35"));
    }
    
    @Test
    public void testIf() {
        assertEqualsOutput(Arrays.asList(
                        "Vanaf hier wordt alles beter!",
                        "Too bad!"),
                "src/test/java/tours/examples/compiler/if_else.tours");
    }

    @Test
    public void testWhile() {
        assertEqualsOutput(Arrays.asList(
                        "Vanaf hier wordt alles beter!",
                        "32",
                        "Vanaf hier wordt alles beter!",
                        "33",
                        "Vanaf hier wordt alles beter!",
                        "34"),
                "src/test/java/tours/examples/compiler/while.tours");
    }

    @Test
    public void testFor() {
        assertEqualsOutput(Arrays.asList(
                        "35",
                        "25",
                        "15"),
                "src/test/java/tours/examples/compiler/for.tours");
    }

    @Test
    public void testCompound() {
        assertEqualsOutput(Arrays.asList(
                        "30",
                        "35",
                        "36",
                        "37"),
                "src/test/java/tours/examples/compiler/compound.tours");
    }

    @Test
    public void testScopes() {
        assertEqualsOutput(Arrays.asList(
                        "35",
                        "36",
                        "37",
                        "0",
                        "3",
                        "1",
                        "2"),
                "src/test/java/tours/examples/compiler/scopes.tours");
    }

    @Test
    public void testVoidFunction() {
        assertEqualsOutput(Arrays.asList("Hello World!"),
                "src/test/java/tours/examples/compiler/function_void_hello_world.tours");
    }

    @Test
    public void testCallEachOtherFunction() {
        assertEqualsOutput(Arrays.asList(
                        "33",
                        "34",
                        "35"),
                "src/test/java/tours/examples/compiler/function_call_each_other.tours");
    }

    @Test
    public void testReturningOneNumber() {
        assertEqualsOutput(Arrays.asList("35"),
                "src/test/java/tours/examples/compiler/function_return_next_number.tours");
    }

    @Test
    public void testReturnAddingTwoNumbers() {
        assertEqualsOutput(Arrays.asList("About to add: ", "33", "2", "Sum: ", "35"),
                "src/test/java/tours/examples/compiler/function_return_add_numbers.tours");
    }

    @Test
    public void testFibonacci() {
        assertEqualsOutput(Arrays.asList("8"),
                "src/test/java/tours/examples/compiler/function_fibonacci.tours");
    }

    @Test
    public void testReturnArrayFunction() {
        assertEqualsOutput(Arrays.asList("false", "true", "a", "b", "35", "36", "Hello", "World!"),
                "src/test/java/tours/examples/compiler/function_return_array_type.tours");
    }

    @Test
    public void testArrayLength() {
        assertEqualsOutput(Arrays.asList(
                "35",
                "36",
                "37",
                "38"
        ), "src/test/java/tours/examples/compiler/array_length.tours");
    }

    @Test
    public void testFunctionArguments() {
        assertEqualsOutput(Arrays.asList(
                "awesome",
                "Hello World!",
                "35",
                "36"
        ), "src/test/java/tours/examples/compiler/functions_arguments_primitive_type.tours");

        assertEqualsOutput(Arrays.asList(
                "awesome",
                "Hello",
                "World!",
                "35",
                "36"
        ), "src/test/java/tours/examples/compiler/functions_arguments_array_type.tours");

        assertEqualsOutput(Arrays.asList(
                "a",
                "b",
                "c",
                "a",
                "1",
                "Hello World!",
                "true"
        ), "src/test/java/tours/examples/compiler/function_argument_order.tours");
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
        try {
            assertEqualsOutputException(Arrays.asList(), "src/test/java/tours/examples/compiler/runtime_exceptions/array_index_out_of_bounds.tours");
        } catch (Throwable throwable) {
            throw (ArrayIndexOutOfBoundsException) throwable;
        }
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testArrayInitializationIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
        try {
            assertEqualsOutputException(Arrays.asList(), "src/test/java/tours/examples/compiler/runtime_exceptions/array_initialization_index_out_of_bounds.tours");
        } catch (Throwable throwable) {
            throw (ArrayIndexOutOfBoundsException) throwable;
        }
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivisionByZero() throws InvocationTargetException {
        try {
            assertEqualsOutputException(Arrays.asList(), "src/test/java/tours/examples/compiler/runtime_exceptions/division_by_zero.tours");
        } catch (Throwable throwable) {
            throw (ArithmeticException) throwable;
        }
    }

    private String compileAndRun(String filename) throws Throwable {
        try {
            List<String> errors = CompilerTools.typeCheck(filename).getErrors();
            if (errors.size() > 0) {
                fail(errors.toString());
            }
            CompilerTools.toByteCode(filename, "./tmp/output.j");
            CompilerTools.compileByteCodeToClassFile("./tmp/output.j", "./tmp");
            return CompilerTools.runClassFile("Tours", "./tmp");
        } catch (NoSuchMethodException | IOException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Error compiling and running: " + filename);
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}

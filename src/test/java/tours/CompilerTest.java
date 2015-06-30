package tours;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tours.compiler.CompilerTools;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class CompilerTest {

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
        String expectedOutputString = "";
        for (String line : expectedOutput) {
            expectedOutputString += line + System.getProperty("line.separator");
        }
        assertEquals(expectedOutputString, compileAndRun(filename, input));
    }

    @Test
    public void testHelloWorld() {
        assertEqualsOutput(Arrays.asList("Hello World"), "src/test/java/tours/examples/compiler/hello_world.tours");
    }

    @Test
    public void testAssignment() {
        assertEqualsOutput(Arrays.asList("true", "false", "false"), "src/test/java/tours/examples/compiler/assignments_boolean.tours");
        assertEqualsOutput(Arrays.asList("a", "b", "c"), "src/test/java/tours/examples/compiler/assignments_character.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/compiler/assignments_integer.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/compiler/assignments_string.tours");
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
    public void testInput() {
        assertEqualsOutput(Arrays.asList("35", "35"),
                "src/test/java/tours/examples/compiler/input_statements.tours",
                Arrays.asList("35"));
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
                        "36",
                        "35",
                        "0",
                        "3",
                        "1"),
                "src/test/java/tours/examples/compiler/scopes.tours");
    }

    private String compileAndRun(String filename, List<String> input) {
        try {
            String text = new String(readAllBytes(get(filename)));
            CompilerTools.toByteCode(text, "./tmp/output.j");
            CompilerTools.compileByteCodeToClassFile("./tmp/output.j", "./tmp");
            return CompilerTools.runClassFile("Tours", "./tmp", input);
        } catch (NoSuchMethodException | InvocationTargetException | IOException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Error compiling and running: " + filename);
            e.printStackTrace();
        }
        return null;
    }

    private String compileAndRun(String filename) {
        return compileAndRun(filename, null);
    }
}

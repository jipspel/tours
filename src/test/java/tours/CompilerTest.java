package tours;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tours.compiler.CompilerTools;

import java.io.File;
import java.io.IOException;
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

    @Test
    public void testHelloWorld() {
        assertEqualsOutput(Arrays.asList("Hello World"), "src/test/java/tours/examples/hello_world.tours");
    }

    private void assertEqualsOutput(List<String> expectedOutput, String filename) {
        String expectedOutputString = "";
        for (String line : expectedOutput) {
            expectedOutputString += line + System.getProperty("line.separator");
        }
        try {
            assertEquals(expectedOutputString, compileAndRun(filename));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAssignment() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("true", "false", "false"), "src/test/java/tours/examples/simple_assignments_boolean_with_print.tours");
        assertEqualsOutput(Arrays.asList("a", "b", "c"), "src/test/java/tours/examples/simple_assignments_character_with_print.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/simple_assignments_integer_with_print.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "37"), "src/test/java/tours/examples/simple_assignments_string_with_print.tours");
    }

    @Test
    public void testArithmeticExpressions() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("35", "36", "70", "35", "35"), "src/test/java/tours/examples/arithmetic_expressions.tours");
        assertEqualsOutput(Arrays.asList("35", "36", "35"), "src/test/java/tours/examples/arithmetic_expressions_order.tours");
    }

    @Test
    public void testPrefixExpressions() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("35", "-36", "false", "true"), "src/test/java/tours/examples/prefix_expressions.tours");
    }

    @Test
    public void testBooleanExpressions() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("true", "false", "false", "false", "true", "true", "true", "false"),
                "src/test/java/tours/examples/boolean_expressions.tours");
        assertEqualsOutput(Arrays.asList("true", "true", "false"), "src/test/java/tours/examples/boolean_expressions_order.tours");
    }

    @Test
    public void testCompareExpressions() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("true", "false", "false",
                "true", "true", "false",
                "false", "false", "true",
                "false", "true", "true",
                "true", "true", "true",
                "false", "false", "false",
                "false", "false", "false",
                "true", "true", "true"), "src/test/java/tours/examples/compare_expressions.tours");
    }

    @Test
    public void testPrinting() throws IOException, InterruptedException {
        assertEqualsOutput(Arrays.asList("true", "false", "35", "36", "a", "b", "35", "36", "5", "35"),
                "src/test/java/tours/examples/printing_assignments.tours");
    }

    private String compileAndRun(String filename) throws IOException, InterruptedException {
        String text = new String(readAllBytes(get(filename)));

        CompilerTools.toByteCode(text, "tmp/output.j");
        CompilerTools.compileByteCodeToClassFile("tmp/output.j", "tmp");

        return CompilerTools.runClassFile("Tours", "tmp");
    }
}

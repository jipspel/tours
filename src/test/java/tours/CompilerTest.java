package tours;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tours.compiler.CompilerTools;

import java.io.File;
import java.io.IOException;

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
    public void testHelloWorld() throws IOException, InterruptedException {
        assertEquals("Hello World\n", compileAndRun("src/test/java/tours/examples/hello_world.tours"));
    }

    @Test
    public void testAssignment() throws IOException, InterruptedException {
        assertEquals("true\nfalse\n", compileAndRun("src/test/java/tours/examples/simple_assignments_boolean_with_print.tours"));
        assertEquals("a\nb\n", compileAndRun("src/test/java/tours/examples/simple_assignments_character_with_print.tours"));
        assertEquals("35\n36\n", compileAndRun("src/test/java/tours/examples/simple_assignment_integer_with_print.tours"));
        assertEquals("35\n36\n", compileAndRun("src/test/java/tours/examples/simple_assignments_string_with_print.tours"));
    }

    private String compileAndRun(String filename) throws IOException, InterruptedException {
        String text = new String(readAllBytes(get(filename)));

        CompilerTools.toByteCode(text, "tmp/output.j");
        CompilerTools.compileByteCodeToClassFile("tmp/output.j", "tmp");

        return CompilerTools.runClassFile("Tours", "tmp");
    }
}

package tours;

import org.junit.Test;
import tours.compiler.CompilerTools;

import java.io.IOException;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class CompilerTest {

    @Test
    public void test() throws IOException {
        String text = new String(readAllBytes(get("src/test/java/tours/examples/HelloWorld.tours")));

        CompilerTools.toByteCode(text, "tmp/output.j");
        CompilerTools.compileByteCodeToClassFile("tmp/output.j", "tmp");

        assertEquals("Hello World\n", CompilerTools.runClassFile("Tours", "tmp"));
    }
}

package tours;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class LexicalTest {

    List<String> errorList;

    @Test
    public void testBoolean() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/boolean.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testCharacter() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/character.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testFor() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/for.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testIf() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testIfElse() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if_else.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testInteger() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/integer.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testString() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/string.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testWhile() throws IOException {
        errorList = TestHelper.parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/while.tours");
        assertNotEquals(0, errorList.size());
    }
}

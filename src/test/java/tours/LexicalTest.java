package tours;

import org.antlr.v4.runtime.*;
import org.junit.Test;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.IOException;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertNotEquals;
public class LexicalTest {

    List<String> errorList;

    @Test
    public void testBoolean() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/boolean.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testCharacter() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/character.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testFor() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/for.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testIf() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testIfElse() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if_else.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testInteger() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/integer.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testString() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/string.tours");
        assertNotEquals(0, errorList.size());
    }

    @Test
    public void testWhile() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/while.tours");
        assertNotEquals(0, errorList.size());
    }

    private List<String> parseToursFile(String filename) throws IOException {
        String file = new String(readAllBytes(get(filename)));

        CharStream chars = new ANTLRInputStream(file);

        ToursErrorListener errorListener = new ToursErrorListener();
        Lexer lexer = new ToursLexer(chars);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        TokenStream tokens = new CommonTokenStream(lexer);
        ToursParser parser = new ToursParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        parser.program();
        return errorListener.getErrorList();
    }
}

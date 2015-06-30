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
import static org.junit.Assert.assertEquals;

public class LexicalTest {

    List<String> errorList;

    @Test
    public void testBoolean() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/boolean.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:9 no viable alternative at input 'booleaanb'", errorList.get(0));
    }

    @Test
    public void testCharacter() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/character.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:11 no viable alternative at input 'characcterc'", errorList.get(0));
    }

    @Test
    public void testFor() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/for.tours");
        assertEquals(5, errorList.size());
        assertEquals("line 2:9 missing '=' at '('", errorList.get(0));
        assertEquals("line 2:10 no viable alternative at input 'integer'", errorList.get(1));
        assertEquals("line 2:27 mismatched input '<' expecting '='", errorList.get(2));
        assertEquals("line 2:42 mismatched input ')' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}", errorList.get(3));
        assertEquals("line 5:0 extraneous input '}' expecting {<EOF>, BOOLEAN, CHARACTER, INTEGER, STRING, IDENTIFIER}", errorList.get(4));
    }

    @Test
    public void testIf() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if.tours");
        assertEquals(3, errorList.size());
        assertEquals("line 3:8 missing '=' at '('", errorList.get(0));
        assertEquals("line 3:18 mismatched input '{' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}", errorList.get(1));
        assertEquals("line 6:0 extraneous input '}' expecting {<EOF>, BOOLEAN, CHARACTER, INTEGER, STRING, IDENTIFIER}", errorList.get(2));
    }

    @Test
    public void testIfElse() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/if_else.tours");
        assertEquals(2, errorList.size());
        assertEquals("line 5:13 missing '=' at '{'", errorList.get(0));
        assertEquals("line 8:0 mismatched input '}' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}", errorList.get(1));
    }

    @Test
    public void testInteger() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/integer.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:9 no viable alternative at input 'inteegeri'", errorList.get(0));
    }

    @Test
    public void testString() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/string.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:8 no viable alternative at input 'sstrings'", errorList.get(0));
    }

    @Test
    public void testWhile() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/lexical_errors/while.tours");
        assertEquals(3, errorList.size());
        assertEquals("line 3:11 missing '=' at '('", errorList.get(0));
        assertEquals("line 3:21 mismatched input '{' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}", errorList.get(1));
        assertEquals("line 6:0 extraneous input '}' expecting {<EOF>, BOOLEAN, CHARACTER, INTEGER, STRING, IDENTIFIER}", errorList.get(2));
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

package tours.tests;


import org.antlr.v4.runtime.*;
import org.junit.Test;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class GrammarTest {

    @Test
    public void testErrorListSize() {
        List<String> errorList;

        errorList = parseToursFile("tours/tests/examples/example1.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("tours/tests/examples/example2.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:13 no viable alternative at input '}'", errorList.get(0));

        errorList = parseToursFile("tours/tests/examples/example3.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("tours/tests/examples/example4.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 6:4 missing ';' at 'while'", errorList.get(0));

        errorList = parseToursFile("tours/tests/examples/example5.tours");
        assertEquals(2, errorList.size());
        assertEquals("line 10:14 missing '(' at 'x'", errorList.get(0));
        assertEquals("line 10:15 mismatched input ';' expecting {AND, OR, EQ, '>=', '>', '<=', '<', '-', '!=', '+', ')', '/', '*'}", errorList.get(1));

    }

    private List<String> parseToursFile(String filename) {
        String file;

        try {
            file = new String(readAllBytes(get(filename)));
        } catch (IOException e) {
            List<String> errorList = new ArrayList<>();
            errorList.add("Failed to load file %s".format(filename));
            return errorList;
        }

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

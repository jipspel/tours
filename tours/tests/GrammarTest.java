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
    public void test() {
        assertEquals(0, parseToursFile("tours/tests/examples/example1.tours").size());
        assertEquals(1, parseToursFile("tours/tests/examples/example2.tours").size());
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
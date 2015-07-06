package tours;

import org.antlr.v4.runtime.*;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.IOException;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class TestHelper {

    public static List<String> parseTours(String filename) throws IOException {
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

    public static String toToursParseTreeString(String filename) throws IOException {
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

        assertEquals(0, errorListener.getErrorList().size());
        return parser.program().toStringTree(parser);
    }
}

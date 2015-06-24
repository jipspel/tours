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
    public void testTree() {
        String result6 = "([] ([30] ([32 30] ([39 32 30] ([46 39 32 30] integer) x , y) ;)))";
        assertEquals(result6, getParseTree("tours/tests/examples/example6.tours"));

        String result7 = "([] ([30] ([33 30] main ( ) ([62 33 30] { ([65 62 33 30] ([77 65 62 33 30] x) = ([79 65 62 33 30] 35)) ; }))))";
        assertEquals(result7, getParseTree("tours/tests/examples/example7.tours"));

        String result8 = "([] ([30] ([33 30] main ( ) ([62 33 30] { ([65 62 33 30] if ( ([83 65 62 33 30] ([16 83 65 62 33 30] x) ([165 83 65 62 33 30] !=) ([166 83 65 62 33 30] 35)) ) ([85 65 62 33 30] { ([65 85 65 62 33 30] ([77 65 85 65 62 33 30] x) = ([79 65 85 65 62 33 30] 35)) ; })) ; }))))";
        assertEquals(result8, getParseTree("tours/tests/examples/example8.tours"));

        String result9 = "([] ([30] ([33 30] main ( ) ([62 33 30] { ([65 62 33 30] while ( ([92 65 62 33 30] ([16 92 65 62 33 30] x) ([165 92 65 62 33 30] !=) ([166 92 65 62 33 30] 35)) ) ([94 65 62 33 30] { ([65 94 65 62 33 30] ([77 65 94 65 62 33 30] x) = ([79 65 94 65 62 33 30] ([16 79 65 94 65 62 33 30] x) ([157 79 65 94 65 62 33 30] +) ([158 79 65 94 65 62 33 30] 1))) ; })) ; }))))";
        assertEquals(result9, getParseTree("tours/tests/examples/example9.tours"));

        String result10 = "([] ([30] ([33 30] main ( ) ([62 33 30] { ([65 62 33 30] for ( ([99 65 62 33 30] ([77 99 65 62 33 30] x) = ([79 99 65 62 33 30] 1)) ; ([103 65 62 33 30] ([16 103 65 62 33 30] x) ([165 103 65 62 33 30] <) ([166 103 65 62 33 30] 35)) ; ([105 65 62 33 30] ([77 105 65 62 33 30] x) = ([79 105 65 62 33 30] ([16 79 105 65 62 33 30] x) ([157 79 105 65 62 33 30] +) ([158 79 105 65 62 33 30] 1))) ) ([107 65 62 33 30] { ([65 107 65 62 33 30] ([77 65 107 65 62 33 30] i) = ([79 65 107 65 62 33 30] 35)) ; })) ; }))))";
        assertEquals(result10, getParseTree("tours/tests/examples/example10.tours"));
    }

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
        String file = read(filename);
        if (file == "") {
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

    private String getParseTree(String filename){
        String file = read(filename);

        if (file == "") {
            return "Failed to load file %s".format(filename);
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
        String tree = parser.program().toStringTree();
        return errorListener.getErrorList().size() > 0 ? "[]" : tree;
    }

    private String read(String filename) {
        String file;
        try {
            file = new String(readAllBytes(get(filename)));
        } catch (IOException e) {
            file = "";
        }
        return file;
    }
}

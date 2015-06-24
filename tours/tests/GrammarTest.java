package tours.tests;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
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
        String result6 = "(program (body (variableDeclaration (variable (variableType integer) x , y) ;)))";
        assertEquals(result6, getParseTree("tours/tests/examples/example6.tours"));

        String result7 = "(program (body (function main ( ) (block { (statement (identifier x) = (expression 35)) ; }))))";
        assertEquals(result7, getParseTree("tours/tests/examples/example7.tours"));

        String result8 = "(program (body (function main ( ) (block { (statement if ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (identifier x) = (expression 35)) ; })) ; }))))";
        assertEquals(result8, getParseTree("tours/tests/examples/example8.tours"));

        String result9 = "(program (body (function main ( ) (block { (statement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (identifier x) = (expression (expression x) (plusOperator +) (expression 1))) ; })) ; }))))";
        assertEquals(result9, getParseTree("tours/tests/examples/example9.tours"));

        String result10 = "(program (body (function main ( ) (block { (statement for ( (statement (identifier x) = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (identifier x) = (expression (expression x) (plusOperator +) (expression 1))) ) (block { (statement (identifier i) = (expression 35)) ; })) ; }))))";
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

        // Convert the input text to a character stream
        CharStream stream = new ANTLRInputStream(file);
        // Build a lexer on top of the character stream
        Lexer lexer = new ToursLexer(stream);
        // Extract a token stream from the lexer
        TokenStream tokens = new CommonTokenStream(lexer);
        // Build a parser instance on top of the token stream
        ToursParser parser = new ToursParser(tokens);
        // Get the parse tree by calling the start rule
        ParseTree tree = parser.program();

        return tree.toStringTree(parser);
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

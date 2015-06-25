package tours;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.IOException;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class GrammarTest {

    List<String> errorList;

    @Test
    public void testValidExamples() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/example1.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/example3.tours");
        assertEquals(0, errorList.size());

        String result6 = "(program (body (variableDeclaration (variable (variableType integer) x , y) ;)))";
        assertEquals(result6, getParseTree("src/test/java/tours/examples/example6.tours"));

        String result7 = "(program (body (function main ( ) (block { (statement (identifier x) = (expression 35)) ; }))))";
        assertEquals(result7, getParseTree("src/test/java/tours/examples/example7.tours"));

        String result8 = "(program (body (function main ( ) (block { (statement if ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (identifier x) = (expression 35)) ; })) ; }))))";
        assertEquals(result8, getParseTree("src/test/java/tours/examples/example8.tours"));

        String result9 = "(program (body (function main ( ) (block { (statement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (identifier x) = (expression (expression x) (plusOperator +) (expression 1))) ; })) ; }))))";
        assertEquals(result9, getParseTree("src/test/java/tours/examples/example9.tours"));

        String result10 = "(program (body (function main ( ) (block { (statement for ( (statement (identifier x) = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (identifier x) = (expression (expression x) (plusOperator +) (expression 1))) ) (block { (statement (identifier i) = (expression 35)) ; })) ; }))))";
        assertEquals(result10, getParseTree("src/test/java/tours/examples/example10.tours"));
    }

    @Test
    public void testMissingAssignment() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/example2.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:13 no viable alternative at input ';'", errorList.get(0));
    }

    @Test
    public void testMissingSemicolon() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/example4.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 6:4 missing ';' at 'while'", errorList.get(0));
    }

    @Test
    public void missingParenthesis() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/example5.tours");
        assertEquals(2, errorList.size());
        assertEquals("line 10:14 missing '(' at 'x'", errorList.get(0));
        assertEquals("line 10:15 mismatched input ';' expecting {AND, OR, EQ, '>=', '>', '<=', '<', '-', '!=', '+', ')', '/', '*'}", errorList.get(1));
    }

    private List<String> parseToursFile(String filename) throws IOException {
        String file = read(filename);

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

    private String getParseTree(String filename) throws IOException {
        String file = read(filename);

        CharStream stream = new ANTLRInputStream(file);
        Lexer lexer = new ToursLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ToursParser parser = new ToursParser(tokens);
        ParseTree tree = parser.program();

        return tree.toStringTree(parser);
    }

    private String read(String filename) throws IOException {
        return new String(readAllBytes(get(filename)));
    }
}

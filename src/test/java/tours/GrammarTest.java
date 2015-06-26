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

        errorList = parseToursFile("src/test/java/tours/examples/simple_assignments_boolean.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_assignments_character.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_assignments_integer.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_assignments_string.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/assignments_one_line.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_statement_for.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_statement_if.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/simple_statement_while.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/variable_declaration.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (variableDeclaration (variable (variableType boolean) x) ;) (function main ( ) (block { (statement x = (expression false)) ; (variable (variableType boolean) y = (expression true)) ; }))))",
                getParseTree("src/test/java/tours/examples/simple_assignments_boolean.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType character) x) ;) (function main ( ) (block { (statement x = (expression 'a')) ; (variable (variableType character) y = (expression 'a')) ; }))))",
                getParseTree("src/test/java/tours/examples/simple_assignments_character.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType integer) x) ;) (function main ( ) (block { (statement x = (expression 35)) ; (variable (variableType integer) y = (expression 35)) ; }))))",
                getParseTree("src/test/java/tours/examples/simple_assignments_integer.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType string) x) ;) (function main ( ) (block { (statement x = (expression \"Hello\")) ; (variable (variableType string) y = (expression \"Hello\")) ; }))))",
                getParseTree("src/test/java/tours/examples/simple_assignments_string.tours"));

        assertEquals("(program (body (function main ( ) (block { (variable (variableType integer) x = (expression 35)) ; (variable (variableType boolean) y = (expression false)) ; (variable (variableType character) z = (expression 'a')) ; (variable (variableType string) a = (expression \"hello\")) ; }))))",
                getParseTree("src/test/java/tours/examples/assignments_one_line.tours"));

        assertEquals("(program (body (function main ( ) (block { (conditionalStatement for ( (variable (variableType integer) x = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement x = (expression (expression x) (plusOperator +) (expression 1))) ) (block { (variable (variableType integer) i = (expression 35)) ; })) }))))",
                getParseTree("src/test/java/tours/examples/simple_statement_for.tours"));

        assertEquals("(program (body (function main ( ) (block { (variable (variableType integer) x) ; (conditionalStatement if ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement x = (expression 35)) ; })) }))))",
                getParseTree("src/test/java/tours/examples/simple_statement_if.tours"));

        assertEquals("(program (body (function main ( ) (block { (conditionalStatement while ( (expression true) ) (block { (statement x = (expression (expression x) (plusOperator +) (expression 1))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/simple_statement_while.tours"));


        assertEquals("(program (body (variableDeclaration (variable (variableType integer) x , y) ; (variable (variableType character) z) ; (variable (variableType boolean) a) ; (variable (variableType string) b) ;)))",
                getParseTree("src/test/java/tours/examples/variable_declaration.tours"));

    }

    @Test
    public void testMissingAssignment() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/invalid/missing_assignment.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 1:21 no viable alternative at input ';'", errorList.get(0));
    }

    @Test
    public void testMissingSemicolon() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/invalid/missing_semicolon.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 5:4 mismatched input '}' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}", errorList.get(0));
    }

    @Test
    public void missingParenthesis() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/invalid/missing_parenthesis.tours");
        assertEquals(2, errorList.size());
        assertEquals("line 4:14 missing '(' at 'x'", errorList.get(0));
        assertEquals("line 4:15 mismatched input ';' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ')', '/', '*'}", errorList.get(1));
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

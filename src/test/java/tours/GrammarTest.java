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
    public void testValidAssignments() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_boolean.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_compound.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_character.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_integer.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_string.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (variableDeclaration (variable (variableType boolean) x) ;) (variableAssignment x = (expression false)) ; (variableDeclaration (variable (variableType boolean) y = (expression true)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (variableType integer) i) ; (statement (variableAssignment i = (expression { (variable (variableType integer) x = (expression 35)) ; }))) ; (variable (variableType integer) j = (expression { (variable (variableType integer) y = (expression 36)) ; })) ; (statement (variableAssignment j = (expression { (expression (expression 5) (multiplyOperator *) (expression 5)) ; }))) ; (statement (variableAssignment j = (expression { (statement (variableAssignment i = (expression 3))) ; }))) ; }))))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_compound.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType character) x) ;) (variableAssignment x = (expression 'a')) ; (variableDeclaration (variable (variableType character) y = (expression 'a')) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType integer) x) ;) (variableAssignment x = (expression 35)) ; (variableDeclaration (variable (variableType integer) y = (expression 35)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType string) x) ;) (variableAssignment x = (expression \"Hello\")) ; (variableDeclaration (variable (variableType string) y = (expression \"Hello\")) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_string.tours"));
    }

    @Test
    public void testValidArrayAssignments() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_array_boolean.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_array_character.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_array_integer.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_array_string.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (variableDeclaration (variable (variableType boolean) x) ;) (variableAssignment x = (expression false)) ; (variableDeclaration (variable (variableType boolean) y = (expression true)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType character) x) ;) (variableAssignment x = (expression 'a')) ; (variableDeclaration (variable (variableType character) y = (expression 'a')) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType integer) x) ;) (variableAssignment x = (expression 35)) ; (variableDeclaration (variable (variableType integer) y = (expression 35)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType string) x) ;) (variableAssignment x = (expression \"Hello\")) ; (variableDeclaration (variable (variableType string) y = (expression \"Hello\")) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_string.tours"));
    }

    @Test
    public void testValidExamples() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/functions.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/statement_for.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/statement_if.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/statement_while.tours");
        assertEquals(0, errorList.size());

        errorList = parseToursFile("src/test/java/tours/examples/typechecker/variable_declaration.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (function func void awesome_print ( (variableType string) text ) (block { (statement print ( (expression \"awesome\") , (expression text) )) ; })) (function func (variableType integer) next_number ( (variableType integer) i ) (returnBlock { (returnStatement return (expression print ( (expression (expression i) (plusOperator +) (expression 1)) ))) ; }))))",
                getParseTree("src/test/java/tours/examples/typechecker/functions.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (variableType integer) i = (expression 0)) ; (conditionalStatement for ( (variable (variableType integer) x = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ) (block { (statement (variableAssignment i = (expression (expression i) (plusOperator +) (expression 1)))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_for_single.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (variableType integer) x = (expression 35)) ; (variable (variableType integer) y = (expression 35)) ; (conditionalStatement if ( (expression (expression x) (compareOperator ==) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; }) else (block { (statement (variableAssignment y = (expression 36))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_if.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (variableType integer) x) ; (conditionalStatement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_while.tours"));

        assertEquals("(program (body (variableDeclaration (variable (variableType integer) x , y) ; (variable (variableType character) z) ; (variable (variableType boolean) a) ; (variable (variableType string) b) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/variable_declaration.tours"));
    }


    @Test
    public void testMissingAssignment() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/missing_assignment.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 2:16 no viable alternative at input ';'",
                errorList.get(0));
    }

    @Test
    public void testMissingSemicolon() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/missing_semicolon.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 5:4 mismatched input '}' expecting {'&&', '==', '>=', '>', '<=', '<', '-', '%', '!=', '||', '+', ';', '/', '*'}",
                errorList.get(0));
    }

    @Test
    public void testMissingParenthesis() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/missing_parenthesis.tours");
        assertEquals(3, errorList.size());
        assertEquals("line 4:14 no viable alternative at input 'printx'",
                errorList.get(0));
        assertEquals("line 4:15 mismatched input ';' expecting '='",
                errorList.get(1));
        assertEquals("line 5:4 extraneous input '}' expecting {<EOF>, BOOLEAN, CHARACTER, FUNC, INTEGER, STRING, IDENTIFIER}",
                errorList.get(2));
    }

    @Test
    public void testInvalidFunctionReturns() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/function_returns.tours");
        assertEquals(5, errorList.size());
        assertEquals("line 2:4 extraneous input 'return' expecting {BOOLEAN, CHARACTER, FALSE, FOR, IF, INPUT, INTEGER, PRINT, STRING, TRUE, WHILE, '{', '(', '-', '!', '+', '}', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(0));
        assertEquals("line 7:0 extraneous input '}' expecting {BOOLEAN, CHARACTER, FALSE, FOR, IF, INPUT, INTEGER, PRINT, RETURN, STRING, TRUE, WHILE, '{', '(', '-', '!', '+', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(1));
        assertEquals("line 11:4 mismatched input 'return' expecting '}'",
                errorList.get(2));
        assertEquals("line 11:13 missing '=' at '+'",
                errorList.get(3));
        assertEquals("line 12:0 extraneous input '}' expecting {<EOF>, BOOLEAN, CHARACTER, FUNC, INTEGER, STRING, IDENTIFIER}",
                errorList.get(4));
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

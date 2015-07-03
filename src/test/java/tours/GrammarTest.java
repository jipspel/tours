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

        assertEquals("(program (body (variableDeclaration (variable (primitiveType boolean) x) ;) (variableAssignment x = (expression false)) ; (variableDeclaration (variable (primitiveType boolean) y = (expression true)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) i) ; (statement (variableAssignment i = (expression (compound { (variable (primitiveType integer) x = (expression 35)) ; })))) ; (variable (primitiveType integer) j = (expression (compound { (variable (primitiveType integer) y = (expression 36)) ; }))) ; (statement (variableAssignment j = (expression (compound { (expression (expression 5) (multiplyOperator *) (expression 5)) ; })))) ; (statement (variableAssignment j = (expression (compound { (statement (variableAssignment i = (expression 3))) ; })))) ; }))))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_compound.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType character) x) ;) (variableAssignment x = (expression 'a')) ; (variableDeclaration (variable (primitiveType character) y = (expression 'a')) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType integer) x) ;) (variableAssignment x = (expression 35)) ; (variableDeclaration (variable (primitiveType integer) y = (expression 35)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType string) x) ;) (variableAssignment x = (expression \"Hello\")) ; (variableDeclaration (variable (primitiveType string) y = (expression \"Hello\")) ;)))",
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

        assertEquals("(program (body (variableDeclaration (variable (primitiveType boolean) x) ;) (variableAssignment x = (expression false)) ; (variableDeclaration (variable (primitiveType boolean) y = (expression true)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType character) x) ;) (variableAssignment x = (expression 'a')) ; (variableDeclaration (variable (primitiveType character) y = (expression 'a')) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType integer) x) ;) (variableAssignment x = (expression 35)) ; (variableDeclaration (variable (primitiveType integer) y = (expression 35)) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType string) x) ;) (variableAssignment x = (expression \"Hello\")) ; (variableDeclaration (variable (primitiveType string) y = (expression \"Hello\")) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_string.tours"));
    }

    @Test
    public void testValidIfElseAssignments() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/assignments_with_if_else.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (variableDeclaration (variable (primitiveType boolean) b = (expression if ( (expression true) ) (compound { (variable (primitiveType boolean) a = (expression false)) ; }) else (compound { (variable (primitiveType boolean) a = (expression true)) ; }))) ; (variable (primitiveType character) c = (expression if ( (expression true) ) (compound { (variable (primitiveType character) d = (expression 'a')) ; }) else (compound { (variable (primitiveType character) d = (expression 'b')) ; }))) ; (variable (primitiveType integer) i = (expression if ( (expression true) ) (compound { (variable (primitiveType integer) j = (expression 35)) ; }) else (compound { (variable (primitiveType integer) j = (expression 36)) ; }))) ; (variable (primitiveType string) s = (expression if ( (expression true) ) (compound { (variable (primitiveType string) t = (expression \"Hello\")) ; }) else (compound { (variable (primitiveType string) t = (expression \"World\")) ; }))) ;)))",
                getParseTree("src/test/java/tours/examples/typechecker/assignments_with_if_else.tours"));
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

        assertEquals("(program (body (function func void awesome_print ( (variableType (primitiveType string)) text ) (block { (statement print ( (expression \"awesome\") , (expression text) )) ; })) (function func (variableType (primitiveType integer)) next_number ( (variableType (primitiveType integer)) i ) (returnBlock { (returnStatement return (expression print ( (expression (expression i) (plusOperator +) (expression 1)) ))) ; }))))",
                getParseTree("src/test/java/tours/examples/typechecker/functions.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) i = (expression 0)) ; (conditionalStatement for ( (variable (primitiveType integer) x = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ) (block { (statement (variableAssignment i = (expression (expression i) (plusOperator +) (expression 1)))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_for_single.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x = (expression 35)) ; (variable (primitiveType integer) y = (expression 35)) ; (conditionalStatement if ( (expression (expression x) (compareOperator ==) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; }) else (block { (statement (variableAssignment y = (expression 36))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_if.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x) ; (conditionalStatement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; })) }))))",
                getParseTree("src/test/java/tours/examples/typechecker/statement_while.tours"));

        assertEquals("(program (body (variableDeclaration (variable (primitiveType integer) x , y) ; (variable (primitiveType character) z) ; (variable (primitiveType boolean) a) ; (variable (primitiveType string) b) ;)))",
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
        assertEquals(2, errorList.size());
        assertEquals("line 5:4 no viable alternative at input 'if(x!=35){x=35}'",
                errorList.get(0));
        assertEquals("line 3:10 mismatched input '!=' expecting '='",
                errorList.get(1));
    }

    @Test
    public void testMissingParenthesis() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/missing_parenthesis.tours");
        assertEquals(3, errorList.size());
        assertEquals("line 4:14 no viable alternative at input 'printx'",
                errorList.get(0));
        assertEquals("line 4:15 mismatched input ';' expecting '='",
                errorList.get(1));
        assertEquals("line 5:4 extraneous input '}' expecting {<EOF>, BOOLEAN, BOOLEANARRAY, CHARACTER, CHARACTERARRAY, FUNC, INTEGER, INTEGERARRAY, STRING, STRINGARRAY, IDENTIFIER}",
                errorList.get(2));
    }

    @Test
    public void testInvalidFunctionReturns() throws IOException {
        errorList = parseToursFile("src/test/java/tours/examples/typechecker/invalid/function_returns.tours");
        assertEquals(5, errorList.size());
        assertEquals("line 2:4 extraneous input 'return' expecting {BOOLEAN, BOOLEANARRAY, CHARACTER, CHARACTERARRAY, FALSE, FOR, IF, INPUT, INTEGER, INTEGERARRAY, PRINT, STRING, STRINGARRAY, TRUE, WHILE, '{', '(', '-', '!', '+', '}', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(0));
        assertEquals("line 7:0 extraneous input '}' expecting {BOOLEAN, BOOLEANARRAY, CHARACTER, CHARACTERARRAY, FALSE, FOR, IF, INPUT, INTEGER, INTEGERARRAY, PRINT, RETURN, STRING, STRINGARRAY, TRUE, WHILE, '{', '(', '-', '!', '+', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(1));
        assertEquals("line 11:4 mismatched input 'return' expecting '}'",
                errorList.get(2));
        assertEquals("line 11:13 missing '=' at '+'",
                errorList.get(3));
        assertEquals("line 12:0 extraneous input '}' expecting {<EOF>, BOOLEAN, BOOLEANARRAY, CHARACTER, CHARACTERARRAY, FUNC, INTEGER, INTEGERARRAY, STRING, STRINGARRAY, IDENTIFIER}",
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

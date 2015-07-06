package tours;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GrammarTest {

    List<String> errorList;

    @Test
    public void testValidAssignments() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_boolean.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_compound.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_character.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_integer.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_string.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType boolean) x) ; (statement (variableAssignment x = (expression false))) ; (variable (primitiveType boolean) y = (expression true)) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) i) ; (statement (variableAssignment i = (expression (compound { (variable (primitiveType integer) x = (expression 35)) ; })))) ; (variable (primitiveType integer) j = (expression (compound { (variable (primitiveType integer) y = (expression 36)) ; }))) ; (statement (variableAssignment j = (expression (compound { (expression (expression 5) (multiplyOperator *) (expression 5)) ; })))) ; (statement (variableAssignment j = (expression (compound { (statement (variableAssignment i = (expression 3))) ; })))) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_compound.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType character) x) ; (statement (variableAssignment x = (expression 'a'))) ; (variable (primitiveType character) y = (expression 'a')) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x) ; (statement (variableAssignment x = (expression 35))) ; (variable (primitiveType integer) y = (expression 35)) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType string) x) ; (statement (variableAssignment x = (expression \"Hello\"))) ; (variable (primitiveType string) y = (expression \"Hello\")) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_string.tours"));
    }

    @Test
    public void testValidArrayAssignments() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_array_boolean.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_array_character.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_array_integer.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_array_string.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType boolean) x) ; (statement (variableAssignment x = (expression false))) ; (variable (primitiveType boolean) y = (expression true)) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType character) x) ; (statement (variableAssignment x = (expression 'a'))) ; (variable (primitiveType character) y = (expression 'a')) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x) ; (statement (variableAssignment x = (expression 35))) ; (variable (primitiveType integer) y = (expression 35)) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType string) x) ; (statement (variableAssignment x = (expression \"Hello\"))) ; (variable (primitiveType string) y = (expression \"Hello\")) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_string.tours"));
    }

    @Test
    public void testValidIfElseAssignments() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_with_if_else.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType boolean) b = (expression if ( (expression true) ) (compound { (variable (primitiveType boolean) a = (expression false)) ; }) else (compound { (variable (primitiveType boolean) a = (expression true)) ; }))) ; (variable (primitiveType character) c = (expression if ( (expression true) ) (compound { (variable (primitiveType character) d = (expression 'a')) ; }) else (compound { (variable (primitiveType character) d = (expression 'b')) ; }))) ; (variable (primitiveType integer) i = (expression if ( (expression true) ) (compound { (variable (primitiveType integer) j = (expression 35)) ; }) else (compound { (variable (primitiveType integer) j = (expression 36)) ; }))) ; (variable (primitiveType string) s = (expression if ( (expression true) ) (compound { (variable (primitiveType string) t = (expression \"Hello\")) ; }) else (compound { (variable (primitiveType string) t = (expression \"World\")) ; }))) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_with_if_else.tours"));
    }

    @Test
    public void testValidExamples() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/functions.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_for.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_if.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_while.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/variable_declaration.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (body (function func void awesome_print ( (variableType (primitiveType string)) text ) (block { (statement print ( (expression \"awesome\") , (expression text) )) ; })) (function func (variableType (primitiveType integer)) next_number ( (variableType (primitiveType integer)) i ) (returnBlock { (returnStatement return (expression print ( (expression (expression i) (plusOperator +) (expression 1)) ))) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/functions.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) i = (expression 0)) ; (conditionalStatement for ( (variable (primitiveType integer) x = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ) (block { (statement (variableAssignment i = (expression (expression i) (plusOperator +) (expression 1)))) ; })) }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_for_single.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x = (expression 35)) ; (variable (primitiveType integer) y = (expression 35)) ; (conditionalStatement if ( (expression (expression x) (compareOperator ==) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; }) else (block { (statement (variableAssignment y = (expression 36))) ; })) }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_if.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x) ; (conditionalStatement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (block { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; })) }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_while.tours"));

        assertEquals("(program (body (function func void main ( ) (block { (variable (primitiveType integer) x , y) ; (variable (primitiveType character) z) ; (variable (primitiveType boolean) a) ; (variable (primitiveType string) b) ; }))))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/variable_declaration.tours"));
    }


    @Test
    public void testMissingAssignment() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/missing_assignment.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 2:16 no viable alternative at input ';'",
                errorList.get(0));
    }

    @Test
    public void testMissingSemicolon() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/missing_semicolon.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 5:4 no viable alternative at input 'if(x!=35){x=35}'",
                errorList.get(0));
    }

    @Test
    public void testMissingParenthesis() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/missing_parenthesis.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 4:14 no viable alternative at input 'printx'",
                errorList.get(0));
    }

    @Test
    public void testInvalidFunctionReturns() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/function_returns.tours");
        assertEquals(3, errorList.size());
        assertEquals("line 2:4 extraneous input 'return' expecting {BOOLEAN, BOOLEAN_ARRAY, CHARACTER, CHARACTER_ARRAY, FALSE, FOR, IF, INPUT, INTEGER, INTEGER_ARRAY, PRINT, STRING, STRING_ARRAY, TRUE, WHILE, '{', '(', '-', '!', '+', '}', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(0));
        assertEquals("line 7:0 extraneous input '}' expecting {BOOLEAN, BOOLEAN_ARRAY, CHARACTER, CHARACTER_ARRAY, FALSE, FOR, IF, INPUT, INTEGER, INTEGER_ARRAY, PRINT, RETURN, STRING, STRING_ARRAY, TRUE, WHILE, '{', '(', '-', '!', '+', IDENTIFIER, INT, STR, CHAR}",
                errorList.get(1));
        assertEquals("line 11:4 mismatched input 'return' expecting '}'",
                errorList.get(2));
    }
}

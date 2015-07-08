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

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType boolean) x) ; (statement (variableAssignment x = (expression false))) ; (variable (primitiveType boolean) y = (expression true)) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) i) ; (statement (variableAssignment i = (expression (compound { (variable (primitiveType integer) x = (expression 35)) ; })))) ; (variable (primitiveType integer) j = (expression (compound { (variable (primitiveType integer) y = (expression 36)) ; }))) ; (statement (variableAssignment j = (expression (compound { (expression (expression 5) (multiplyOperator *) (expression 5)) ; })))) ; (statement (variableAssignment j = (expression (compound { (statement (variableAssignment i = (expression 3))) ; })))) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_compound.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType character) x) ; (statement (variableAssignment x = (expression 'a'))) ; (variable (primitiveType character) y = (expression 'a')) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) x) ; (statement (variableAssignment x = (expression 35))) ; (variable (primitiveType integer) y = (expression 35)) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType string) x) ; (statement (variableAssignment x = (expression \"Hello\"))) ; (variable (primitiveType string) y = (expression \"Hello\")) ; })))",
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

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/functions_return_array_type.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType boolean) x) ; (statement (variableAssignment x = (expression false))) ; (variable (primitiveType boolean) y = (expression true)) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_boolean.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType character) x) ; (statement (variableAssignment x = (expression 'a'))) ; (variable (primitiveType character) y = (expression 'a')) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_character.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) x) ; (statement (variableAssignment x = (expression 35))) ; (variable (primitiveType integer) y = (expression 35)) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_integer.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType string) x) ; (statement (variableAssignment x = (expression \"Hello\"))) ; (variable (primitiveType string) y = (expression \"Hello\")) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_string.tours"));

        assertEquals("(program (returnFunction func (variableType (arrayType boolean[])) makeArrayBoolean ( (variableType (primitiveType boolean)) i ) (returnBlock { (variable (arrayType boolean[]) j = (arrayAssignment { (expression i) , (expression i) })) ; (returnStatement return (expression j)) ; })) (returnFunction func (variableType (arrayType character[])) makeArrayCharacter ( (variableType (primitiveType character)) i ) (returnBlock { (variable (arrayType character[]) j = (arrayAssignment { (expression i) , (expression i) })) ; (returnStatement return (expression j)) ; })) (returnFunction func (variableType (arrayType integer[])) makeArrayInteger ( (variableType (primitiveType integer)) i ) (returnBlock { (variable (arrayType integer[]) j = (arrayAssignment { (expression i) , (expression i) })) ; (returnStatement return (expression j)) ; })) (returnFunction func (variableType (arrayType string[])) makeArrayString ( (variableType (primitiveType string)) i ) (returnBlock { (variable (arrayType string[]) j = (arrayAssignment { (expression i) , (expression i) })) ; (returnStatement return (expression j)) ; })) (mainFunction func main ( ) (block { (variable (arrayType boolean[]) b1 = (arrayAssignment (expression makeArrayBoolean ( (expression false) )))) ; (variable (arrayType boolean[]) b2 = (arrayAssignment new (primitiveType boolean) [ (expression 5) ])) ; (statement (variableAssignment b2 = (expression makeArrayBoolean ( (expression false) )))) ; (variable (arrayType character[]) c1 = (arrayAssignment (expression makeArrayCharacter ( (expression 'a') )))) ; (variable (arrayType character[]) c2 = (arrayAssignment new (primitiveType character) [ (expression 5) ])) ; (statement (variableAssignment c2 = (expression makeArrayCharacter ( (expression 'a') )))) ; (variable (arrayType integer[]) i1 = (arrayAssignment (expression makeArrayInteger ( (expression 35) )))) ; (variable (arrayType integer[]) i2 = (arrayAssignment new (primitiveType integer) [ (expression 5) ])) ; (statement (variableAssignment i2 = (expression makeArrayInteger ( (expression 36) )))) ; (variable (arrayType string[]) s1 = (arrayAssignment (expression makeArrayString ( (expression \"Hello World!\") )))) ; (variable (arrayType string[]) s2 = (arrayAssignment new (primitiveType string) [ (expression 5) ])) ; (statement (variableAssignment s2 = (expression makeArrayString ( (expression \"Hello World!\") )))) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/functions_return_array_type.tours"));
    }

    @Test
    public void testValidIfElseAssignments() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/assignments_if_else.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType boolean) b = (expression if ( (expression true) ) (compound { (variable (primitiveType boolean) a = (expression false)) ; }) else (compound { (variable (primitiveType boolean) a = (expression true)) ; }))) ; (variable (primitiveType character) c = (expression if ( (expression true) ) (compound { (variable (primitiveType character) d = (expression 'a')) ; }) else (compound { (variable (primitiveType character) d = (expression 'b')) ; }))) ; (variable (primitiveType integer) i = (expression if ( (expression true) ) (compound { (variable (primitiveType integer) j = (expression 35)) ; }) else (compound { (variable (primitiveType integer) j = (expression 36)) ; }))) ; (variable (primitiveType string) s = (expression if ( (expression true) ) (compound { (variable (primitiveType string) t = (expression \"Hello\")) ; }) else (compound { (variable (primitiveType string) t = (expression \"World\")) ; }))) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/assignments_if_else.tours"));
    }

    @Test
    public void testValidExamples() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/array_length.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/functions_arguments_primitive_type.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/functions_arguments_array_type.tours");
        assertEquals(0, errorList.size());


        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_for.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_if.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/statement_while.tours");
        assertEquals(0, errorList.size());

        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/variable_declaration.tours");
        assertEquals(0, errorList.size());

        assertEquals("(program (mainFunction func main ( ) (block { (variable (arrayType boolean[]) b = (arrayAssignment new (primitiveType boolean) [ (expression 35) ])) ; (statement print ( (expression b . length) )) ; (variable (arrayType character[]) c = (arrayAssignment new (primitiveType character) [ (expression 36) ])) ; (statement print ( (expression c . length) )) ; (variable (arrayType integer[]) i = (arrayAssignment new (primitiveType integer) [ (expression 37) ])) ; (statement print ( (expression i . length) )) ; (variable (arrayType string[]) s = (arrayAssignment new (primitiveType string) [ (expression 38) ])) ; (statement print ( (expression s . length) )) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/array_length.tours"));

        assertEquals("(program (voidFunction func void awesome_print ( (variableType (primitiveType string)) text ) (block { (statement print ( (expression \"awesome\") , (expression text) )) ; })) (returnFunction func (variableType (primitiveType integer)) next_number ( (variableType (primitiveType integer)) i ) (returnBlock { (returnStatement return (expression print ( (expression (expression i) (plusOperator +) (expression 1)) ))) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/functions_arguments_primitive_type.tours"));

        assertEquals("(program (voidFunction func void awesome_print ( (variableType (arrayType string[])) text ) (block { (statement print ( (expression \"awesome\") , (expression text [ (expression 0) ]) , (expression text [ (expression 1) ]) )) ; })) (returnFunction func (variableType (primitiveType integer)) next_number ( (variableType (arrayType integer[])) i ) (returnBlock { (returnStatement return (expression print ( (expression (expression (expression i [ (expression 0) ]) (plusOperator +) (expression i [ (expression 1) ])) (plusOperator +) (expression 1)) ))) ; })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/functions_arguments_array_type.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) i = (expression 0)) ; (conditionalStatement for ( (variable (primitiveType integer) x = (expression 1)) ; (expression (expression x) (compareOperator <) (expression 35)) ; (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ) (compound { (statement (variableAssignment i = (expression (expression i) (plusOperator +) (expression 1)))) ; })) })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_for_single.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) x = (expression 35)) ; (variable (primitiveType integer) y = (expression 35)) ; (conditionalStatement if ( (expression (expression x) (compareOperator ==) (expression 35)) ) (compound { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; }) else (compound { (statement (variableAssignment y = (expression 36))) ; })) })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_if.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) x) ; (conditionalStatement while ( (expression (expression x) (compareOperator !=) (expression 35)) ) (compound { (statement (variableAssignment x = (expression (expression x) (plusOperator +) (expression 1)))) ; })) })))",
                TestHelper.toToursParseTreeString("src/test/java/tours/examples/typechecker/statement_while.tours"));

        assertEquals("(program (mainFunction func main ( ) (block { (variable (primitiveType integer) x , y) ; (variable (primitiveType character) z) ; (variable (primitiveType boolean) a) ; (variable (primitiveType string) b) ; })))",
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
        assertEquals(1, errorList.size());
        assertEquals("line 2:4 no viable alternative at input 'funcvoidawesome_print(stringtext){return'",
                errorList.get(0));
    }

    @Test
    public void testMissingElseInIfElseExpression() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/missing_else_in_if_else_expression.tours");
        assertEquals(1, errorList.size());
        assertEquals("line 2:30 mismatched input ';' expecting ELSE",
                errorList.get(0));
    }

    @Test
    public void testWhileAssignment() throws IOException {
        errorList = TestHelper.parseTours("src/test/java/tours/examples/typechecker/invalid/invalid_while_assignments.tours");
        assertEquals(2, errorList.size());
        assertEquals("line 3:16 no viable alternative at input 'while'",
                errorList.get(0));
        assertEquals("line 5:17 mismatched input ';' expecting {<EOF>, FUNC}",
                errorList.get(1));
    }
}

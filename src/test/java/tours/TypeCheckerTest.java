package tours;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;
import tours.typechecker.TypeChecker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class TypeCheckerTest {

    @Test
    public void testVariableDeclarations() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/variable_declaration.tours");
    }

    @Test
    public void testForStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_for.tours");
    }

    @Test
    public void testWhileStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_while.tours");
    }

    @Test
    public void testIfStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/statement_if.tours");
    }

    @Test
    public void testAssignments() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_boolean.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_character.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_integer.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_string.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_compound.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_boolean.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_character.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_integer.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/typechecker/assignments_array_string.tours");
    }

    @Test
    public void testMismatchingTypes() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 2, pos 14",
                "Error <mismatching types> on line 3, pos 16",
                "Error <mismatching types> on line 4, pos 14",
                "Error <mismatching types> on line 5, pos 13",
                "Error <mismatching types> on line 7, pos 14",
                "Error <mismatching types> on line 8, pos 16",
                "Error <mismatching types> on line 9, pos 14",
                "Error <mismatching types> on line 10, pos 13"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_type.tours");
    }

    @Test
    public void testAlreadyDefinedVariables() throws IOException {
        List<String> errors = Arrays.asList("Error <variable already defined> on line 3, pos 12");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/already_defined_variables.tours");
    }

    @Test
    public void testNotDefinedVariables() throws IOException {
        List<String> errors = Arrays.asList("Error <variable not defined> on line 2, pos 6");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/not_defined_variables.tours");
    }

    @Test
    public void testInvalidForStatement() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 4, pos 16",
                "Error <expected boolean> on line 8, pos 16",
                "Error <expected boolean> on line 12, pos 16",
                "Error <expected boolean> on line 16, pos 16",
                "Error <expected boolean> on line 20, pos 16"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_for.tours");
    }

    @Test
    public void testInvalidIfStatement() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 6, pos 7",
                "Error <expected boolean> on line 10, pos 7",
                "Error <expected boolean> on line 14, pos 7",
                "Error <expected boolean> on line 18, pos 7",
                "Error <expected boolean> on line 22, pos 7",
                "Error <expected boolean> on line 26, pos 7",
                "Error <expected boolean> on line 30, pos 7",
                "Error <expected boolean> on line 34, pos 7"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_if.tours");
    }

    @Test
    public void testInvalidWhileStatement() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <expected boolean> on line 6, pos 10",
                "Error <expected boolean> on line 10, pos 10",
                "Error <expected boolean> on line 14, pos 10",
                "Error <expected boolean> on line 18, pos 10",
                "Error <expected boolean> on line 22, pos 10",
                "Error <expected boolean> on line 26, pos 10",
                "Error <expected boolean> on line 30, pos 10",
                "Error <expected boolean> on line 34, pos 10"
        );
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/invalid_statements_while.tours");
    }

    @Test
    public void testMismatchingFunctionAssignments() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 9, pos 13",
                "Error <mismatching types> on line 10, pos 14");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_function_assignments.tours");
    }

    @Test
    public void testMismatchingFunctionReturnType() throws IOException {
        List<String> errors = Arrays.asList(
                "Error <mismatching types> on line 1, pos 27",
                "Error <mismatching types> on line 5, pos 29",
                "Error <mismatching types> on line 9, pos 26",
                "Error <mismatching types> on line 13, pos 25");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/typechecker/invalid/mismatching_function_return_type.tours");
    }

    private void testTypeCheckerErrors(List<String> expected, String filename) throws IOException {
        ParseTree tree = parseTours(filename);
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeChecker typeChecker = new TypeChecker();
        walker.walk(typeChecker, tree);
        assertEquals(expected, typeChecker.getErrors());
    }

    private ParseTree parseTours(String filename) throws IOException {
        String text = new String(readAllBytes(get(filename)));

        CharStream chars = new ANTLRInputStream(text);
        Lexer lexer = new ToursLexer(chars);
        TokenStream tokens = new CommonTokenStream(lexer);
        ToursParser parser = new ToursParser(tokens);

        return parser.program();
    }
}

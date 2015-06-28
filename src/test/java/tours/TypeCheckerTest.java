package tours;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;
import tours.typechecker.SymbolTable;
import tours.typechecker.TypeChecker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class TypeCheckerTest {

    @Test
    public void testVariableDeclarations() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/variable_declaration.tours");
    }

    @Test
    public void testForStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/statement_for.tours");
    }

    @Test
    public void testWhileStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/statement_while.tours");
    }

    @Test
    public void testIfStatement() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/statement_if.tours");
    }

    @Test
    public void testAssignments() throws IOException {
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/assignments.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/simple_assignments_boolean.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/simple_assignments_character.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/simple_assignments_integer.tours");
        testTypeCheckerErrors(new ArrayList<>(), "src/test/java/tours/examples/simple_assignments_string.tours");
    }

    @Test
    public void testMismatchingTypes() throws IOException {
        List<String> errors = new ArrayList<>();
        errors.add("Error on line 2, pos 14");
        errors.add("Error on line 3, pos 14");
        errors.add("Error on line 4, pos 16");
        errors.add("Error on line 5, pos 13");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/invalid/mismatching_type.tours");
    }

    @Test
    public void testInvalidForStatement() throws IOException {
        List<String> errors = new ArrayList<>();
        errors.add("Error on line 5, pos 16");
        errors.add("Error on line 10, pos 16");
        errors.add("Error on line 15, pos 16");
        errors.add("Error on line 20, pos 16");
        errors.add("Error on line 25, pos 16");

        testTypeCheckerErrors(errors, "src/test/java/tours/examples/invalid/invalid_statements_for.tours");
    }

    @Test
    public void testInvalidIfStatement() throws IOException {
        List<String> errors = new ArrayList<>();
        errors.add("Error on line 6, pos 7");
        errors.add("Error on line 10, pos 7");
        errors.add("Error on line 14, pos 7");
        errors.add("Error on line 18, pos 7");
        errors.add("Error on line 22, pos 7");
        errors.add("Error on line 26, pos 7");
        errors.add("Error on line 30, pos 7");
        errors.add("Error on line 34, pos 7");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/invalid/invalid_statements_if.tours");
    }

    @Test
    public void testInvalidWhileStatement() throws IOException {
        List<String> errors = new ArrayList<>();
        errors.add("Error on line 6, pos 10");
        errors.add("Error on line 10, pos 10");
        errors.add("Error on line 14, pos 10");
        errors.add("Error on line 18, pos 10");
        errors.add("Error on line 22, pos 10");
        errors.add("Error on line 26, pos 10");
        errors.add("Error on line 30, pos 10");
        errors.add("Error on line 34, pos 10");
        testTypeCheckerErrors(errors, "src/test/java/tours/examples/invalid/invalid_statements_while.tours");
    }

    private void testTypeCheckerErrors(List<String> expected, String filename) throws IOException {
        ParseTree tree = parseTours(filename);
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeChecker typeChecker = new TypeChecker();
        walker.walk(typeChecker, tree);
        assertEquals(expected, typeChecker.getErrors());
    }

    private SymbolTable getSymbolTable(String filename) throws IOException {
        ParseTree tree = parseTours(filename);
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeChecker typeChecker = new TypeChecker();
        walker.walk(typeChecker, tree);
        return typeChecker.getSymbolTable();
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
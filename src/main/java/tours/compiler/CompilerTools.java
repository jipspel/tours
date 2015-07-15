package tours.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;
import tours.typechecker.TypeChecker;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class CompilerTools {

    /**
     * Lexes and parses a tours file
     * @param filename the name of the tours file
     * @return ParseTree of the file
     */
    public static ParseTree toToursParseTree(String filename) throws IOException {
        String file = new String(readAllBytes(get(filename)));

        CharStream chars = new ANTLRInputStream(file);
        ToursErrorListener errorListener = new ToursErrorListener();
        Lexer lexer = new ToursLexer(chars);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        TokenStream tokens = new CommonTokenStream(lexer);
        ToursParser parser = new ToursParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree program = parser.program();
        if (errorListener.getErrorList().size() > 0) {
            System.err.println("Error lexing and parsing: " + filename);
            System.err.println(errorListener.getErrorList());
            System.exit(1);
        }
        return program;
    }

    /**
     * Checks the types of the elements in the file
     * @param filename the name of the tours file
     * @return TypeChecker of the file
     */
    public static TypeChecker typeCheck(String filename) throws IOException {
        ParseTreeWalker walker = new ParseTreeWalker();
        TypeChecker typeChecker = new TypeChecker();
        walker.walk(typeChecker, CompilerTools.toToursParseTree(filename));
        return typeChecker;
    }

    /**
     * Compiles the file into Java Bytecode
     * @param filename the name of the tours file
     * @return the Bytecode corresponding to the tours file
     */
    public static String toByteCode(String filename) throws IOException {
        return new Compiler("Tours").toStringTemplate(filename).render();
    }

    /**
     * Compiles the file into Java Bytecode and writes it to a file
     * @param filename the name of the tours file
     * @param destination the location of the Bytecode file
     * @throws IOException
     */
    public static void toByteCode(String filename, String destination) throws IOException {
        Compiler compiler = new Compiler("Tours");
        compiler.toStringTemplate(filename).write(new File(destination), null);
    }

    /**
     * Compiles Bytecode to a Java class file
     * @param byteCodeFilename the name of the Bytecode file
     * @param destinationFolder the destination folder
     * @throws MalformedURLException
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static void compileByteCodeToClassFile(String byteCodeFilename, String destinationFolder) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> jasmin = new URLClassLoader(new URL[]{ new File("src/main/resources/jasmin.jar").toURI().toURL() }).loadClass("jasmin.Main");
        Method main = jasmin.getMethod("main", String[].class);
        main.invoke(null, (Object) new String[]{byteCodeFilename, "-d", destinationFolder});
    }

    /**
     * Runs the class file
     * @param klass the class name
     * @param workingDirectory the working directory
     * @return the output of the classFile
     * @throws Throwable
     */
    public static String runClassFile(String klass, String workingDirectory) throws Throwable {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        System.setErr(printStream);

        Class<?> tours = new URLClassLoader(new URL[]{ new File(workingDirectory).toURI().toURL() }).loadClass(klass);
        Method main = tours.getMethod("main", String[].class);
        try {
            main.invoke(null, (Object) new String[1]);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }

        return baos.toString();
    }
}

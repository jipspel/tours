package tours.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import tours.grammar.ToursErrorListener;
import tours.grammar.ToursLexer;
import tours.grammar.ToursParser;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class CompilerTools {
    public static ParseTree toToursParseTree(String filename) {
        String file = null;
        try {
            file = new String(readAllBytes(get(filename)));
        } catch (IOException e) {
            System.err.println("Error while reading: " + filename);
            System.exit(1);
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

        ParseTree program = parser.program();
        if (errorListener.getErrorList().size() > 0) {
            System.err.println("Error lexing and parsing: " + filename);
            System.err.println(errorListener.getErrorList());
            System.exit(1);
        }
        return program;
    }

    public static String toByteCode(String filename) {
        Compiler compiler = new Compiler("Tours");
        return compiler.process(filename).render();
    }

    public static void toByteCode(String filename, String destination) throws IOException {
        Compiler compiler = new Compiler("Tours");
        compiler.process(filename).write(new File(destination), null);
    }

    public static void compileByteCodeToClassFile(String byteCodeFilename, String destinationFolder) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> jasmin = new URLClassLoader(new URL[]{ new File("src/main/resources/jasmin.jar").toURI().toURL() }).loadClass("jasmin.Main");
        Method main = jasmin.getMethod("main", String[].class);
        main.invoke(null, (Object) new String[]{byteCodeFilename, "-d", destinationFolder});
    }

    public static String runClassFile(String klass, String workingDirectory, List<String> input) throws Throwable {
        if (input != null) {
            String inputLine = "";
            for (String line : input) {
                inputLine += line + System.getProperty("line.separator");
            }
            ByteArrayInputStream bais = new ByteArrayInputStream(inputLine.getBytes());
            System.setIn(bais);
        }

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

    public static String runClassFile(String klass, String workingDirectory) throws Throwable {
        return runClassFile(klass, workingDirectory, null);
    }
}

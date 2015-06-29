package tours.compiler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CompilerTools {
    public static String toByteCode(String text) {
        Compiler compiler = new Compiler("Tours");
        return compiler.process(text).render();
    }

    public static void toByteCode(String text, String destination) throws IOException {
        Compiler compiler = new Compiler("Tours");
        compiler.process(text).write(new File(destination), null);
    }

    public static void compileByteCodeToClassFile(String byteCodeFilename, String destinationFolder) {
        try {
            Class<?> jasmin = new URLClassLoader(new URL[]{ new File("src/main/resources/jasmin.jar").toURI().toURL() }).loadClass("jasmin.Main");
            Method main = jasmin.getMethod("main", String[].class);
            main.invoke(null, (Object) new String[]{ byteCodeFilename, "-d", destinationFolder});
        } catch (ClassNotFoundException | IllegalAccessException | MalformedURLException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static String runClassFile(String klass, String workingDirectory) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        System.setErr(printStream);

        try {
            Class<?> tours = new URLClassLoader(new URL[]{ new File(workingDirectory).toURI().toURL() }).loadClass(klass);
            Method main = tours.getMethod("main", String[].class);
            main.invoke(null, (Object) new String[1]);
        } catch (ClassNotFoundException | IllegalAccessException | MalformedURLException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return baos.toString();
    }
}

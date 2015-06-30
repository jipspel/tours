package tours.compiler;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

public class CompilerTools {
    public static String toByteCode(String text) {
        Compiler compiler = new Compiler("Tours");
        return compiler.process(text).render();
    }

    public static void toByteCode(String text, String destination) throws IOException {
        Compiler compiler = new Compiler("Tours");
        compiler.process(text).write(new File(destination), null);
    }

    public static void compileByteCodeToClassFile(String byteCodeFilename, String destinationFolder) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> jasmin = new URLClassLoader(new URL[]{ new File("src/main/resources/jasmin.jar").toURI().toURL() }).loadClass("jasmin.Main");
        Method main = jasmin.getMethod("main", String[].class);
        main.invoke(null, (Object) new String[]{byteCodeFilename, "-d", destinationFolder});
    }

    public static String runClassFile(String klass, String workingDirectory, List<String> input) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
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
        main.invoke(null, (Object) new String[1]);

        return baos.toString();
    }

    public static String runClassFile(String klass, String workingDirectory) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return runClassFile(klass, workingDirectory, null);
    }
}

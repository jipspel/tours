package tours.compiler;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

public class CompilerTools {
    public static String toByteCode(String text) {
        Compiler compiler = new Compiler("Tours");
        return compiler.process(text).render();
    }

    public static void toByteCode(String text, String destination) throws IOException {
        Compiler compiler = new Compiler("Tours");
        compiler.process(text).write(new File(destination), null);
    }

    public static void compileByteCodeToClassFile(String byteCodeFilename, String destinationFolder) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("java", "-jar", "src/main/resources/jasmin.jar", byteCodeFilename, "-d", destinationFolder);
//        processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        processBuilder.start().waitFor();
    }

    public static String runClassFile(String klass, String workingDirectory) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("java", "-classpath", workingDirectory, klass);
        Process process = processBuilder.start();
        process.waitFor();
        return IOUtils.toString(process.getErrorStream(), Charset.defaultCharset()) + IOUtils.toString(process.getInputStream(), Charset.defaultCharset());
    }
}

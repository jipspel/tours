package tours.compiler;

import java.io.*;

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
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("java", "-jar", "jasmin.jar", byteCodeFilename, "-d", destinationFolder);
//            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            processBuilder.start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static String runClassFile(String klass, String workingDirectory) throws IOException {
        Process process = null;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("java", "-classpath", workingDirectory, klass);
            process = processBuilder.start();
            process.waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return readInputStream(process.getInputStream());
    }

    public static String readInputStream(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line + System.getProperty("line.separator"));
            }
        } finally {
            br.close();
        }
        return sb.toString();
    }
}

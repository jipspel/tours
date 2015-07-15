package tours;

import org.apache.commons.io.FileUtils;
import tours.compiler.CompilerTools;
import tours.typechecker.TypeChecker;

import java.io.File;
import java.io.IOException;

public class Tours {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: filename.tours [--execute --no-bytecode] [--save directory]");
            System.exit(0);
        }

        try {
            TypeChecker typeChecker = CompilerTools.typeCheck(args[0]);
            if (typeChecker.getErrors().size() > 0) {
                System.err.println("Error while type checking: " + args[0]);
                System.err.println(typeChecker.getErrors());
                System.exit(1);
            }
        } catch (IOException e) {
            System.err.println("Error while reading: " + args[0]);
            e.printStackTrace();
            System.exit(1);
        } catch (CompilerTools.LexOrParseException e) {
            System.err.println("Error while lexing or parsing: " + args[0]);
            e.printStackTrace();
            System.exit(1);
        }

        boolean execute = false;
        boolean save = false;
        boolean noByteCode = false;
        if (args.length >= 2 && args[1].equals("--execute")) {
            execute = true;

            if (args.length >= 3 && args[2].equals("--no-bytecode")) {
                noByteCode = true;
            }
        }
        if (args.length >= 3 && args[1].equals("--save")) {
            save = true;
        }

        if (!noByteCode) {
            System.out.println("<<<");
            try {
                System.out.println(CompilerTools.toByteCode(args[0]));
            } catch (IOException e) {
                System.err.println("Error while reading: " + args[0]);
                e.printStackTrace();
                System.exit(1);
            } catch (CompilerTools.LexOrParseException e) {
                System.err.println("Error while lexing or parsing: " + args[0]);
                e.printStackTrace();
                System.exit(1);
            }

        System.out.println(">>>");
        }

        if (execute || save) {
            String filename = "./tmp/output.j";
            String workingDirectory = "./tmp";
            String outputDirectory = workingDirectory;

            if (save) {
                outputDirectory = args[2];
            }

            new File(workingDirectory).mkdir();

            try {
                CompilerTools.toByteCode(args[0], filename);
                CompilerTools.compileByteCodeToClassFile(filename, outputDirectory);
                if (execute) {
                    System.out.println(CompilerTools.runClassFile("Tours", outputDirectory));
                }

                FileUtils.deleteDirectory(new File(workingDirectory));
            } catch (Throwable e) {
                System.err.println("Error compiling and running: " + filename);
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

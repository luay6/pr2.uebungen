package pr2.io.filetest;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;

public class FileInfo {

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println(
                    "Bitte eine Datei oder ein Verzeichnis angeben");
            System.exit(1);
        }

        Path path = Path.of(args[0]).normalize().toAbsolutePath();

        if (Files.exists(path)) {
            System.out.printf("%s existiert%n", path);
            System.out.printf("%s ist %d Bytes groß%n", path, Files.size(path));
        }

        if (Files.isDirectory(path)) {
            System.out.printf("%s ist ein Verzeichnis%n", path);
        }

        if (Files.isRegularFile(path)) {
            System.out.printf("%s ist ein normale Datei%n", path);
        }

        if (Files.isReadable(path)) {
            System.out.printf("%s darf gelesen werden%n", path);
        }

        if (Files.isWritable(path)) {
            System.out.printf("%s darf geschrieben werden%n", path);
        }
    }
}

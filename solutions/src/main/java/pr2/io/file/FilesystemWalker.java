package pr2.io.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Klasse, die das Dateisystem durchläuft und Informationen ausgibt.
 */
public class FilesystemWalker {

    /**
     * Haupt-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     * @throws IOException IO-Probleme
     */
    public static void main(String[] args) throws IOException {

        String path = args.length > 0 ? args[0] : ".";

        Path root = Path.of(path).normalize().toAbsolutePath();

        System.out.println("Untersuche: " + root);
        System.out.println();

        long total = walk(root);

        System.out.println();
        System.out.println("Gesamtgröße: " + niceSize(total));
    }

    /**
     * Rekursive Methode, um den Baum zu durchlaufen.
     *
     * @param startDir Verzeichnis, bei dem gestartet werden
     *                 soll.
     * @return die Größe des Verzeichnisses.
     */
    private static long walk(Path startDir) {

        long size = 0;

        if (!Files.isDirectory(startDir)) {
            throw new IllegalArgumentException(
                    startDir + " ist kein Verzeichnis.");
        }

        try (Stream<Path> fileStream = Files.list(startDir)) {
            List<Path> files = fileStream.toList();

            for (Path file : files) {

                if (Files.isDirectory(file)
                        && Files.isReadable(file)
                        && Files.isExecutable(file)
                        && !Files.isSymbolicLink(file)
                        && Files.exists(file)) {
                    long dirSize = walk(file);
                    size += dirSize;
                    System.out.printf("%s - %s%n", niceSize(dirSize), file);
                }
                else if (Files.exists(file) && !Files.isSymbolicLink(file)) {
                    size += Files.size(file);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return size; 
    }

    /**
     * Wandelt die Größe in eine schönere Darstellung um.
     *
     * @param size Die Größe.
     * @return Schönere Darstellung.
     */
    private static String niceSize(long size) {

        if (size > 1000_000L) {
            return String.format("%.1f MByte", size / 1024.0 / 1024.0);
        }
        else if (size > 1000L) {
            return String.format("%.1f kByte", size / 1024.0);
        }
        else {
            return String.format("%d Byte", size);
        }
    }
}

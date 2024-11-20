package pr2.io.reader_writer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Liest eine Textdatei und gibt den Inhalt auf der Konsole aus.
 */
public class ReadAndPrintFile {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        String filename = args.length == 1
                ? args[0]
                : "pr2/io/reader_writer/kafka.txt";

        try (Reader r = new FileReader(filename)) {
            char[] buffer = new char[1024];
            int length;

            while ((length = r.read(buffer)) >= 0) {
                System.out.print(new String(buffer, 0, length));
            }
        } catch (IOException e) {
            System.err.println("IO-Problem: " + e);
        }
    }
}

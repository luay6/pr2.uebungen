package pr2.io.buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Liest eine Textdatei und gibt den Inhalt auf der Konsole aus.
 */
public class LineNumberPrinter {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        String filename = args.length == 1
                ? args[0]
                : "pr2/io/reader_writer/kafka.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(filename))) {

            String line;
            int count = 1;

            while ((line = r.readLine()) != null) {
                System.out.printf("%3d: %s%n", count, line);
                count++;
            }
        } catch (IOException e) {
            System.err.println("IO-Problem: " + e);
        }
    }
}

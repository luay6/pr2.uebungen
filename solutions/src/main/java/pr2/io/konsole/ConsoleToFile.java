package pr2.io.konsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Liest einen Text von der Console und
 * schreibt ihn dann in eine Datei. Allerdings
 * erfolgt das Schreiben über eine Ausgabeumleitung
 * und nicht über Dateioperationen.
 */
public class ConsoleToFile {

    /**
     * Logfile für Ausgaben.
     */
    private static final String LOGFILE = "console.log";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeile-Argumente.
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

             PrintStream ps = new PrintStream(LOGFILE)) {

            System.setOut(ps);

            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                System.err.println(count++);
            }
        } catch (IOException ex) {
            System.err.println("Dateiproblem: " + ex);
        }
    }
}

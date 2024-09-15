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

        // TODO: Von Konsole zeilenweise lesen
        // TODO: Aktuelle Anzahl der Zeilen auf System.err ausgeben
        // TODO: System.out in die Datei `LOGFILE` umleiten
    }
}

package pr2.io.konsole;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.sound.midi.SysexMessage;

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
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        // TODO: Von Konsole zeilenweise lesen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineNumber = 1;
        String line;
        while(((line = br.readLine()) != null) && !line.equals("exit") ) {
            PrintStream ps = new PrintStream(new FileOutputStream("tmp/console.log"));
            System.setOut(ps);
            System.out.println( line );
            // TODO: Aktuelle Anzahl der Zeilen auf System.err ausgeben
            System.err.println(lineNumber);
            lineNumber++;
            ps.close();
        }

        // TODO: System.out in die Datei `LOGFILE` umleiten


        br.close();

        
        
    }
}

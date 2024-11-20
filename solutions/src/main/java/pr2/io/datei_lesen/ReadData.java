package pr2.io.datei_lesen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Daten aus einer Datei lesen.
 */
public class ReadData {

    /**
     * Datei.
     */
    private static final String FILE = "pr2/io/datei_lesen/daten.dat";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {

        try (InputStream is = new FileInputStream(FILE)) {
            int data;
            while ((data = is.read()) != -1) {
                System.out.print("0x" + Integer.toHexString(data) + " ");
            }
        } catch (IOException e) {
            System.err.println("Problem mit Datei: " + e);
        }
    }
}

package pr2.io.datei_schreiben;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Daten aus einer Datei lesen.
 */
public class WriteData {

    /**
     * Datei.
     */
    public static final String FILE = "pr2/io/datei_schreiben/daten.dat";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {

        try (OutputStream os = new FileOutputStream(FILE)) {

            os.write(new byte[] {(byte) 0xca, (byte) 0xff, (byte) 0xfe,
                    (byte) 0xba, (byte) 0xbe, (byte) 0x00, (byte) 0xde,
                    (byte) 0xad, (byte) 0xbe, (byte) 0xef});
        } catch (IOException e) {
            System.err.println("Problem mit Datei: " + e);
        }
    }
}

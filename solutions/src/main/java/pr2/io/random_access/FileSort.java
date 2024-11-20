package pr2.io.random_access;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Sortierung von Dateien (in place).
 */
public class FileSort {

    /**
     * Sortiert die Datei von Byte-Werten per Bubble-Sort.
     *
     * @param filename Dateiname
     * @throws IOException IO-Probleme
     */
    public static void sortFile(String filename) throws IOException {

        RandomAccessFile rf = new RandomAccessFile(filename, "rw");

        byte b1; // erstes Byte
        byte b2; // zweites Byte

        long pos = 0;
        boolean swap = false;

        while (true) {
            // an die Position springen
            rf.seek(pos);

            // zwei Bytes lesen
            b1 = rf.readByte();
            b2 = rf.readByte();

            if (b1 > b2) {
                // erstes ist größer als zweites, austauschen
                rf.seek(pos);
                rf.write(b2);
                rf.write(b1);
                swap = true;
            }

            pos++;

            if (pos >= rf.length() - 1) {
                if (swap) {
                    pos = 0;
                    swap = false;
                }
                else {
                    break;
                }
            }
        }

        rf.close();
    }
}

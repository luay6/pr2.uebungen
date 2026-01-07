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

        RandomAccessFile file = new RandomAccessFile(filename, "rw");
        
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < file.length() - 1; i++) {
                    if (fil > file.seek( i + 1)) {
                        // Elemente vertauschen
                        swap(file, i, i + 1);
                        swapped = true;
                    }
                }
            } while (swapped);
        

    }
}

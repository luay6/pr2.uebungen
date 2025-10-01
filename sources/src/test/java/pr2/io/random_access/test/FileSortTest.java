package pr2.io.random_access.test;

import org.junit.jupiter.api.Test;
import pr2.io.random_access.FileSort;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testet die Sortierung per Random-Access-File.
 */
public class FileSortTest {

    /**
     * Kopiert die Datei f1 als Datei f2.
     *
     * @param f1 Quell-Datei
     * @param f2 Ziel-Datei
     * @throws IOException IO-Probleme
     */
    private static void copyFile(String f1, String f2) throws IOException {

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        int b;

        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();
    }

    /**
     * Testet die File-Sortierung.
     *
     * @throws IOException IO-Problem
     */
    @Test
    void testBubbleSort() throws IOException {
        String path = getClass().getResource("data.dat").getFile();

        copyFile(path, "/tmp/data.dat");
        FileSort.sortFile("/tmp/data.dat");

        InputStream is = new FileInputStream("/tmp/data.dat");

        int data;
        byte lastByte = 0;

        while ((data = is.read()) >= 0) {
            byte b = (byte) data;
            assertTrue(b >= lastByte);
            lastByte = b;
        }

        is.close();
    }
}

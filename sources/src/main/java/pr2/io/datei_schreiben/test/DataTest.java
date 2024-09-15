package pr2.io.datei_schreiben.test;

import org.junit.jupiter.api.Test;
import pr2.io.datei_schreiben.WriteData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static pr2.io.datei_schreiben.WriteData.FILE;

/**
 * Test für die geschriebenen Daten.
 */
public class DataTest {

    /**
     * Geschriebene Daten testen.
     *
     * @throws IOException Datei-Probleme.
     */
    @Test
    void testData() throws IOException {

        WriteData.main(new String[0]);

        InputStream is = new FileInputStream(FILE);

        byte[] buffer = new byte[10];
        is.read(buffer);
        assertArrayEquals(
                new byte[] {(byte) 0xca, (byte) 0xff, (byte) 0xfe, (byte) 0xba,
                        (byte) 0xbe, (byte) 0x00, (byte) 0xde, (byte) 0xad,
                        (byte) 0xbe, (byte) 0xef}, buffer);

        is.close();
    }
}

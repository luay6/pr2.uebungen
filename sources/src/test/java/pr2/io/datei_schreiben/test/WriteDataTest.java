package pr2.io.datei_schreiben.test;

import org.junit.jupiter.api.Test;
import pr2.io.datei_schreiben.WriteData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test für die geschriebenen Daten.
 */
public class WriteDataTest {

    /**
     * Geschriebene Daten testen.
     *
     * @throws IOException Datei-Probleme.
     */
    @Test
    void testData() throws IOException {
        final String testFile = "/tmp/test.dat";

        WriteData.main(new String[] { testFile });

        InputStream is = new FileInputStream(testFile);

        byte[] buffer = new byte[10];
        is.read(buffer);
        assertArrayEquals(
                new byte[] {(byte) 0xca, (byte) 0xff, (byte) 0xfe, (byte) 0xba,
                        (byte) 0xbe, (byte) 0x00, (byte) 0xde, (byte) 0xad,
                        (byte) 0xbe, (byte) 0xef}, buffer);

        is.close();
    }
}

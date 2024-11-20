package pr2.io.data_output.test;

import org.junit.jupiter.api.Test;
import pr2.io.data_output.Board;
import pr2.io.data_output.Color;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test.
 */
public class BoardTest {

    private static final byte[] RESULT = new byte[] {
            0x00, 0x0B, 0x53, 0x63, 0x68, 0x61, 0x63, 0x68, 0x62, 0x72, 0x65,
            0x74, 0x74, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00,
            0x00, 0x00, 0x01, 0x00, 0x07, 0x00, 0x00, 0x00, 0x00, 0x01, 0x06,
            0x00, 0x00, 0x00, 0x01, 0x01, 0x07, 0x00, 0x00, 0x00, 0x00, 0x02,
            0x04, 0x00, 0x00, 0x00, 0x01, 0x04, 0x05, 0x00, 0x00, 0x00, 0x01,
            0x07, 0x00, 0x00, 0x00, 0x00, 0x00, 0x07, 0x05, 0x00, 0x00, 0x00,
            0x00, (byte) 0xff, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF
    };

    /**
     * Test für die Implementierung des Spielbrettes.
     *
     * @throws IOException Datei-Probleme.
     */
    @Test
    void testDame() throws IOException {
        Board s = new Board();
        s.set("a1", Color.BLACK);
        s.set("b1", Color.WHITE);
        s.set("h1", Color.BLACK);
        s.set("h2", Color.BLACK);
        s.set("a8", Color.BLACK);
        s.set("f8", Color.BLACK);
        s.set("f5", Color.WHITE);
        s.set("e3", Color.WHITE);
        s.set("g2", Color.WHITE);

        String stringRepresentation = s.toString();

        s.writeToFile("/tmp/daten.dat");

        s = Board.loadFromFile("/tmp/daten.dat");

        assertEquals(stringRepresentation, s.toString());

        FileOutputStream fos = new FileOutputStream("/tmp/testdata.dat");
        fos.write(RESULT);
        fos.close();

        s = Board.loadFromFile("/tmp/testdata.dat");

        assertEquals(stringRepresentation, s.toString());
    }
}

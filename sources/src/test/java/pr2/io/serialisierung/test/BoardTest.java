package pr2.io.serialisierung.test;

import org.junit.jupiter.api.Test;
import pr2.io.serialisierung.Board;
import pr2.io.serialisierung.Color;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test.
 */
public class BoardTest {

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

        s.writeToFile("/tmp/board.dat");

        s = Board.loadFromFile("/tmp/board.dat");

        assertEquals(stringRepresentation, s.toString());
    }
}

package pr2.strukturierung.information_hiding;

import org.junit.jupiter.api.Test;
import pr2.strukturierung.information_hiding.Rechner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit-Test für den Rechner.
 */
public class RechnerTest {

    /**
     * Testet alle Grundoperationen des Rechners.
     */
    @Test
    void testRechner() {
        Rechner r = new Rechner();

        // 2 + 2 = 4
        r.addiere(2.0, 2.0);
        assertEquals(4.0, r.speicher, 0.0001);

        // 3 - 1 = 2
        r.subtrahiere(3, 1);
        assertEquals(2.0, r.speicher, 0.0001);

        // 3 * 3 = 9
        r.multipliziere(3, 3);
        assertEquals(9.0, r.speicher, 0.0001);

        // 2 + 2 * 2 = 6
        r.multipliziere(2, 2);
 
        r.addiere(2, r.speicher);
        assertEquals(6.0, r.speicher, 0.0001);
    }
}

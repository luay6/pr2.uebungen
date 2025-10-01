package pr2.vererbung.vererbung_geometrie;

import org.junit.jupiter.api.Test;
import pr2.vererbung.vererbung_geometrie.Dreieck;
import pr2.vererbung.vererbung_geometrie.Gerade;
import pr2.vererbung.vererbung_geometrie.Quadrat;
import pr2.vererbung.vererbung_geometrie.Rechteck;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests für die Figuren.
 */
public class FigurenTest {

    private static final double PRECISION = 0.0001;

    /**
     * Rechteck.
     */
    @Test
    void testReckteck() {
        Rechteck r1 = new Rechteck(4.0, 5.0);
        Rechteck r2 = new Rechteck(0.0, 3.0);
        assertEquals(20.0, r1.getFlaeche(), PRECISION);
        assertEquals(0.0, r2.getFlaeche(), PRECISION);
    }

    /**
     * Dreieck.
     */
    @Test
    void testDreieck() {
        Dreieck d1 = new Dreieck(6.0, 3.5);
        assertEquals(10.5, d1.getFlaeche(), PRECISION);
    }

    /**
     * Gerade.
     */
    @Test
    void testGerade() {
        Gerade g1 = new Gerade(8.0);
        assertEquals(8.0, g1.getLaenge(), PRECISION);
        assertEquals(0.0, g1.getFlaeche(), PRECISION);

        g1 = new Gerade(0.0);
        assertEquals(0.0, g1.getLaenge(), PRECISION);
        assertEquals(0.0, g1.getFlaeche(), PRECISION);
    }

    /**
     * Quadrat.
     */
    @Test
    void testQuadrat() {
        Quadrat q1 = new Quadrat(3.0);
        assertEquals(9.0, q1.getFlaeche(), PRECISION);

        Rechteck r1 = new Rechteck(5.0, 5.0);
        Quadrat q2 = new Quadrat(5.0);
        assertEquals(r1.getFlaeche(), q2.getFlaeche(), PRECISION);

        q1 = new Quadrat(0.0);
        assertEquals(0.0, q1.getFlaeche(), PRECISION);
    }
}

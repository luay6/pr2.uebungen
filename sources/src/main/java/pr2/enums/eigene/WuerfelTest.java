package pr2.enums.eigene;
import static pr2.enums.eigene.WuerfelTyp.*;
import org.junit.jupiter.api.Test;
import pr2.enums.eigene.Wuerfel;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test für die Würfel.
 */
public class WuerfelTest {

    /**
     * Anzahl der Durchläufe (Gesetz der großen Zahl!).
     */
    private static final int RUNS = 10000000;


    @Test
    void testWuerfel() {
        for(WuerfelTyp type : WuerfelTyp.values()) {
            Wuerfel w = new Wuerfel(type);
            internalTestFairness(w, type.average());
        }
    }

    /**
     * Interne Hilfsmethode, um die Fairness zu testen.
     *
     * @param w        der zu testende Wuerfel.
     * @param expected Erwartungswert.
     */
    private void internalTestFairness(Wuerfel w, double expected) {
        long sum = 0;

        for (int i = 0; i < RUNS; i++) {
            sum += w.roll();
        }
        double average = (double) sum / (double) RUNS;
        assertEquals(expected, average, 0.1);
    }
}

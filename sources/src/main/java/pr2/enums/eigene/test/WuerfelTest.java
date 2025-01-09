package pr2.enums.eigene.test;

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
    void testFairnessD4() {
        internalTestFairness(new Wuerfel(Wuerfel.D4), 2.5);
    }

    @Test
    void testFairnessD6() {
        internalTestFairness(new Wuerfel(Wuerfel.D6), 3.5);
    }

    @Test
    void testFairnessD8() {
        internalTestFairness(new Wuerfel(Wuerfel.D8), 4.5);
    }

    @Test
    void testFairnessD10() {
        internalTestFairness(new Wuerfel(Wuerfel.D10), 5.5);
    }

    @Test
    void testFairnessD12() {
        internalTestFairness(new Wuerfel(Wuerfel.D12), 6.5);
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

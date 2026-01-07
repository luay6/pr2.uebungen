package pr2.auffrischung.suchemax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroessteZahlTest {

    @Test
    void testSucheMax() {
        GroessteZahl g = new GroessteZahl();
        assertEquals(8, g.sucheMax(
                new int[] {1, 5, 8, 2, 0}));
        assertEquals(-1, g.sucheMax(
                new int[] {-1, -5, -8, -2, -20}));
        assertEquals(10000, g.sucheMax(
                new int[] {10000, -10000, 1, 2, 33}));
        assertEquals(9, g.sucheMax(
                new int[] {9}));
        assertEquals(0, g.sucheMax(
                new int[] {0, 0, 0, 0, 0, 0, 0}));
        assertEquals(Integer.MAX_VALUE, g.sucheMax(
                new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
        assertEquals(Integer.MIN_VALUE, g.sucheMax(
                new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE}));
    }
}

package pr2.auffrischung.labeled_break;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArraySucherTest {

    final int[][] EMPTY = {{}};
    final int[][] ZERO = { { 0, 0, 0 }, { 0, 0, 0 }};
    final int[][] END = { { 0, 0, 0 }, { 0, 0, 1 }};
    final int[][] BEGINNING = { { 1, 0, 0 }, { 0, 0, 0 }};
    final int[][] ONE = { { 1, 1, 1 }, { 1, 1, 1 }};
    final int[][] TRIANGLE = { { 0, 0 }, { 0, 0 }, { 0, 0, 0 }, { 0, 0, 0, 1 } };


    @Test
    void testSuche() {
        var as = new ArraySucher();
        assertFalse(as.suche(EMPTY));
        assertFalse(as.suche(ZERO));
        assertTrue(as.suche(END));
        assertTrue(as.suche(BEGINNING));
        assertTrue(as.suche(ONE));
        assertTrue(as.suche(TRIANGLE));
    }
}

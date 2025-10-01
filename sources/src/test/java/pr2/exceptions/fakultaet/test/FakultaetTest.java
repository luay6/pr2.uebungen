package pr2.exceptions.fakultaet.test;

import org.junit.jupiter.api.Test;
import pr2.exceptions.fakultaet.Fakultaet;
import pr2.exceptions.fakultaet.FakultaetException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FakultaetTest {

    @Test
    void testFact() {
        Fakultaet f = new Fakultaet();
        assertEquals(1, f.fact(0));
        assertEquals(1, f.fact(1));
        assertEquals(2, f.fact(2));
        assertEquals(6, f.fact(3));
        assertEquals(24, f.fact(4));
        assertEquals(3628800, f.fact(10));
    }

    @Test
    void testFactEx1() {
        // TODO: Auf Ausnahme testen
    }

    @Test
    void testFactEx2() {
        // TODO: Auf Ausnahme testen
    }
}

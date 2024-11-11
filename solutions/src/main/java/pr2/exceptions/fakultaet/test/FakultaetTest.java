package pr2.exceptions.fakultaet.test;

import org.junit.jupiter.api.Test;
import pr2.exceptions.fakultaet.Fakultaet;
import pr2.exceptions.fakultaet.FakultaetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;  

public class FakultaetTest {

    @Test
    void testFact() throws FakultaetException { 
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
        assertThrows(FakultaetException.class, () -> {
            Fakultaet f = new Fakultaet();
            f.fact(-1);
        });
    }

    @Test
    void testFactEx2() {
        assertThrows(FakultaetException.class, () -> {
            Fakultaet f = new Fakultaet();
            f.fact(21);
        });
    }
}

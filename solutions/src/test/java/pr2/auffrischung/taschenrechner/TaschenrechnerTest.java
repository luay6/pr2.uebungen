package pr2.auffrischung.taschenrechner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaschenrechnerTest {

    @Test
    void testRechne() {
        Taschenrechner t = new Taschenrechner();
        assertEquals(0.0, t.rechne(0.0, '+', 0.0));
        assertEquals(0.0, t.rechne(0.0, '-', 0.0));
        assertEquals(0.0, t.rechne(0.0, '*', 0.0));
        assertEquals(0.0, t.rechne(0.0, '/', 1.0));
        assertEquals(0.0, t.rechne(0.0, '^', 1.0));

        assertEquals(2.0, t.rechne(1.0, '+', 1.0));
        assertEquals(0.0, t.rechne(1.0, '-', 1.0));
        assertEquals(1.0, t.rechne(1.0, '*', 1.0));
        assertEquals(1.0, t.rechne(1.0, '/', 1.0));
        assertEquals(1.0, t.rechne(1.0, '^', 1.0));

        assertEquals(4.4, t.rechne(2.2, '+', 2.2));
        assertEquals(2.2, t.rechne(4.4, '-', 2.2));
        assertEquals(4.4, t.rechne(2.2, '*', 2.0));
        assertEquals(2.0, t.rechne(2.2, '/', 1.1));
        assertEquals(4.0, t.rechne(2.0, '^', 2.0));

        assertEquals(Double.NaN, t.rechne(1.0, '~', 1.0));

        assertNotEquals(0.0, t.rechne(1.0, '~', 1.0) );
    }
}

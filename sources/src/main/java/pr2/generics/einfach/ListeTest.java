package pr2.generics.einfach;

import org.junit.jupiter.api.Test;
import pr2.generics.einfach.Liste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test für die Liste.
 */
public class ListeTest {

    /**
     * Testet das Hinzufügen und Löschen der Liste.
     */
    @Test
    void testAddAndClear() {
        Liste l = new Liste();

        assertEquals(0, l.size());

        l.add("Hallo");
        assertEquals(1, l.size());
        l.add("Hugo");
        assertEquals(2, l.size());
        l.add("Peter");
        l.add("Alfons");
        assertEquals(4, l.size());

        l.clear();
        assertEquals(0, l.size());
    }

    /**
     * Testet das Lesen von Elementen.
     */
    @Test
    void testGet() {
        Liste l = new Liste();
        l.add("Hallo");
        l.add("Hugo");
        l.add("Peter");
        l.add("Alfons");

        assertNull(l.get(-1));
        assertNull(l.get(4));
        assertEquals("Hallo", l.get(0));
        assertEquals("Hugo", l.get(1));
        assertEquals("Peter", l.get(2));
        assertEquals("Alfons", l.get(3));

        assertEquals(4, l.size());
        l.clear();
        assertEquals(0, l.size());
        assertNull(l.get(0));
        assertNull(l.get(1));
        assertNull(l.get(2));
        assertNull(l.get(3));
    }
}

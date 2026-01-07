package pr2.vererbung.konstruktoren;

import org.junit.jupiter.api.Test;
import pr2.vererbung.konstruktoren.Nachtelf;
import pr2.vererbung.konstruktoren.Untoter;
import pr2.vererbung.konstruktoren.Wesen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test für die Aufgabe.
 */
public class WesenTest {

    /**
     * Testet den Nachtelf.
     */
    @Test
    void testNachtelf() {

        assertTrue(new Nachtelf("") instanceof Wesen,
                "Nachtelf erbt nicht " + "von Wesen");

        assertEquals(Nachtelf.STANDARD_NATURWIDERSTAND,
                new Nachtelf("").getNaturwiderstand());

        assertEquals(120, new Nachtelf("", 120).getNaturwiderstand());

        assertEquals("Hugo", new Nachtelf("Hugo").getName());
    }

    /**
     * Testet den Untoten.
     */
    @Test
    void testUntoten() {
        assertTrue(new Untoter("") instanceof Wesen,
                "Untoter erbt nicht von " + "Wesen");

        assertEquals(Untoter.STANDARD_UNTERWASSERATMUNG,
                new Untoter("").getUnterwasseratmung());

        assertEquals(120, new Untoter("", 120).getUnterwasseratmung());

        assertEquals("Hugo", new Untoter("Hugo").getName());
    }
}

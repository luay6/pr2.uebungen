package pr2.exceptions.ausnahmen_testen;
import pr2.exceptions.ausnahmen_testen.CrypterCaesar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.exceptions.ausnahmen_testen.IllegalKeyException;
import pr2.exceptions.ausnahmen_testen.IllegalMessageException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Testklasse für die Verschlüsselung.
 */
public class CaesarTest {

    void testAusnahme() throws IllegalMessageException, IllegalKeyException {
        String klarText = "KATHARGOMUSSFALLEN";
        CrypterCaesar c = new CrypterCaesar();
        try {
            c.encrypt(klarText, klarText);
            fail();
        }
        catch(IllegalKeyException e) {
            assertTrue(true);
        }
        
        try {
            c.encrypt(klarText, klarText);
            fail();
        }
        catch(IllegalMessageException e) {
            assertTrue(true);
        }
    }

    /**
     * Testet die Verschlüsselung an sich.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testCaesar()
            throws IllegalKeyException, IllegalMessageException {
        String klarText = "AAAAAAAA";
        CrypterCaesar c = new CrypterCaesar();
        assertEquals(klarText, c.decrypt("C", c.encrypt("C", klarText)));
        assertEquals("FDHVDU", c.encrypt("C", "CAESAR"));
        assertEquals(klarText, c.encrypt("Z", klarText));
    }
}

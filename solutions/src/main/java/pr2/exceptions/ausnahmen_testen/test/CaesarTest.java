package pr2.exceptions.ausnahmen_testen.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.exceptions.ausnahmen_testen.CrypterCaesar;
import pr2.exceptions.ausnahmen_testen.IllegalKeyException;
import pr2.exceptions.ausnahmen_testen.IllegalMessageException;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Testklasse für die Verschlüsselung.
 */
public class CaesarTest {


    /**
     * Testet auf falschen Schlüssel.
     *
     * @throws pr2.exceptions.ausnahmen_testen.IllegalMessageException
     * Wird geworfen, wenn die Nachricht ungültig ist.
     * @throws pr2.exceptions.ausnahmen_testen.IllegalKeyException
     * Wird geworfen, wenn der Schlüssel ungültig ist.
     */
    @Test
    void testWrongKey1()
            throws IllegalKeyException, IllegalMessageException {

        String key = "AB";
        CrypterCaesar c = new CrypterCaesar();

        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.encrypt(key, "HALLO");
        });
    }

    /**
     * Testet auf falschen Schlüssel.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testWrongKey2()
            throws IllegalKeyException, IllegalMessageException {
        String key = "0";
        CrypterCaesar c = new CrypterCaesar();
        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.encrypt(key, "HALLO");
        });
    }

    /**
     * Testet auf falsche Nachricht.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testWrongMessage1()
            throws IllegalKeyException, IllegalMessageException {
        String key = "K";
        CrypterCaesar c = new CrypterCaesar();

        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.encrypt(key, "üäaD&");
        });
    }

    /**
     * Testet auf falsche Nachricht.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testWrongMessage2()
            throws IllegalKeyException, IllegalMessageException {
        String key = "K";
        CrypterCaesar c = new CrypterCaesar();

        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.encrypt(key, "üäaD&");
        });
    }

    /**
     * Testet auf falsche Nachricht.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testWrongCypher1()
            throws IllegalKeyException, IllegalMessageException {
        String key = "K";
        CrypterCaesar c = new CrypterCaesar();

        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.decrypt(key, "üäaD&");
        });
    }

    /**
     * Testet auf falsche Nachricht.
     *
     * @throws IllegalMessageException Wird geworfen, wenn die
     *                                 Nachricht ungültig ist.
     * @throws IllegalKeyException     Wird geworfen, wenn der Schlüssel
     *                                 ungültig ist.
     */
    @Test
    void testWrongCypher2()
            throws IllegalKeyException, IllegalMessageException {
        String key = "K";
        CrypterCaesar c = new CrypterCaesar();
        Assertions.assertThrows(IllegalKeyException.class, () -> {
            c.decrypt(key, "DIESiSTEINTEST&");
        });
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
        String klarText = "KATHARGOMUSSFALLEN";
        CrypterCaesar c = new CrypterCaesar();
        assertEquals(klarText, c.decrypt("C", c.encrypt("C", klarText)));
        assertEquals("FDHVDU", c.encrypt("C", "CAESAR"));
        assertEquals(klarText, c.encrypt("Z", klarText));
    }
}

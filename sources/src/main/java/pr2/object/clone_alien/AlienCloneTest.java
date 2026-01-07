package pr2.object.clone_alien;

import org.junit.jupiter.api.Test;
import pr2.object.clone_alien.Alien;
import pr2.object.clone_alien.Raumanzug;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Test für die Clone-Methoden.
 */
public class AlienCloneTest {

    /**
     * Test-Methode.
     *
     * @throws CloneNotSupportedException wird geworfen, wenn clone_alien
     *                                    nicht korrekt implementiert wurde.
     */
    @Test
    void testClone() throws CloneNotSupportedException {
// TODO: Einkommentieren
        Raumanzug r1 = new Raumanzug();
        Alien a1 = new Alien("Predator", r1);

        Alien a2 = (Alien) a1.clone();
        Raumanzug r2 = a2.getAnzug();

        assertNotSame(a1, a2);
        assertNotSame(r1, r2);

        assertEquals(a1, a2);
        assertEquals(r1, r2);
        assertEquals(r1.getSauerstoffVorrat(), r2.getSauerstoffVorrat(),
                0.0001);
    }
}

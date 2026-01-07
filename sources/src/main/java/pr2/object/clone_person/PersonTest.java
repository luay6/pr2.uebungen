package pr2.object.clone_person;

import org.junit.jupiter.api.Test;
import pr2.object.clone_alien.Alien;
import pr2.object.clone_alien.Raumanzug;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Test für die Clone-Methoden.
 */
public class PersonTest {

    /**
     * Test-Methode.
     *
     * @throws CloneNotSupportedException wird geworfen, wenn clone_alien
     *                                    nicht korrekt implementiert wurde.
     */
    @Test
    void testClone() throws CloneNotSupportedException {
// TODO: Einkommentieren
     
        Person a1 = new Person();

        Person a2 = (Person) a1.clone();
        

        assertNotSame(a1, a2);
        assertNotSame(a1.geburtsdatum, a2.geburtsdatum);
        //assertEquals(a1, a2);
        assertEquals(a1.geburtsdatum, a2.geburtsdatum);
    }
}

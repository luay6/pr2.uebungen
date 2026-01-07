package pr2.object.equals_person;

import org.junit.jupiter.api.Test;
import pr2.object.equals_hashcode.Ork;
import pr2.object.equals_hashcode.Wesen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Testklasse für die Wesen.
 */
public class PersonTest {

    /**
     * Testet equals und hashCode von Wesen.
     */
    @Test
    void testWesen() {
        Person w1 = new Person("Azok", "Arok", 30);
        Person w2 = new Person("Azok", "Arok", 30);
        Person w3 = new Person("Azok", "Arok", 31);
        Person w4 = new Person("Gorrok", "Morok", 30);
        Person w5 = new Person("Gorrok", "Morok", 31);

        assertNotSame(w1, w2);
        assertEquals(w1, w2);
        assertNotSame(w2, w3);
        assertNotEquals(w2, w3);
        assertNotSame(w1, w3);
        assertNotEquals(w1, w3);

        assertNotSame(w1, w4);
        assertNotEquals(w1, w4);

        assertNotSame(w1, w5);
        assertNotEquals(w1, w5);

        assertEquals(w1.hashCode(), w2.hashCode());
    }
}

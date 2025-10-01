package pr2.object.equals_hashcode.test;

import org.junit.jupiter.api.Test;
import pr2.object.equals_hashcode.Ork;
import pr2.object.equals_hashcode.Wesen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Testklasse für die Wesen.
 */
public class WesenTest {

    /**
     * Testet equals und hashCode von Wesen.
     */
    @Test
    void testWesen() {
        Wesen w1 = new Wesen("Azok", 30);
        Wesen w2 = new Wesen("Azok", 30);
        Wesen w3 = new Wesen("Azok", 31);
        Wesen w4 = new Wesen("Gorrok", 30);
        Wesen w5 = new Wesen("Gorrok", 31);

        assertNotSame(w1, w2);
        assertEquals(w1, w2);

        assertNotSame(w1, w3);
        assertNotEquals(w1, w3);

        assertNotSame(w1, w4);
        assertNotEquals(w1, w4);

        assertNotSame(w1, w5);
        assertNotEquals(w1, w5);

        assertEquals(w1.hashCode(), w2.hashCode());
    }

    /**
     * Testet equals und hashCode von Ork.
     */
    @Test
    void testOrk() {
        Ork o1 = new Ork("Snagas", true);
        Ork o2 = new Ork("Snagas", true);
        Ork o3 = new Ork("Snagas", false);
        Ork o4 = new Ork("Berg-Ork", false);
        Ork o5 = new Ork("Berg-Ork", true);
        Ork o6 = new Ork("Berg-Ork", false);
        Wesen w = new Wesen("Snagas", 17);

        assertNotSame(o1, o2);
        assertEquals(o1, o2);

        assertNotSame(o1, o3);
        assertNotEquals(o1, o3);

        assertNotSame(o1, o4);
        assertNotEquals(o1, o4);

        assertNotSame(o1, o5);
        assertNotEquals(o1, o5);

        assertEquals(o1.hashCode(), o2.hashCode());
        assertEquals(o4.hashCode(), o6.hashCode());

        assertNotEquals(w, o1);
        assertNotEquals(w, o2);
        assertNotEquals(w, o3);
        assertNotEquals(null, o1);
        assertNotEquals("Hugo", o1);
        assertEquals(o1, o1);

        // Diese Tests muss nicht zwangsweise funktionieren, da
        // ungleiche Objekte einen identischen Hashcode haben können.
        // Wir gehen hier aber davon aus, dass eine Hashkollision
        // sehr selten ist und machen daher aus didaktischen Gründen
        // diesen Test.
        assertNotEquals(o1.hashCode(), o3.hashCode());
        assertNotEquals(o1.hashCode(), o4.hashCode());
        assertNotEquals(o1.hashCode(), o5.hashCode());
        assertNotEquals(o4.hashCode(), o5.hashCode());
    }
}

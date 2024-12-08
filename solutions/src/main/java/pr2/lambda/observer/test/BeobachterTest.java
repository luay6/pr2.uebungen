
package pr2.lambda.observer.test;

import org.junit.jupiter.api.Test;
import pr2.lambda.observer.Beobachter;
import pr2.lambda.observer.Datenhalter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeobachterTest {

    @Test
    void testBeobachter() {
        Datenhalter dh = new Datenhalter(42);
        Beobachter b = dh.getBeobachter();
        assertEquals(42, b.getValue());
    }
}

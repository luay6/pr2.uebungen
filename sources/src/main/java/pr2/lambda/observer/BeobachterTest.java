package pr2.lambda.observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class BeobachterTest {

    @Test
    @DisplayName("")
    public void testBeobachterAccess() {
        // 1. الترتيب (Arrange): ننشئ كائناً بقيمة 123
        int initialValue = 123;
        Datenhalter dh = new Datenhalter(initialValue);

        Beobachter b = dh.getBeobachter();
        int valueFromObserver = b.getValue();
        
        assertEquals(initialValue, valueFromObserver, "     123");
    }

    @Test
    @DisplayName("")
    public void testMultipleInstances() {
        Datenhalter dh1 = new Datenhalter(10);
        Datenhalter dh2 = new Datenhalter(20);

        Beobachter b1 = dh1.getBeobachter();
        Beobachter b2 = dh2.getBeobachter();

        assertAll(
            () -> assertEquals(10, b1.getValue(), "10"),
            () -> assertEquals(20, b2.getValue(), "20")
        );
    }
}
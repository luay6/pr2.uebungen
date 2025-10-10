package pr2.auffrischung.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pr2.auffrischung.password.PasswortChecker.checkPassword;

public class PasswortCheckerTest {

    @Test
    void testPasswordChecker() {
        assertEquals(0, checkPassword("mutti"));
        assertEquals(0, checkPassword("1234"));
        assertEquals(1, checkPassword("Mutti"));
        assertEquals(2, checkPassword("mutti123"));
        assertEquals(3, checkPassword("Mutti123"));
        assertEquals(4, checkPassword("Mutti123!%"));
    }
}

package pr2.streams.chars_3.test;

import org.junit.jupiter.api.Test;
import pr2.streams.chars_3.CountLetters;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testCount() {
        List<String> liste = Arrays.asList("Hallo", "Welt", "wie", "geht",
                "es");

        assertEquals(16, CountLetters.count(liste));
    }
}

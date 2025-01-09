package pr2.streams.chars_1.test;

import org.junit.jupiter.api.Test;
import pr2.streams.chars_1.CountLetters;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testCount() {
        String s = "Dies ist ein String mit einer ganzen Reihe von "
                + "Buchstaben.";

        assertEquals(44, CountLetters.count(s));
    }
}

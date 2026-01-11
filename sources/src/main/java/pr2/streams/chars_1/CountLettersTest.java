package pr2.streams.chars_1;

import org.junit.jupiter.api.Test;
import pr2.streams.chars_1.CountLetters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

public class CountLettersTest {
    @Test
    void testCount() {
        String s = "Das ist ein Text, wo kleinbuchstaben gezählt werden";
        Assertions.assertEquals(41,CountLetters.count(s));
        Assertions.assertEquals(10,  CountLetters.count("hello hello"));
    }
}

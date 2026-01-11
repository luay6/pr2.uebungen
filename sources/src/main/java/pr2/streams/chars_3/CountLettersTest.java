package pr2.streams.chars_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.streams.chars_3.CountLetters;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testCount() {
        Assertions.assertEquals(2, CountLetters.count(Arrays.asList("aA", "bB")));
        Assertions.assertEquals(10, CountLetters.count(Arrays.asList("Hello", "My", "Friend")));
    }
}

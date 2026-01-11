package pr2.streams.chars_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.streams.chars_2.CountLetters;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testCount() {
        Assertions.assertEquals(0, CountLetters.count(Arrays.asList("")));
        Assertions.assertEquals(13, CountLetters.count(Arrays.asList("hello", "my", "friend")));
    }
}

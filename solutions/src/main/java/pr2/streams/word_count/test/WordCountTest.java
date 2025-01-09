package pr2.streams.word_count.test;

import org.junit.jupiter.api.Test;
import pr2.streams.word_count.WordCount;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTest {

    @Test
    void testWordCount() {
        List<String> liste = Arrays.asList("A", "A", "B", "B", "B", "C",
                "D", "D", "E", "E", "E", "F");

        assertEquals(Arrays.asList("A->2", "B->3", "C->1", "D->2",
                "E->3", "F->1"), WordCount.count(liste));
    }
}

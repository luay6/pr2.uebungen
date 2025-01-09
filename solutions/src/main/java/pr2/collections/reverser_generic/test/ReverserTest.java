package pr2.collections.reverser_generic.test;

import org.junit.jupiter.api.Test;
import pr2.collections.reverser_generic.Reverser;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverserTest {

    @Test
    void testReverser() {
        List<String> testListe = Arrays.asList("Meier", "Zabelmann", "Schulze",
                "Xavier", "Albert");
        new Reverser<String>().reverse(testListe);
        assertEquals(Arrays.asList(
                "Zabelmann", "Xavier", "Schulze", "Meier", "Albert"),
                        testListe);
    }

}

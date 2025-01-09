package pr2.streams.reduce.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.streams.reduce.Squarer;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquarerTest {

    @Test
    void testMitMap() {
        List<Integer> l = Arrays.asList(1, 5, 8, 9, 12, 10, 3);
        Assertions.assertEquals(424, Squarer.mitMap(l));
    }

    @Test
    void testOhneMap() {
        List<Integer> l = Arrays.asList(1, 5, 8, 9, 12, 10, 3);
        assertEquals(424, Squarer.ohneMap(l));
    }

}

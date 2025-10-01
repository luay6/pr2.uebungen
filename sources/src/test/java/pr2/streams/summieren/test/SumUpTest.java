package pr2.streams.summieren.test;

import org.junit.jupiter.api.Test;
import pr2.streams.summieren.SumUp;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumUpTest {

    @Test
    void testSum() {
        List<Integer> l = Arrays.asList(1, 5, 8, 9, 12, 10, 3);
        assertEquals(48, SumUp.sumUp(l.stream()));
    }
}

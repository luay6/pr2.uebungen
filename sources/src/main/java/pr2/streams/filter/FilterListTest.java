package pr2.streams.filter;

import org.junit.jupiter.api.Test;
import pr2.streams.filter.FilterList;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterListTest {

    @Test
    void testFilter() {
        List<String> liste = Arrays.asList(
                "Hallo", "Welt", "Dampfschifffahrt", "Hundekuchen",
                "Fiction", "Java", "Visual Basic", "Drucker");

        List<String> result = Arrays.asList(
                "hallo", "dampfschifffahrt", "hundekuchen",
                "fiction", "visual basic", "drucker");

        assertEquals(result, FilterList.filter(liste));
    }
}

package pr2.collections.reverser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverserTest {

    @Test
    void testReverser() {
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Basil");
        stringArray.add("Carl");
        stringArray.add("Amir");
        stringArray.add("Daniel");
        Reverser reverser = new Reverser();
        @SuppressWarnings({ "unchecked", "rawtypes" })
        ArrayList<String> reversed = new ArrayList<>(Arrays.asList("Daniel", "Carl", "Basil", "Amir"));
        reverser.reverse(stringArray);
        Assertions.assertEquals(reversed, stringArray);
    }

}

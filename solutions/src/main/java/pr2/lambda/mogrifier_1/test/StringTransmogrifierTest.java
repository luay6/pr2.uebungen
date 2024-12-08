package pr2.lambda.mogrifier_1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.lambda.mogrifier_1.StringTransmogrifier;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringTransmogrifierTest {

    @Test
    void testMogrification() {
        String[] elements = {"Hello", "World"};

        Assertions.assertArrayEquals(new String[] { "hello", "world"},
                StringTransmogrifier.transmogrify(elements,
                        String::toLowerCase));

        assertArrayEquals(new String[] { "HELLO", "WORLD"},
                StringTransmogrifier.transmogrify(elements,
                        String::toUpperCase));

        assertArrayEquals(new String[] { "Ifmmp", "Xpsme"},
                StringTransmogrifier.transmogrify(elements,
                        s -> {
                            char[] c = s.toCharArray();
                            for (int i = 0; i < c.length; i++) {
                                c[i] = (char) (c[i] + 1);
                            }
                            return new String(c);
                        }));
    }
}

package pr2.lambda.mogrifier_2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.lambda.mogrifier_2.StringFunction;
import pr2.lambda.mogrifier_2.StringTransmogrifier;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringTransmogrifierTest {

    static final String[] ELEMENTS = {"Hello", "World"};

    @Test
    void testMogrification() {


        Assertions.assertArrayEquals(new String[] {"hello", "world"},
                StringTransmogrifier.transmogrify(ELEMENTS,
                        String::toLowerCase));

        assertArrayEquals(new String[] {"HELLO", "WORLD"},
                StringTransmogrifier.transmogrify(ELEMENTS,
                        String::toUpperCase));

        assertArrayEquals(new String[] {"Ifmmp", "Xpsme"},
                StringTransmogrifier.transmogrify(ELEMENTS,
                        s -> {
                            char[] c = s.toCharArray();
                            for (int i = 0; i < c.length; i++) {
                                c[i] = (char) (c[i] + 1);
                            }
                            return new String(c);
                        }));
    }

    @Test
    void testCaesar() {
        assertArrayEquals(new String[] {"Khoor", "Zruog"},
                StringTransmogrifier.transmogrify(ELEMENTS,
                        StringFunction.caesar(3)));
    }
}

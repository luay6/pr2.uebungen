package pr2.lambda.mogrifier_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.lambda.mogrifier_1.StringTransmogrifier;

public class StringTransmogrifierTest {

    @Test
    void testMogrification() {
        String[] strings = { "hello world", "HALLO WELT", "gdkkn vnqkc" };
        String[] result = new String[strings.length];
        String[] upperCase = new String[] { "HELLO WORLD", "HALLO WELT",
                "GDKKN VNQKC" };
        String[] lowerCase = new String[] { "hello world", "hallo welt",
                "gdkkn vnqkc" };
        String[] toShift = new String[] {"gdkkn", "lx", "eqhdmc"};
        String[] shifted = new String[] { "hello", "my", "friend" };
        result = StringTransmogrifier.transmogrify(strings,
                String::toUpperCase);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], upperCase[i]);
        }

        result = StringTransmogrifier.transmogrify(strings,
                String::toLowerCase);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], lowerCase[i]);
        }
        result = StringTransmogrifier.transmogrify(toShift,
                s-> {
                        String newString = "";
                        char[] charArray = s.toCharArray();
                        for (int i = 0; i < charArray.length; i++) {
                            char c = charArray[i];
                            if (c >= 'a' && c <= 'z') {
                                charArray[i] = (char) ((c - 'a' + 1) % 26 + 'a');
                            } 
                          
                            else if (c >= 'A' && c <= 'Z') {
                                charArray[i] = (char) ((c - 'A' + 1) % 26 + 'A');
                            }
                        }
                        newString = new String(charArray);

                        return newString;
                   
                });
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], shifted[i]);
        }
    }
}

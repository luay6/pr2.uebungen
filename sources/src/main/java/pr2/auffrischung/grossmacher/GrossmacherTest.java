package pr2.auffrischung.grossmacher;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrossmacherTest {

    private static PrintStream out;

    @BeforeAll
    static void setup() {
        out = System.out;
    }

    @AfterAll
    static void tearDown() {
        System.setOut(out);
    }

    @ParameterizedTest
    @ValueSource(strings = { "alles klein", "ALLES GROSS", "gemIschT" })
    void testMain(String text) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bos);
        System.setOut(ps);

        Grossmacher.main(new String[] { text });
        String result = String.format("Ergebnis: %s\nZeichen : %d",
                text.toUpperCase(),
                text.length());

        assertEquals(result, bos.toString().trim());
        bos.close();
        // Don't close ps!
    }
}

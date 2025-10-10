package pr2.auffrischung.printf;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pr2.auffrischung.printf.DoubleFormatter.printDouble;

public class DoubleFormatterTest {

    private static PrintStream out;

    @BeforeAll
    static void setup() {
        out = System.out;
    }

    @AfterAll
    static void tearDown() {
        System.setOut(out);
    }

    @Test
    void testPrintf() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream out = System.out;
        PrintStream ps = new PrintStream(bos);
        System.setOut(ps);

        printDouble(1.0);
        assertEquals("1.000", bos.toString().trim());
        bos.reset();
        printDouble(10.1);
        assertEquals("10.100", bos.toString().trim());
        bos.reset();
        printDouble(2.01);
        assertEquals("2.010", bos.toString().trim());
        bos.reset();
        printDouble(2.001);
        assertEquals("2.001", bos.toString().trim());
        bos.reset();
        printDouble(2.0001);
        assertEquals("2.000", bos.toString().trim());
        bos.reset();
        printDouble(2.0004);
        assertEquals("2.000", bos.toString().trim());
        bos.reset();
        printDouble(2.0005);
        assertEquals("2.001", bos.toString().trim());
        bos.reset();

        bos.close();
        // Don't close ps!
    }
}

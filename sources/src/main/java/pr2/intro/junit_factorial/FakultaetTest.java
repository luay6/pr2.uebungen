package pr2.intro.junit_factorial;
import pr2.intro.junit_factorial.Fakultaet;
import org.junit.jupiter.api.Test;
import pr2.intro.junit_factorial.Fakultaet;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakultaetTest {
    Fakultaet f = new Fakultaet();
    @Test
    void testFact() {
        int [] zahlen = {0, 1, 3, -1};
        int [] factorials = { 1, 1, 6, 0};
        for(int i = 0; i < zahlen.length; i++) {
            assertEquals(f.fact(zahlen[i]), factorials[i]);
            
        }
    }
}

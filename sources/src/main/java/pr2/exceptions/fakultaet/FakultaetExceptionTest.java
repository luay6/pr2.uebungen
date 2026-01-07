package pr2.exceptions.fakultaet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FakultaetExceptionTest {

    @Test
    public void facTest() {
        Fakultaet f = new Fakultaet();
        Assertions.assertThrows(FakultaetException.class, () -> {
            f.fact(23);
        });
    }

}

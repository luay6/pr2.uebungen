package pr2.exceptions.eigene_ausnahme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.exceptions.eigene_ausnahme.Fuse;
import pr2.exceptions.eigene_ausnahme.FuseTrippedException;
import pr2.exceptions.eigene_ausnahme.IllegalCurrentException;

/**
 * Testet die Sicherung.
 */
public class FuseTest {

// TODO: Quellcode wieder einkommentieren

    /**
     * Testet die Erzeugung von Sicherungen mit gültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid() throws IllegalCurrentException {
        new Fuse(Fuse.A16);
        new Fuse(Fuse.A25);
        new Fuse(Fuse.A32);
    }

    /**
     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid1() throws IllegalCurrentException {
        Assertions.assertThrows(IllegalCurrentException.class, () -> {
            new Fuse(15);
        });
    }

    /**
     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid2() throws IllegalCurrentException {
        Assertions.assertThrows(IllegalCurrentException.class, () -> {
            new Fuse(-1);
        });
    }

    /**
     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid3() throws IllegalCurrentException {
        Assertions.assertThrows(IllegalCurrentException.class, () -> {
            new Fuse(0);
        });
    }

    /**
     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid4() throws IllegalCurrentException {
        Assertions.assertThrows(IllegalCurrentException.class, () -> {
            new Fuse(Integer.MAX_VALUE);
        });
    }

    /**
     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
     *
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testCreationValid5() throws IllegalCurrentException {
        Assertions.assertThrows(IllegalCurrentException.class, () -> {
            new Fuse(Integer.MIN_VALUE);
        });
    }

    /**
     * Testet das Auslösen der Sicherung.
     *
     * @throws FuseTrippedException    Sicherung hat ausgelöst.
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testTripping1()
            throws FuseTrippedException, IllegalCurrentException {

        Fuse f = new Fuse(Fuse.A16);
        f.use(5);
        f.use(16);
        f.use(0);

        f = new Fuse(Fuse.A25);
        f.use(5);
        f.use(16);
        f.use(25);


        Assertions.assertThrows(FuseTrippedException.class, () -> {
            Fuse f2 = new Fuse(Fuse.A16);
            f2.use(0);
            f2.use(16);
            f2.use(25);
        });
    }

    /**
     * Testet das Auslösen der Sicherung.
     *
     * @throws FuseTrippedException    Sicherung hat ausgelöst.
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testTripping2()
            throws FuseTrippedException, IllegalCurrentException {
        Assertions.assertThrows(FuseTrippedException.class, () -> {
            new Fuse(Fuse.A16).use(17);
        });
    }

    /**
     * Testet das Auslösen der Sicherung.
     *
     * @throws FuseTrippedException    Sicherung hat ausgelöst.
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testTripping3()
            throws FuseTrippedException, IllegalCurrentException {

        Assertions.assertThrows(FuseTrippedException.class, () -> {
            new Fuse(Fuse.A16).use(Integer.MAX_VALUE);
        });
    }

    /**
     * Testet das Auslösen der Sicherung.
     *
     * @throws FuseTrippedException    Sicherung hat ausgelöst.
     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
     */
    @Test
    void testTripping4()
            throws FuseTrippedException, IllegalCurrentException {
        Assertions.assertThrows(FuseTrippedException.class, () -> {
            new Fuse(Fuse.A32).use(40);
        });
    }
}

package pr2.vererbung.vererbung_geometrie;

/**
 * Ein Dreieck.
 */
public class Dreieck extends Figur {

    /**
     * Erzeugt ein neues Dreieck mit den gegebenen Daten.
     *
     * @param grundseite Grundseite des Dreiecks.
     * @param hoehe      Höhe des Dreiecks.
     */
    public Dreieck(double grundseite, double hoehe) {
        super(grundseite * hoehe / 2);
    }
}

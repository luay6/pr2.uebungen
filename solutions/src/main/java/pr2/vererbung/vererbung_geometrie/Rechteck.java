package pr2.vererbung.vererbung_geometrie;

/**
 * Rechteck.
 */
public class Rechteck extends Figur { 

    /**
     * Legt ein neues Rechteck an.
     *
     * @param breite Breite.
     * @param hoehe  Höhe.
     */
    public Rechteck(double breite, double hoehe) {
        super(breite * hoehe);
    }
}

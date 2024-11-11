package pr2.interfaces.abstrakte_klassen_s;

/**
 * Ein Dreieck.
 */
public class Dreieck extends Figur {

    /**
     * Grundseite des Dreiecks.
     */
    private final double grundseite;

    /**
     * Höhe.
     */
    private final double hoehe;

    /**
     * Erzeugt ein neues Dreieck.
     *
     * @param grundseite Grundseite.
     * @param hoehe      Höhe.
     */
    public Dreieck(double grundseite, double hoehe) {
        super();
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    /**
     * Berechnet die Fläche.
     *
     * @return die Fläche.
     */
    @Override
    public double flaeche() {
        return grundseite * hoehe / 2;
    }
}

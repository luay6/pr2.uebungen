package pr2.vererbung.vererbung_geometrie;

/**
 * Basisklasse für geometrische Formen.
 */
public class Figur {

    /**
     * Fläche der Figur.
     */
    private double flaeche;

    /**
     * Legt eine neue Figur mit der Fläche 0 an.
     */
    protected Figur() {
        /* leer */
    }

    /**
     * Legt eine neue Figur mit der gegebenen Fläche an.
     *
     * @param flaeche Fläche der Figur.
     */
    protected Figur(double flaeche) {
        this.flaeche = flaeche;
    }

    /**
     * Liefert die Fläche der Figur.
     *
     * @return die Fläche.
     */
    public double getFlaeche() {
        return flaeche;
    }
}

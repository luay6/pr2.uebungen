package pr2.vererbung.vererbung_geometrie;

/**
 * Basisklasse für geometrische Formen.
 */
public class Figur {

    /**
     * Fläche der Figur.
     */
    private double flaeche;

    protected Figur() {
        flaeche = 0.0;
    }
    protected Figur(double flaeche) {
        this.flaeche = flaeche;
    }
    
    protected double getFlaeche() {
        return flaeche;
    }
}

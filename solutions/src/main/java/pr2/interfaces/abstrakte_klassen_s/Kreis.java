package pr2.interfaces.abstrakte_klassen_s;

/**
 * Ein Kreis.
 */
public class Kreis extends Figur {

    /**
     * Radius des Kreises.
     */
    private final double radius;

    /**
     * Legt einen neuen Kreis an.
     *
     * @param radius Radius des Kreises.
     */
    public Kreis(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Berechnet die Fläche.
     *
     * @return die Fläche.
     */
    @Override
    public double flaeche() {
        return Math.PI * radius * radius;
    }
}

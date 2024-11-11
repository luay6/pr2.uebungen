package pr2.object.tostring;

/**
 * Ein Raumanzug.
 */
public class Raumanzug implements Cloneable {

    /**
     * Hersteller des Raumanzuges.
     */
    private final String hersteller;

    /**
     * Sauerstoffvorrat, der noch im Raumanzug ist.
     */
    private double sauerstoffVorrat;

    /**
     * Ertzeugt einen neuen Raumanzug.
     *
     * @param hersteller Hersteller des Anzuges.
     */
    public Raumanzug(String hersteller) {
        this.hersteller = hersteller;
        sauerstoffVorrat = Math.random();
    }

    /**
     * Sauerstoffvorrat im Anzug.
     *
     * @return Vorrat in % (0.0-1.0)
     */
    public double getSauerstoffVorrat() {
        return sauerstoffVorrat;
    }

    /**
     * Tankt den Anzug auf.
     */
    public void auftanken() {
        sauerstoffVorrat = 1.0;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Raumanzug von %s (Füllstand %d%%)", hersteller,
                (int) (sauerstoffVorrat * 100));
    }
}

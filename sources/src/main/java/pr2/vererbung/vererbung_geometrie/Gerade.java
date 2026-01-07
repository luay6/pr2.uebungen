package pr2.vererbung.vererbung_geometrie;

/**
 * Eine Gerade.
 */
public class Gerade extends Figur{

    /**
     * Länge der Geraden.
     */
    private double laenge;

    public Gerade(double laenge) {
        this.laenge = laenge;
    }
    public double getLaenge() {
        return laenge;
    }
}

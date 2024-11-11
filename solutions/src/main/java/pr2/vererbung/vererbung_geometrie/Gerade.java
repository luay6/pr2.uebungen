package pr2.vererbung.vererbung_geometrie;

/**
 * Eine Gerade.
 */
public class Gerade extends Figur { 

    /**
     * Länge der Geraden.
     */
    private double laenge;

    /**
     * Legt eine neue Gerade mit der gegebenen Länge an.
     *
     * @param laenge Länge der Geraden.
     */
    public Gerade(double laenge) {
        super();
        this.laenge = laenge;
    }

    /**
     * Liefert die Länge der Geraden.
     *
     * @return die Länge.
     */
    public double getLaenge() {
        return laenge;
    }
}

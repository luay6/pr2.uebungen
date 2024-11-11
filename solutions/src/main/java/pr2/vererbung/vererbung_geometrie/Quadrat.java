package pr2.vererbung.vererbung_geometrie;

/**
 * Qudrat.
 */
public class Quadrat extends Rechteck { //*** replace(public class Quadrat {)

    /**
     * Legt ein neues Quadrat an.
     *
     * @param seitenlaenge Länge der Seiten des Quadrates.
     */
    public Quadrat(double seitenlaenge) {
        super(seitenlaenge, seitenlaenge);
    }
}

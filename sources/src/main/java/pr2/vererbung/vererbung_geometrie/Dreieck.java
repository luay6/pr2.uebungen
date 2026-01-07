package pr2.vererbung.vererbung_geometrie;

/**
 * Ein Dreieck.
 */
public class Dreieck extends Figur{

    public Dreieck(double grundseite, double hoehe) {
        super(0.5 * grundseite * hoehe);
    }
}

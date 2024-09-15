package pr2.interfaces.abstrakte_klassen_e;

/**
 * Ein Kreis.
 */
public class Kreis {

    /** Radius des Kreises. */
    private double radius;
    
    /**
     * Legt einen neuen Kreis an.
     * 
     * @param radius Radius des Kreises.
     */
    public Kreis(double radius) {
        this.radius = radius;        
    }
    
    /**
     * Berechnet die Fläche.
     * 
     * @return die Fläche.
     */
    public double flaeche() {
        return Math.PI * radius * radius;
    }
}

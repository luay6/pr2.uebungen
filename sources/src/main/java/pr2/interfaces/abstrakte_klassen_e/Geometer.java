package pr2.interfaces.abstrakte_klassen_e;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }
    
    /**
     * Hauptmethode.
     * 
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        
        Figur[] figuren = {
        new Kreis(10.0),
        new Kreis(5.5),
        new Kreis(3.3),
        new Kreis(7.2),
        new Kreis(8.0),
        new Dreieck(4.0, 3.0),
        new Dreieck(2.0, 1.0),
        new Dreieck(5.0, 8.0),
        new Dreieck(2.0, 7.2),
        new Dreieck(14.0, 3.8)};
        
        double gesamtflaeche = 0.0;

        for (Figur f : figuren) {
            gesamtflaeche += f.getFlaeche();
        }
        
        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);        
    }
}

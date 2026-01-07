package pr2.interfaces.abstrakte_klassen_e;

public abstract class Figur {
    private double flaeche;
    protected Figur(double flaeche) {
        this.flaeche = flaeche;
    }
    
    protected double getFlaeche() {
        return flaeche;
    }
}

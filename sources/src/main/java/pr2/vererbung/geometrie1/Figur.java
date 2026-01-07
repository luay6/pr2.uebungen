package pr2.vererbung.geometrie1;

public class Figur {
    protected int flaeche;
    protected Figur() {};
    protected Figur(int flaeche) {
        this.flaeche = flaeche;
    }
    protected int getFlaeche() {
        return flaeche;
    }
}

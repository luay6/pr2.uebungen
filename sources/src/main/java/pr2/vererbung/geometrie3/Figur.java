package pr2.vererbung.geometrie3;

public class Figur {

    private int flaeche;

    protected Figur() {
        this.flaeche = 0;
    }
    protected Figur(int flaeche) {
        this.flaeche = flaeche;
    }

    public int getFlaeche() {
        return flaeche;
    }

}

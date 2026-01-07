package pr2.vererbung.geometrie2;

public class Figur {

    private int flaeche;

    protected Figur() {
        /* nichts zu tun */
    }
    protected Figur(int flaeche) {
        this.flaeche = flaeche;
    }

    public int getFlaeche() {
        return flaeche;
    }
}

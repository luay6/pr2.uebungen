package pr2.vererbung.geometrie3;

public class Gerade extends Figur { 

    private final int laenge;

    public Gerade(int laenge) {
        this.laenge = laenge;
    }

    @Override
    public String toString() {
        return "Gerade{"
                + "laenge=" + laenge
                + '}';
    }
}

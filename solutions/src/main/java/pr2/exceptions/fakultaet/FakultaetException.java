package pr2.exceptions.fakultaet;

public class FakultaetException extends Exception { 

    private final int zahl;

    public FakultaetException(String message, int zahl) {
        super(message);
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }
}

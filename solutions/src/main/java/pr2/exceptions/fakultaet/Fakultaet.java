package pr2.exceptions.fakultaet;

public class Fakultaet {

    public int fact(int n) throws FakultaetException { 
        if (n < 0) {
            throw new FakultaetException("Keine negativen Zahlen!", n);
        }
        else if (n > 20) {
            throw new FakultaetException("Keine Zahlen > 20", n);
        }
        return factIntern(n);
    }

    private int factIntern(int n) {
        return (n == 0) ? 1 : factIntern(n - 1) * n; 
    }
}

package pr2.exceptions.fakultaet;

public class Fakultaet  {

    public int fact(int n) throws FakultaetException{
        if(0 < n && n> 20) {
            throw new FakultaetException("falsche Eingabe");
        }
        return factIntern(n);
    }

    private int factIntern(int n) {
        return 0;
    }
}

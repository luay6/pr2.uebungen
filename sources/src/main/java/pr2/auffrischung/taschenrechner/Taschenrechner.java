package pr2.auffrischung.taschenrechner;

public class Taschenrechner {

    public double rechne(double o1, char op, double o2) {
        // TODO: Implementieren
        return 0.0;
    }

    public static void main(String[] args) {
        Taschenrechner t = new Taschenrechner();
        System.out.println(t.rechne(1, '+', 2));
        System.out.println(t.rechne(1, '-', 2));
        System.out.println(t.rechne(2, '*', 2));
        System.out.println(t.rechne(4, '/', 2));
        System.out.println(t.rechne(2, '^', 32));
    }
}

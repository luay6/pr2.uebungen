package pr2.auffrischung.taschenrechner;

public class Taschenrechner {

    public double rechne(double o1, char op, double o2) {
        return switch (op) {
        case '+' -> o1 + o2;
        case '-' -> o1 - o2;
        case '/' -> o1 / o2;
        case '*' -> o1 * o2;
        case '^' -> Math.pow(o1, o2);
        default -> Double.NaN;
        };
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

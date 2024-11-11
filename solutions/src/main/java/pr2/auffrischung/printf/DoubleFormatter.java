package pr2.auffrischung.printf;

public class DoubleFormatter {

    public static void printDouble(double d) {
        System.out.printf("%.3f%n", d);
    }

    public static void main(String[] args) {
        printDouble(1.0);
        printDouble(10.1);
        printDouble(2.01);
        printDouble(2.001);
        printDouble(2.0001);
        printDouble(2.0004);
        printDouble(2.0005);
    }
}

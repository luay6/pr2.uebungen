package pr2.threads.fakultaet;

public class Main {
    public static void main(String[] args) {
        FakultaetParallel fp = new FakultaetParallel();
        long[] ergebnisse = fp.calculate(20);

        for (int i = 0; i < ergebnisse.length; i++) {
            long ergebnis = ergebnisse[i];
            System.out.printf("fact(%d) = %d%n", i, ergebnis);
        }
    }
}

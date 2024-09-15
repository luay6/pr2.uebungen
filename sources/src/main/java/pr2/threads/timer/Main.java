package pr2.threads.timer;

public class Main {

    public static void main(String[] args) {
        FakultaetTimer ft = new FakultaetTimer();
        long[] result = ft.calculate();

        for (int i = 0; i < result.length; i++) {
            long ergebnis = result[i];
            System.out.printf("fact(%d) = %d%n", i, ergebnis);
        }
    }
}

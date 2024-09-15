package pr2.threads.fakultaet;

public class FakultaetParallel {

    private long[] ergebnisse;

    // TODO: Implementieren

    public long[] calculate(int bis) {

        if ((bis <= 0) || (bis > 20)) {
            throw new IllegalArgumentException("0 < n <= 20");
        }

        ergebnisse = new long[bis + 1];


        return ergebnisse.clone();
    }
}

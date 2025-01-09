package pr2.threads.fakultaet;

public class FakultaetParallel {

    private long[] ergebnisse;

    private long fact(long n) {
        return (n == 0 ? 1 : n * fact(n - 1));
    }

    private class FactThread implements Runnable {

        int startPunkt;
        int endPunkt;

        public FactThread(int startPunkt, int endPunkt) {
            this.startPunkt = startPunkt;
            this.endPunkt = endPunkt;
        }

        @Override
        public void run() {

            for (int n = startPunkt; n <= endPunkt; n++) {
                ergebnisse[n] = fact(n);
            }
        }
    }

    public long[] calculate(int bis) {

        if ((bis <= 0) || (bis > 20)) {
            throw new IllegalArgumentException("0 < n <= 20");
        }

        ergebnisse = new long[bis + 1];

        Thread t1 = new Thread(new FactThread(0, bis / 2));
        Thread t2 = new Thread(new FactThread(bis / 2, bis));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // ignorieren
        }

        return ergebnisse.clone();
    }
}

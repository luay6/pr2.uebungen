/* (c) 2010 Thomas Smits */
package pr2.threads.timer;

import java.util.Timer;
import java.util.TimerTask;

public class FakultaetTimer {

    private long fact(long n) {
        return (n == 0 ? 1 : n * fact(n - 1));
    }

    public long[] calculate() {

        final long[] ergebnisse = new long[21];

        // TODO: Implementieren

        return ergebnisse;
    }
}

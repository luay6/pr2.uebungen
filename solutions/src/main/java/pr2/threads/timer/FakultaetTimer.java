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

        class MyTask extends TimerTask {

            private final int pos;

            public MyTask(int pos) {
                this.pos = pos;
            }

            @Override
            public void run() {
                ergebnisse[pos] = fact(pos);
            }
        }

        Timer timer = new Timer();

        for (int i = 0; i < ergebnisse.length; i++) {
            timer.schedule(new MyTask(i), 0);
        }

        return ergebnisse;
    }
}

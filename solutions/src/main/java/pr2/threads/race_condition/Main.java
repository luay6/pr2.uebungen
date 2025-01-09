package pr2.threads.race_condition;

import java.util.Arrays;
import java.util.List;

/**
 * Haupklasse.
 */
public class Main {

    /**
     * Start-Methode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {

        NumberList numbers = new NumberList();

        // Threads anlegen
        List<Thread> threads = Arrays.asList(
                new Thread(new NumberIncrementer(100000, numbers)),
                new Thread(new NumberIncrementer(100000, numbers)),
                new Thread(new NumberIncrementer(100000, numbers)));

        // Threads starten
        threads.forEach(Thread::start);

        // Auf Ende der Threads warten
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                // ignore
            }
        });

        // Zahlen überprüfen
        numbers.check();
    }
}

package pr2.intro.junit_factorial;

public class Fakultaet {

    /**
     * Berechnet die Fakultät fuer die gegebene Zahl.
     *
     * @param n Zahl für die die Fakultät berechnet werden soll.
     * @return die Fakultät
     */
    public int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
}

package pr2.exceptions.eigene_ausnahme;

/**
 * Ausnahme, wenn die Sicherung auslöst.
 */
public class FuseTrippedException extends Exception {
    /**
     * Strom, bei dem die Sicherung ausgelöst hat.
     */
    private final int current;

    /**
     * Auslösestrom der Sicherung.
     */
    private final int tripCurrent;

    /**
     * Erzeugt eine neue Ausnahme.
     *
     * @param current     Strom, bei dem die Sicherung ausgelöst hat.
     * @param tripCurrent Auslösestrom der Sicherung.
     */
    public FuseTrippedException(int current, int tripCurrent) {
        super();
        this.current = current;
        this.tripCurrent = tripCurrent;
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return String.format("Maximaler Strom: %d, Auslösestrom: %d",
                tripCurrent, current);
    }
}

package pr2.exceptions.eigene_ausnahme;

/**
 * Ausnahme, wenn eine Sicherung angelegt werden soll, die es nicht gibt.
 */
public class IllegalCurrentException extends Exception {

    /**
     * Übergebener Strom.
     */
    private final int givenValue;

    /**
     * Erzeugt eine neue Ausnahme.
     *
     * @param givenValue gegebener Strom.
     */
    public IllegalCurrentException(int givenValue) {
        super();
        this.givenValue = givenValue;
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return String.format("Falscher Wert %d", givenValue);
    }
}

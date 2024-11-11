package pr2.exceptions.ausnahmen_testen;

/**
 * Ungültiger Schlüssel.
 */
public class IllegalKeyException extends Exception {

    /**
     * Legt eine neue Ausnahme an.
     */
    public IllegalKeyException() {
        super();
    }

    /**
     * Legt eine neue Ausnahme an.
     *
     * @param message die Nachricht.
     */
    public IllegalKeyException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return getMessage();
    }
}

package pr2.io.serialisierung;

/**
 * Farben der Spielsteine.
 */
public enum Color {

    /**
     * Schwarzer Stein.
     */
    BLACK,

    /**
     * Weißer Stein.
     */
    WHITE;

    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        if (this == Color.BLACK) {
            return "B";
        }
        else {
            return "W";
        }
    }
}

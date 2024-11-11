package pr2.enums.schnick;

public enum Move {
    /**
     * Konstante für Schere.
     */
    SCISSORS("Scissors", "s"),

    /**
     * Konstante für Papier.
     */
    PAPER("Paper", "p"),

    /**
     * Konstante für Stein.
     */
    ROCK("Rock", "r");

    private final String name;
    private final String key;

    private Move(String name, String key) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Returns the move corresponding to the key entered.
     *
     * @param key the key pressed.
     * @return the corresponding move.
     */
    public static Move find(String key) {
        for (Move m : values()) {
            if (m.key.equals(key.toLowerCase())) {
                return m;
            }
        }
        return null;
    }
}

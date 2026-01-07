package pr2.enums.schnick;

public enum Move {
    ROCK("r", "s"),
    PAPER("p", "r"),
    SCISSOR("s", "p");
    String key;
    String beats;
    private Move(String key, String beats) {
        this.key = key;
        this.beats = beats;
    }
    public boolean beats(Move m) {
        return m.key.equals(this.beats);
    }
    
}



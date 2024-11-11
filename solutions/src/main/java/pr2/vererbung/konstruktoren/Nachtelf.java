package pr2.vererbung.konstruktoren;

/**
 * Nachtelf aus der Allianz.
 */
public class Nachtelf extends Wesen { 

    /**
     * Standardmäßige Stärke der Fähigkeit Naturwiderstand.
     */
    public static final int STANDARD_NATURWIDERSTAND = 5;

    /**
     * Fähigkeit zum Widerstand gegen Naturmagie.
     */
    private int naturwiderstand;

    /**
     * Legt einen neuen Nachtelf an.
     *
     * @param name            Name der Figur.
     * @param naturwiderstand Stärke der Fähigkeit Naturwiderstand.
     */
    public Nachtelf(String name, int naturwiderstand) {
        super(name);
        this.naturwiderstand = naturwiderstand;
    }

    /**
     * Legt einen neuen Nachtelf an. Die Stärke des Naturwiderstandes entspricht
     * dem Standardwert.
     *
     * @param name Name der Figur.
     */
    public Nachtelf(String name) {
        this(name, STANDARD_NATURWIDERSTAND);
    }

    /**
     * Stärke des Naturwiderstandes.
     *
     * @return the naturwiderstand
     */
    public int getNaturwiderstand() {
        return naturwiderstand;
    }
}

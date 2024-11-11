package pr2.vererbung.konstruktoren;

/**
 * Untoter aus der Horde.
 */
public class Untoter extends Wesen { 

    /**
     * Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung.
     */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;

    /**
     * Fähigkeit zur Atmung unter Wasser.
     */
    private int unterwasseratmung;

    /**
     * Legt einen neuen Untoten an.
     *
     * @param name              Name der Figur.
     * @param unterwasseratmung Stärke der Fähigkeit zur Unterwasseratmung.
     */
    public Untoter(String name, int unterwasseratmung) {
        super(name);
        this.unterwasseratmung = unterwasseratmung;
    }

    /**
     * Legt einen neuen Untoten an. Die Stärke der Unterwasseratmung entspricht
     * dem Standardwert.
     *
     * @param name Name der Figur.
     */
    public Untoter(String name) {
        this(name, STANDARD_UNTERWASSERATMUNG);
    }

    /**
     * Fähigkeit zur Unterwasseratmnung.
     *
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}

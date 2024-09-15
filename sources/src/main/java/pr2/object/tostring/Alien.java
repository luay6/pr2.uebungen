package pr2.object.tostring;

/**
 * Ein Alien.
 */
public class Alien implements Cloneable {

    /**
     * Name des Aliens.
     */
    private final String name;

    /**
     * Raumanzug des Aliens.
     */
    private final Raumanzug raumanzug;

    /**
     * Erzeugt ein neues Alien.
     *
     * @param name      Name des Aliens.
     * @param raumanzug Anzug.
     */
    public Alien(String name, Raumanzug raumanzug) {
        this.name = name;
        this.raumanzug = raumanzug;
    }

    /**
     * Gibt den Namen des Aliens zurück.
     *
     * @return Name des Aliens.
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Anzug zurück.
     *
     * @return der Anzug.
     */
    public Raumanzug getAnzug() {
        return raumanzug;
    }

}

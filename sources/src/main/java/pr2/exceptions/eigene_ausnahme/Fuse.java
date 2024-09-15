package pr2.exceptions.eigene_ausnahme;

/**
 * Eine Sicherung im Stromkreis.
 */
public class Fuse {

    /**
     * 16 Ampere-Sicherung.
     */
    public static final int A16 = 16;

    /**
     * 25 Ampere-Sicherung.
     */
    public static final int A25 = 25;

    /**
     * 32 Ampere-Sicherung.
     */
    public static final int A32 = 32;

    /**
     * Strom, bei dem die Sicherung auslöst.
     */
    private final int tripCurrent;

    /**
     * Legt eine neue Sicherung an.
     *
     * @param tripCurrent Strom, bei dem die Sicherung auslösen soll.
     * @throws IllegalCurrentException Ausnahme bei einem
     *                                 ungültigen Spannungswert.
     */
    public Fuse(int tripCurrent) {
        // TODO: IllegalCurrentException werfen, wenn der Strom ungültig ist
        this.tripCurrent = tripCurrent;
    }

    /**
     * Die Sicherung benutzen.
     *
     * @param current Strom, der durch die Sicherung fließt.
     * @throws FuseTrippedException wird geworfen, wenn der Srom zu groß wird.
     */
    public void use(int current) {
        // TODO: FuseTrippedException werfen, wenn der Strom zu groß ist
    }
}

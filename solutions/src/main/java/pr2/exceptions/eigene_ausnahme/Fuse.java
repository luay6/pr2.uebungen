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
    public Fuse(int tripCurrent) throws IllegalCurrentException {
        switch (tripCurrent) {
            case A16:
            case A25:
            case A32:
                this.tripCurrent = tripCurrent;
                break;
            default:
                throw new IllegalCurrentException(tripCurrent);
        }
    }

    /**
     * Die Sicherung benutzen.
     *
     * @param current Strom, der durch die Sicherung fließt.
     * @throws FuseTrippedException wird geworfen, wenn der Srom zu groß wird.
     */
    public void use(int current) throws FuseTrippedException {
        if (current > tripCurrent) {
            throw new FuseTrippedException(current, tripCurrent);
        }
    }
}

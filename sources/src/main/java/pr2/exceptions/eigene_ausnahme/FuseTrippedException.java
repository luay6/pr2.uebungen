package pr2.exceptions.eigene_ausnahme;

/**
 * Ausnahme, wenn die Sicherung auslöst.
 */
public class FuseTrippedException extends Exception{
    int nennstrom;
    int ausloesestrom;
    public FuseTrippedException(int ausloesestrom, int nennstrom) {
        super();
        this.ausloesestrom = ausloesestrom;
        this.nennstrom = nennstrom;
    }


    @Override
    public String toString() {
        return "Nennstrom: " + getNennstrom() + " " + "Auslösestrom: " + getAusloeseStrom();
    }

    private int getAusloeseStrom() {
        return ausloesestrom;
    }

    private int getNennstrom() {
        return nennstrom;
    }
}

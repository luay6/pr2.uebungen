package pr2.intro.coding_standard;

/**
 * Klasse dient als Beispiel für den Coding-Standard und die Namenskonventionen
 * bei Java-Programmen.
 */
public class CodingStandard {

    /*
     * Konstante, die dem Rest der Welt etwas mitteilen soll.
     */
    public final static int KONSTANTE_MIT_TOLLEM_WERT = 3;

    private int erstesFeld;
    private double zweitesFeld;

    /*
     * Legt eine neue Instanz an.
     *
     * Erstes_Feld: das erste Feld. ZweitesFeld: das zweite Feld.
     */
    public CodingStandard(int erstesFeld, double zweitesFeld) {
        this.erstesFeld = erstesFeld;
        this.zweitesFeld = zweitesFeld;
    }

    /*
     * Methode, die etwas tut.
     *
     * parameter: Eingabewert für die Methode. gibt einen Wert abhängig von
     * {@code parameter} zurück.
     */
    public int methodeDieWasTut(int parameter) {
        int result;

        if (parameter > KONSTANTE_MIT_TOLLEM_WERT)
            result = 12;
        else {
            result = 13;
        }

        erstesFeld = result;
        zweitesFeld = 2 * result;

        return result;
    }
}

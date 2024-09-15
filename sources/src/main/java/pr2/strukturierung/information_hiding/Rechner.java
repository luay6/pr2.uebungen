package pr2.strukturierung.information_hiding;

/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {
    /** Ergebnis des Taschenrechners. */
    public double wert;

    /** Speicher des Taschenrechners. */
    public double speicher;

    /**
     * Addiert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public void addiere(double a, double b) {
        wert = a + b;
    }

    /**
     * Subtrahiert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public void subtrahiere(double a, double b) {
        wert = a - b;
    }

    /**
     * Multipliziert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public void multipliziere(double a, double b) {
        wert = a * b;
    }
    /**
     * Speichert den aktuellen Wert in der Variable {@speicher}.
     */
    public void speichern() {
        speicher = wert;
    }
}

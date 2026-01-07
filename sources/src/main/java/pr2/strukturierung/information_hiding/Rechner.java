package pr2.strukturierung.information_hiding;

/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {
    /** Ergebnis des Taschenrechners. */
    private double wert;

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
        speichern();
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
        speichern();
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
        speichern();
    }
    /**
     * Speichert den aktuellen Wert in der Variable {@speicher}.
     */
    private void speichern() {
        speicher = wert;
    }
}

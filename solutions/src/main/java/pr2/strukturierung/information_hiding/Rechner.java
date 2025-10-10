package pr2.strukturierung.information_hiding;

/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {

    /** Speicher des Taschenrechners. */
    private double speicher;

    /**
     * Addiert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public double addiere(double a, double b) {
        return a + b;
    }

    /**
     * Subtrahiert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public double subtrahiere(double a, double b) {
        return a - b;
    }

    /**
     * Multipliziert zwei Werte und gibt das Ergebnis zurück.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     * @return das Ergebnis.
     */
    public double multipliziere(double a, double b) {
        return a * b;
    }
    /**
     * Gibt den gespeicherten Wert zurück.
     *
     * @return gespeicherter Wert.
     */
    public double getSpeicher() {
        return speicher;
    }

    /**
     * Speichert den gegebenen Wert.
     *
     * @param wert Wert, der gespeichert werden soll.
     */
    public void setSpeicher(double wert) {
        speicher = wert;
    }
}

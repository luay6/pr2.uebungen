package pr2.generics.wildcards;

/**
 * Klasse zum Ausdrucken von Listen.
 */
public class ListHelper {

    /**
     * Druckt alle Elemente der Liste auf der Konsole aus.
     *
     * @param liste Die zu druckende Liste.
     */
    public static void printList(SimpleList<?> liste) {
        for (Object o : liste) {
            System.out.println(o);
        }
    }

    /**
     * Summiert die Elemente der Liste. Deswegen können nur Listen übergeben
     * werden, deren Elemente mindestens vom Typ {@code Number} sind.
     *
     * @param liste Die Liste, deren Elemente summiert werden sollen.
     * @return das Ergebnis
     */
    public static double sumList(SimpleList<? extends Number> liste) {
        double sum = 0;

        for (Number number : liste) {
            sum += number.doubleValue();
        }

        return sum;
    }
}

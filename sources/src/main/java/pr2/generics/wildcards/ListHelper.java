package pr2.generics.wildcards;

import java.util.List;

/**
 * Klasse zum Ausdrucken von Listen.
 */
public class ListHelper {

    /**
     * Druckt alle Elemente der Liste auf der Konsole aus.
     *
     * @param liste Die zu druckende Liste.
     */
    public static void printList(List<?> list) {
        for(Object t : list){
            System.out.println(t);
        }
    }

    /**
     * Summiert die Elemente der Liste. Deswegen können nur Listen übergeben
     * werden, deren Elemente mindestens vom Typ {@code Number} sind.
     *
     * @param liste Die Liste, deren Elemente summiert werden sollen.
     * @return das Ergebnis
     */
    public static Number sumList(List<? extends Number> list) {
        double result = 0;
        for(Number n : list) {
            result += n.doubleValue();
        }
        return result;
    }
}

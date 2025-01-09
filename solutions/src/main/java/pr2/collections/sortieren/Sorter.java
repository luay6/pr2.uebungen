package pr2.collections.sortieren;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Klasse zum Sortieren von Strings.
 */
public class Sorter {

    /**
     * Liefert einen Comparator für Strings.
     *
     * @param order Sortierreihenfolge.
     * @return Comparator, entsprechend der gewünschten Sortierreihenfolge.
     */
    private static Comparator<String> stringComparator(final SortOrder order) {
        /* Comparator. */
        class MyComparator implements Comparator<String> {

            /**
             * Vergleicht die Strings.
             *
             * @param o1 Erster String
             * @param o2 Zweiter String
             * @return Ergebnis des Vergleichs.
             */
            @Override
            public int compare(String o1, String o2) {
                switch (order) {
                    case ASCENDING:
                        return o1.compareTo(o2);
                    case DESCENDING:
                        return -o1.compareTo(o2);
                    case ASCENDING_CASE_INSENSITIVE:
                        return o1.toUpperCase().compareTo(o2.toUpperCase());
                    case DESCENDING_CASE_INSENSITIVE:
                        return -o1.toUpperCase().compareTo(o2.toUpperCase());
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }

        return new MyComparator();
    }

    /**
     * Sortiert das übergebene Array entsprechend der gewünschten Reihenfolge.
     *
     * @param array das zu sortierende Array.
     * @param order die Sortierreihenfolge.
     */
    public static void sort(String[] array, SortOrder order) {
        Arrays.sort(array, stringComparator(order));
    }

    /**
     * Sortierreihenfolge für die Strings.
     */
    public enum SortOrder {

        /**
         * Aufsteigend.
         */
        ASCENDING,

        /**
         * Absteigend.
         */
        DESCENDING,

        /**
         * Aufsteigend, ohne Beachtung der Groß-/Kleinschreibung.
         */
        ASCENDING_CASE_INSENSITIVE,

        /**
         * Absteigend, ohne Beachtung der Groß-/Kleinschreibung.
         */
        DESCENDING_CASE_INSENSITIVE
    }
}

package pr2.auffrischung.labeled_break;

public class ArraySucher {

    /**
     * Sucht das erste Element, dass nicht 0 ist.
     *
     * @param array das Array in dem gesucht werden soll
     * @return {@code true}, wenn ein Element gefunden wird,
     *  andernfalls {@code false}.
     */
    public boolean suche(int[][] array) {
        boolean found = false;

        outer:
        for (int[] is : array) {
            for (int i : is) {
                if (i != 0) {
                    found = true;
                    break outer;
                }
            }
        }

        return found;
    }
}

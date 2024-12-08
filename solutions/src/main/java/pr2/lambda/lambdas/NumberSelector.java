package pr2.lambda.lambdas;

/**
 * Auswählen von Zahlen mithilfe eines Callbacks.
 */
public class NumberSelector {

    /**
     * Filtert die übergebenen Zahlen anhand des Prädikates.
     *
     * @param predicate Prädikat.
     * @param numbers   die zu filternden Zahlen.
     * @return Das Ergebnis
     */
    public int[] filter(Predicate<Integer> predicate, int[] numbers) {

        int[] temp = new int[numbers.length];
        int count = 0;

        for (int i : numbers) {
            if (predicate.accept(i)) {
                temp[count++] = i;
            }
        }

        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }
}

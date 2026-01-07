package pr2.collections.map;

/**
 * Klasse für die Verwaltung der Worthäufigkeiten.
 */
public class WordFrequency implements Comparable{
    // TODO: Sortierbar machen [Comparable]
    @Override
    public int compareTo(Object o) {
        WordFrequency other = (WordFrequency) o;
        // TODO Auto-generated method stub
        return other.frequency - this.frequency;
    }
    /**
     * Das Wort.
     */
    String word;

    /**
     * Seine Häufigkeit.
     */
    int frequency;

    /**
     * Legt ein neues Objekt an.
     *
     * @param word      das gespeicherte Wort
     * @param frequency die Häfigkeit
     */
    WordFrequency(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }


    /**
     * Erhöht die Häufigkeit des Wortes.
     */
    public void incrementFrequency() {
        frequency++;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s: %d", word, frequency);
    }



}

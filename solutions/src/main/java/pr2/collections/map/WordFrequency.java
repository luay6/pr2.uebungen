package pr2.collections.map;

/**
 * Klasse für die Verwaltung der Worthäufigkeiten.
 */
public class WordFrequency implements Comparable<WordFrequency> {

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
     * Vergleich mit anderem Objekt.
     *
     * @param o das andere Objekt
     * @return Ergebnis des Vergleiches
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(WordFrequency o) {
        return o.frequency - frequency;
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

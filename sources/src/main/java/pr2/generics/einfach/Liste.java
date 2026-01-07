package pr2.generics.einfach;

/**
 * Eine einfache, verkettete Liste.
 *
 * @param <T> Typ der gespeicherten Objekte
 */
/**
 * Eine einfache, verkettete Liste.
 */
public class Liste<T> {

    /** Referenz auf den ersten Knoten. */
    private ListeNode<T> first;

    /** Referenz auf den aktuellen Knoten. */
    private ListeNode <T>current;

    /**
     * Fügt ein neues Element an das Ende der Liste an.
     *
     * @param data das Element
     */
    @SuppressWarnings({ "unchecked" })
    public void add(T data) {

        ListeNode<T> nextNode = new ListeNode<T>(data);

        if (current == null) {
            // Liste komplett leer
            first = nextNode;
            current = nextNode;
        }
        else {
            current.next = nextNode;
            current = nextNode;
        }
    }

    /**
     * Liest das Element an der gegebenen Position.
     *
     * @param index Index, beginnend bei 0.
     * @return Das Element oder {@code null}, wenn es nicht gefunden wurde.
     */
    public Object get(int index) {
        int count = 0;
        ListeNode<T> node = first;

        while ((node != null) && (count < index)) {
            node = node.next;
            count++;
        }

        if ((count == index) && (node != null)) {
            return node.data;
        }
        else {
            // index does not exist
            return null;
        }
    }

    /**
     * Löscht die Liste und entfernt alle Elemente.
     */
    public void clear() {
        first = null;
        current = null;
    }

    /**
     * Liefert die Anzahl der Elemente der Liste zurück.
     *
     * @return die Anzahl der Elemente.
     */
    public int size() {
        int count = 0;
        ListeNode<T> node = first;

        while (node != null) {
            node = node.next;
            count++;
        }

        return count;
    }
}

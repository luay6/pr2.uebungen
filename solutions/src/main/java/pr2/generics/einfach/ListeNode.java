package pr2.generics.einfach;


/**
 * Interne Repräsentation der Knoten in der Liste.
 *
 * @param <T> Typ der gespeicherten Daten.
 */
class ListeNode<T> {

    /**
     * Daten.
     */
    T data;

    /**
     * Referenz auf den nächsten Knoten.
     */
    ListeNode<T> next;

    /**
     * Legt einen neuen Knoten an.
     *
     * @param data daten, die gespeichert werden
     */
    ListeNode(T data) {
        this.data = data;
    }
}

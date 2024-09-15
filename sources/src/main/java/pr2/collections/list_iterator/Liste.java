package pr2.collections.list_iterator;

import java.util.Iterator;
public class Liste<T> implements Iterable<T> {

    static class Item<T> {
        T element;
        Item<T> next;

        public Item(T element) {
            this.element = element;
        }
    }

    Item<T> first;
    Item<T> last;

    // TODO: Klasse ListenIterator implementieren

    public void add(T element) {
        Item<T> item = new Item<T>(element);

        first = (first != null) ? first : item;

        if (last == null) {
            last = item;
        } else {
            last.next = item;
            last = item;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return null;
        // TODO: neuen ListenIterator zurück geben
    }
}

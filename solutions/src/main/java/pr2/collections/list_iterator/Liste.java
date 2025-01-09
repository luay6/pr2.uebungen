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

    class ListenIterator implements Iterator<T> {
        Item<T> position = first;

        @Override
        public boolean hasNext() {
            return (position != null);
        }

        @Override
        public T next() {
            T element = position.element;
            position = position.next;
            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

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
        return new ListenIterator();
    }
}

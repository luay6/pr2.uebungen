package pr2.collections.list_iterator;
temp
import java.util.Iterator;
import java.util.ListIterator;
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

    @SuppressWarnings("unchecked")
    @Override
    public ListIterator<T> iterator() {
        return new MyListIterator<T>();
    }
    class MyListIterator<T> implements ListIterator<T>{

        @Override
        public boolean hasNext() {
            @SuppressWarnings("unchecked")
            Item<T> cursor = (Item<T>) Liste.this.first;
            return cursor.next != null;
           
        }

        @Override
        public Object next() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean hasPrevious() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Object previous() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int nextIndex() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public int previousIndex() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(Object e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void add(Object e) {
            // TODO Auto-generated method stub
            
        }
        
    }
}

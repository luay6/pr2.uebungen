package pr2.collections.iterator;

import java.util.Iterator;

/**
 * Eine einfache, naive Stack Implementierung.
 *
 * @param <T> Typ, der gespeichert werden soll.
 */
public class SimpleStack<T> implements Iterable<T>{

    // Variablen sind nicht private wegen Zugriff durch den Iterator
    T[] stack;

    int pos;

    /**
     * Legt einen neuen Stack mit der gegebenen Größe an.
     *
     * @param size Größe des Stacks.
     */
    @SuppressWarnings("unchecked")
    public SimpleStack(int size) {
        stack = (T[]) new Object[size];
        pos = 0;
    }

    /**
     * Fügt dem Stack ein neues Element hinzu.
     *
     * @param o Element, das hinzugefügt werden soll.
     */
    public void push(T o) {
        stack[pos++] = o;
    }

    /**
     * Holt das oberste Element und entfernt es.
     *
     * @return das oberste Element
     */
    public T pop() {
        return stack[--pos];
    }

    /**
     * Gibt das oberste Element zurück, ohne es zu entfernen.
     *
     * @return das oberste Element
     */
    public T peek() {
        return stack[pos - 1];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
    class MyIterator implements Iterator<T>{
        
        private int cursor = pos;
        @Override
        public boolean hasNext() {
            
            return cursor > 0;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
                return stack[--cursor];                
            
        }
        
    }
    

   
}

package pr2.generics.queue;

public class Queue<T> {

    private final T[] elements;
    private int pos = 0;
    private int pos2 = 0;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        elements = (T[]) new Object[size];
    }

    public void offer(T element) {
        elements[pos] = element;
        pos++;
        pos = pos % elements.length;
    }

    public T poll() {
        T element = elements[pos2];
        elements[pos2] = null;
        pos2++;
        pos2 = pos2 % elements.length;
        return element;
    }

    public void addAll(Queue<? extends T> other) {
        for (T t : other.elements) {
            offer(t);
        }
    }

    public void copyInto(Queue<? super T> other) {
        for (T t : elements) {
            other.offer(t);
        }
    }
}

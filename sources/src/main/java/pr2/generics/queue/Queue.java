package pr2.generics.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> list = new ArrayList<T>();
    public void offer(T t) {
        list.add(t);
    }
    public T poll() {
        return list.getFirst();
    }
    public void addAll(Queue<? extends T> other) {
        T element;
        while ((element = other.poll()) != null) { 
            this.offer(element);
        }
    }
    public void copyInto(Queue<? super T> other) {
        for (T item : this.list) {
            other.offer(item);
        }
    }
}

package pr2.generics.pairlist;

public class PairList<T, V> { 

    protected final Pair<T, V>[] elements;
    protected int pos;

    @SuppressWarnings("unchecked")
    public PairList(int size) {
        elements = (Pair<T, V>[]) new Pair[size];
    }

    public void add(Pair<T, V> element) {
        elements[pos++] = element;
    }

    public Pair<T, V> get(int index) {
        return elements[index];
    }
}

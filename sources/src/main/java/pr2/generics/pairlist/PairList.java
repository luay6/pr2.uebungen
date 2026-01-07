package pr2.generics.pairlist;

temp
public class PairList<S, T> {

    private final Object[] elements;
    private int count = 0;


    public PairList(int capacity) {
        this.elements = new Object[capacity];
    }


    public void add(Pair<S, T> pair) {
        if (count < elements.length) {
            elements[count] = pair;
            count++;
        } else {
            System.err.println("List is full!");
        }
    }

    @SuppressWarnings("unchecked")
    public Pair<S, T> get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return (Pair<S, T>) elements[index];
    }
}
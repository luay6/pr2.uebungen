package pr2.interfaces.stack;

public class StackImpl implements Stack { 

    private final Object[] puffer;
    private int pos = -1;

    public StackImpl(int size) {
        puffer = new Object[size];
    }

    @Override
    public void push(Object o) {
        if (pos < puffer.length - 1) {
            puffer[++pos] = o;
        }
    }

    @Override
    public Object pop() {
        if (pos >= 0) {
            return puffer[pos--];
        }
        else {
            return null;
        }
    }

    @Override
    public Object peek() {
        if (pos >= 0) {
            return puffer[pos];
        }
        else {
            return null;
        }
    }

    @Override
    public int size() {
        return pos + 1;
    }
}

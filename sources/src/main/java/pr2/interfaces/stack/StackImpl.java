package pr2.interfaces.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack {
    private Object[] stack;
    private int size;

    public StackImpl(int size) {
        this.size = size;
        this.stack = new Object[size];
    }

    @Override
    public void push(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (stack[i] == null) {
                stack[i] = o;
                return;
            }
        }
    }

    @Override
    public Object pop() {
        if (stack[0] == null) {
            return null;
        } else {

            for (int i = 0; i < this.size; i++) {
                if (stack[i] == null) {
                    Object pop = stack[i - 1];
                    stack[i - 1] = null;
                    return pop;
                }
            }
        }
        return null;
    }

    @Override
    public Object peek() {
        if (stack[0] == null) {
            return null;
        } else {

            for (int i = 0; i < this.size; i++) {
                if (stack[i] == null) {
                    return stack[i - 1];
                }
            }
        }
        return size;
    }

    @Override
    public int size() {
        int count = 0;
        if(stack[0] == null) {
            return 0;
        }
        else {
            for(int i = 0; i < stack.length; i++) {
                if(stack[i] == null) {
                    return count;
                }
                count++;
            }
        }
        return 0;
    }

}

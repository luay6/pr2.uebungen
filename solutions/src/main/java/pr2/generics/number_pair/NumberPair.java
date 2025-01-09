package pr2.generics.number_pair;

public class NumberPair<T extends Number> extends Pair<T, T> {

    public NumberPair(T first, T second) {
        super(first, second);
    }
}

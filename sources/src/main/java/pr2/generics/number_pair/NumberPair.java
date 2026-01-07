package pr2.generics.number_pair;

public class NumberPair<T extends Number> extends Pair<T, T>{
    public NumberPair(T pair1, T pair2) {
        super(pair1, pair1);
    }
}

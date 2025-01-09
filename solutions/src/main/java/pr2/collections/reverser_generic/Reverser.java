package pr2.collections.reverser_generic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reverser<T extends Comparable<T>> {

    public void reverse(List<T> liste) {

        Collections.sort(liste, new Comparator<T>() {

            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2) * -1;
            }
        });
    }
}

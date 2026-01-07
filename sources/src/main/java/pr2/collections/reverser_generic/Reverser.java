package pr2.collections.reverser_generic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reverser<T extends Comparable> {

    public <T> void reverse(List<T> liste) {

        if(liste == null) {
            return;
        }
        Collections.sort(liste, Collections.reverseOrder());
        return;
    }
}

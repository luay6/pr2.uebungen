package pr2.collections.reverser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reverser {
    public void reverse(List<String> liste) {

        Collections.sort(liste, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });
    }
}

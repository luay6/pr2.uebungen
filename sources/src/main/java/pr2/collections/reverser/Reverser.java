package pr2.collections.reverser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reverser{

    public void reverse(List<String> liste){
        if(liste == null) {
            return;
        }
        Collections.sort(liste, Collections.reverseOrder());
    }
}

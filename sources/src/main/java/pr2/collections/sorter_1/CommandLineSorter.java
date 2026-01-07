package pr2.collections.sorter_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandLineSorter {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>(Arrays.asList(args));
        Collections.sort(liste);
        for(String s : liste) {
            System.out.println(s);            
        }
        
    }
    
}

package pr2.collections.sorter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommandLineSorter {

    public static void main(String[] args) {
        ArrayList<String> argsList = new ArrayList<String>(Arrays.asList(args));
        Collections.sort(argsList);
        Set<String> argsSet = new HashSet<>();
        argsSet.addAll(argsList);
        argsList.clear();
        argsList.addAll(argsSet);
        argsList.sort((a,b) -> a.compareTo(b));
        for(String arg : argsList) {
            System.out.println(arg);
        }
    }
}

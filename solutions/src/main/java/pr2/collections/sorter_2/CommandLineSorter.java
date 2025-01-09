package pr2.collections.sorter_2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommandLineSorter {

    public static void main(String[] args) {
        Set<String> argList = new TreeSet<String>(Arrays.asList(args));

        for (String element : argList) {
            System.out.println(element);
        }
    }
}

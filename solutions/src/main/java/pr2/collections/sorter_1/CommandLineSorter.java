package pr2.collections.sorter_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandLineSorter {

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        Collections.sort(argList);

        for (String element : argList) {
            System.out.println(element);
        }
    }
}

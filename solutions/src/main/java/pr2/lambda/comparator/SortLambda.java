package pr2.lambda.comparator;

import java.util.Arrays;

public class SortLambda {

    public static void main(String[] args) {
        Integer[] zahlen = {23, 42, 17, 9, 1, 5, 7, 88, 35};
        Arrays.sort(zahlen, (a, b) -> b - a);
        System.out.println(Arrays.toString(zahlen));
    }
}

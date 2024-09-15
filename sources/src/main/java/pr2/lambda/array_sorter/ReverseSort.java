package pr2.lambda.array_sorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ReverseSort {

    public static void main(String[] args) {
        Date[] dates = {
                new Date(9200000000L),
                new Date(9300000000L),
                new Date(92100000000L),
                new Date(9600000000L),
                new Date(93300000000L)
        };

        // TODO: Daten umgekehrt sortieren

        System.out.println(Arrays.asList(dates));
    }
}

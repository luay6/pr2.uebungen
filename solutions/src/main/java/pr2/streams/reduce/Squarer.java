package pr2.streams.reduce;

import java.util.List;

import static java.util.stream.Collectors.summingInt;

public class Squarer {
    public static int mitMap(List<Integer> zahlen) {
        //= Arrays.asList(1, 5, 8, 9, 12, 10, 3);
        int mitMap;

        mitMap = zahlen.stream()
                .map(e -> e * e)
                .collect(summingInt(e -> e));
        return mitMap;
    }

    public static int ohneMap(List<Integer> zahlen) {
        int ohneMap;
        ohneMap = zahlen.stream()
                .reduce((a, b) -> a + b * b)
                .orElse(0);
        return ohneMap;
    }
}

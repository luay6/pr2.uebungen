package pr2.streams.summieren;

import java.util.stream.Stream;

public class SumUp {
    public static int sumUp(Stream<Integer> numbers) {
        int result;
        result = numbers.reduce(0, (x, y) -> x + y);
        return result;
    }
}

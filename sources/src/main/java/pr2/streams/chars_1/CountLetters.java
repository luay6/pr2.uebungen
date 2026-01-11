package pr2.streams.chars_1;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountLetters {
    public static long count(String s) {
        long sum = 0;

        IntStream intStream = s.chars();
        sum = intStream
        .filter(Character::isLowerCase)
        .count();
               
        
        return sum;
    }
}

package pr2.streams.chars_3;

import java.util.List;

public class CountLetters {
    public static long count(List<String> liste) {

        long chars = 0;

        chars = liste.stream()
                .flatMapToInt(e -> e.chars())
                .filter(Character::isLowerCase)
                .count();

        return chars;
    }
}

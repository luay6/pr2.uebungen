package pr2.streams.chars_1;

public class CountLetters {
    public static long count(String s) {
        long sum;

        sum = s.chars()
                .filter(Character::isLowerCase)
                .count();

        return sum;
    }
}

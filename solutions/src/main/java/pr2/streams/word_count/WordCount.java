package pr2.streams.word_count;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class WordCount {
    public static List<String> count(List<String> liste) {
        List<String> result;

        result = liste.stream()
                .collect(groupingBy(s -> s))
                .entrySet().stream()
                .map(e -> e.getKey() + "->" + e.getValue().size())
                .collect(toList());

        return result;
    }
}

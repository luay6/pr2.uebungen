package pr2.streams.filter;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static List<String> filter(List<String> liste) {
        List<String> result;

        result = liste.stream()
                .filter(s -> s.length() >= 5)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        return result;
    }
}

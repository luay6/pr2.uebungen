package pr2.streams.filter;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static List<String> filter(List<String> liste) {
        List<String> result = null;

        result = liste.stream()
                .filter(e -> e.length() > 4)
                .map(e -> e.toLowerCase())
                .collect(Collectors.toList());

        return result;
    }
}

package pr2.collections.woerterbuch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Woerterbuch {

    private static final Map<String, String> WOERTER;

    static {
        Map<String, String> map = new HashMap<String, String>();
        map.put("gehen", "go");
        map.put("schlafen", "sleep");
        map.put("tanzen", "dance");
        map.put("springen", "jump");

        WOERTER = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Bitte mindestens ein Wort angeben!");
            System.exit(1);
        }

        for (String wort : args) {
            String uebersetzung = WOERTER.get(wort);

            if (uebersetzung == null) {
                uebersetzung = "<unbekanntes Wort>";
            }

            System.out.printf("%s => %s%n", wort, uebersetzung);
        }
    }
}

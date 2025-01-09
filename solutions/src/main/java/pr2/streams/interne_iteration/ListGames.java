package pr2.streams.interne_iteration;

import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class ListGames {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        GameDatabase db = new GameDatabase();

        System.out.println("Interne Iterartion");
        System.out.println();
        Stream<ComputerGame> stream = db.getGames().stream();
        stream.forEach(g -> System.out.println(g));

        System.out.println();
        System.out.println();
        System.out.println("Interne Iterartion mit Methodenreferenz");
        stream = db.getGames().stream();
        stream.forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println("Spiele aus 2012");
        stream = db.getGames().stream();
        stream.forEach(g -> {
            if (g.getYear() == 2012) {
                System.out.println(g);
            }
        });
    }
}

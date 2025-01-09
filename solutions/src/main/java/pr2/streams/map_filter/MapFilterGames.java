package pr2.streams.map_filter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class MapFilterGames {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        GameDatabase db = new GameDatabase();
        List<ComputerGame> games = db.getGames();

        // Alle Spiele von 2010 mit einem Metascore >= 80
        // und einem User-Score >= 80
        Stream<ComputerGame> stream = games.stream();
        stream.filter(g -> g.getYear() == 2010)
                .filter(g -> g.getMetaScore() >= 80)
                .filter(g -> g.getUserScore() >= 80).forEach(
                        System.out::println);

        // Größter und kleinster Unterschied
        stream = games.stream();
        Optional<ComputerGame> o = stream.max((a, b) -> (
                a.getMetaScore() - a.getUserScore() - b.getMetaScore()
                        + b.getUserScore()));
        if (o.isPresent()) {
            System.out.println("Größte Abweichung: " + o.get());
        }

        stream = games.stream();
        o = stream.min((a, b) -> (
                a.getMetaScore() - a.getUserScore() - b.getMetaScore()
                        + b.getUserScore()));

        if (o.isPresent()) {
            System.out.println("Kleinste Abweichung: " + o.get());
        }
    }
}

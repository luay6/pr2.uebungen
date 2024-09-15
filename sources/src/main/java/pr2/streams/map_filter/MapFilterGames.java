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
        // TODO: Spiele filtern

        // Größter und kleinster Unterschied
        stream = games.stream();
        // TODO: Daten extrahieren
    }
}

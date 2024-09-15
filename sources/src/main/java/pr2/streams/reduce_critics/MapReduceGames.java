package pr2.streams.reduce_critics;

import java.util.List;
import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class MapReduceGames {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        GameDatabase db = new GameDatabase();
        List<ComputerGame> games = db.getGames();

        // Abweichung des Metascores von dem Userscore
        // als quadratisches Mittel berechnen.
        Stream<ComputerGame> stream = games.stream();

        // TODO: Berechnung einfügen

        // Abweichung als arithmetisches Mittel
        stream = games.stream();
        // TODO: Berechnung einfügen

        // TODO: Ergebnis ausgeben
    }
}

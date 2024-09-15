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
        // TODO: Spiele per Lambda-Ausdruck auf der Konsole ausgeben

        System.out.println();
        System.out.println();
        System.out.println("Interne Iterartion mit Methodenreferenz");
        stream = db.getGames().stream();
        // TODO: Spiele per Methoden-Referenz auf der Konsole ausgeben

        System.out.println();
        System.out.println();
        System.out.println("Spiele aus 2012");
        stream = db.getGames().stream();
        // TODO: Spiele aus dem Jahr 2012 mit einem Lambda-Ausdruck ausgeben
    }
}

package pr2.streams.interne_iteration;

/**
 * Computerspiel.
 */
public class ComputerGame {

    /**
     * Name.
     */
    private final String name;

    /**
     * Jahr.
     */
    private final int year;

    /**
     * Metacritic.
     */
    private final int metaScore;

    /**
     * Userscore.
     */
    private final int userScore;

    /**
     * Legt ein neues Spiel an.
     *
     * @param name      Name des Spiels.
     * @param year      Jahr.
     * @param metaScore Metacritic-Bewertung.
     * @param userScore Nutzer-Bewertung.
     */
    public ComputerGame(String name, int year, int metaScore, int userScore) {
        this.name = name;
        this.year = year;
        this.metaScore = metaScore;
        this.userScore = userScore;
    }

    /**
     * Name des Spiels.
     *
     * @return Der Name
     */
    public String getName() {
        return name;
    }

    /**
     * Jahr, in dem das Spiel erschienen ist bzw. kritisiert wurde.
     *
     * @return Das Erscheinungsjahr.
     */
    public int getYear() {
        return year;
    }

    /**
     * Die Metacritic-Bewertung (0-100).
     *
     * @return Die Bewertung.
     */
    public int getMetaScore() {
        return metaScore;
    }

    /**
     * Die Benutzerbewertung (0-100).
     *
     * @return Die Benutzerbewertung.
     */
    public int getUserScore() {
        return userScore;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%d;%s;%s;%d", metaScore, name, userScore / 10.0,
                year);
    }
}

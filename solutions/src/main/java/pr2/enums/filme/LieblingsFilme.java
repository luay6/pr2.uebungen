package pr2.enums.filme;

public enum LieblingsFilme {

    /**
     * Pulp Fiction.
     */
    PULP_FICTION("Pulp Fiction", "Quentin Tarantino", 9),
    /**
     * Fight Club.
     */
    FIGHT_CLUB("Fight Club", "David Fincher", 9),
    /**
     * Twelve Monkeys.
     */
    TWELVE_MONKEYS("Twelve Monkeys", "Terry Giliam", 8),
    /**
     * Killer Tomatos.
     */
    KILLER_TOMATOES("Attack of the Killer Tomatoes", "John de Bello", 4);

    private final String name;
    private final int bewertung;
    private final String regisseur;

    private LieblingsFilme(String name, String regisseur,
                           int bewertung) {
        this.name = name;
        this.regisseur = regisseur;
        this.bewertung = bewertung;
    }

    public String getName() {
        return name;
    }

    public int getBewertung() {
        return bewertung;
    }

    public String getRegisseur() {
        return regisseur;
    }

    @Override
    public String toString() {
        return String.format("'%s' von %s; Bewertung %d", name,
                regisseur, bewertung);
    }
}

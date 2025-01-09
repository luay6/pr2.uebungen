package pr2.enums.eigene;

/**
 * Enumeration für die verschiedenen Würfel-Typen.
 */
public enum WuerfelTyp {

    /**
     * 4-seitiger Würfel.
     */
    D4(4),

    /**
     * 6-seitiger Würfel.
     */
    D6(6),

    /**
     * 8-seitiger Würfel.
     */
    D8(8),

    /**
     * 10-seitiger Würfel.
     */
    D10(10),

    /**
     * 12-seitiger Würfel.
     */
    D12(12),

    /**
     * 20-seitiger Würfel.
     */
    D20(20);

    /**
     * Anzahl der Seiten.
     */
    private final int seiten;

    /**
     * Neue Instanz anlegen.
     *
     * @param seiten Anzahl der Seiten.
     */
    WuerfelTyp(int seiten) {
        this.seiten = seiten;
    }

    /**
     * Anzahl der Seiten.
     *
     * @return Anzahl der Seiten.
     */
    public int getSeiten() {
        return seiten;
    }

    /**
     * Durchschnittliche Augenzahl bei einer großen Anzahl von
     * Würfen.
     *
     * @return Durchschnittliche Augenzahl.
     */
    public double average() {
        return 0.5 * (seiten + 1);
    }
}

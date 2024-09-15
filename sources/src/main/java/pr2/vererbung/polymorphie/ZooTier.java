package pr2.vererbung.polymorphie;

/**
 * Ein Tier im Zoo.
 */
public class ZooTier {

    /**
     * Name des Tiers.
     */
    private final String name;

    /**
     * Zeigt an, ob das Tier hungrig ist.
     */
    private boolean hungrig = true;

    /**
     * Legt ein neues Zootier an.
     *
     * @param name Name des Tiers
     */
    public ZooTier(String name) {
        this.name = name;
    }

    /**
     * Gibt dem Tier futter.
     */
    public void fuettern() {
        hungrig = false;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name + ": Ich bin " + (hungrig ? "hungrig" : "satt") + "!";
    }
}

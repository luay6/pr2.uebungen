package pr2.vererbung.polymorphie;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert das Tier.
     *
     * @param tier Tier, das gefüttert werden soll.
     */
    public void gibFutter(ZooTier tier) {
        tier.fuettern();
    }


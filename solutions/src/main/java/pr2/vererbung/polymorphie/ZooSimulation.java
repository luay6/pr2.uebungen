package pr2.vererbung.polymorphie;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();

        ZooTier[] tiere = {new Affe("Charlie"), new Gorilla("Buck"),
                new Giraffe("Debbie")};

        for (ZooTier tier : tiere) {
            System.out.println(tier);
        }

        System.out.println("Fütterung...");

        for (ZooTier tier : tiere) {
            futterstelle.gibFutter(tier);
        }

        for (ZooTier tier : tiere) {
            System.out.println(tier);
        }
    }
}

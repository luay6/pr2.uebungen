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

        Affe charlie = new Affe("Charlie");
        Gorilla buck = new Gorilla("Buck");
        Giraffe debbie = new Giraffe("Debbie");

        System.out.println(charlie);
        System.out.println(buck);
        System.out.println(debbie);

        System.out.println("Fütterung...");

        futterstelle.gibFutter(charlie);
        futterstelle.gibFutter(buck);
        futterstelle.gibFutter(debbie);

        System.out.println(charlie);
        System.out.println(buck);
        System.out.println(debbie);
    }
}

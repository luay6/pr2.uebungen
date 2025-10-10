package pr2.auffrischung.grossmacher;

public class Grossmacher {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Kein Argument angeben!");
            return;
        }

        String ergebnis = args[0].toUpperCase();

        System.out.printf("Ergebnis: %s%n", ergebnis);
        System.out.printf("Zeichen : %d%n", ergebnis.length());
    }
}

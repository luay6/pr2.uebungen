
package pr2.interfaces.uebersetzer;

public class Translator {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Bitte geben Sie genau zwei "
                    + "Optionen an: Zielsprache und zu "
                    + "übersetzendes Wort");
            System.exit(1);
        }

        String sprache = args[0].toLowerCase();
        String wort = args[1];

        Uebersetzer uebersetzer = null;

        if ("englisch".equals(sprache)) {
            uebersetzer = new UebersetzerDeutschEnglisch();
        } else if ("spanisch".equals(sprache)) {
            uebersetzer = new UebersetzerDeutschSpanisch();
        } else {
            System.out.println("Unbekannte Sprache");
            System.exit(1);
        }

        String uebersetzung = uebersetzer.uebersetze(wort);

        if (uebersetzung != null) {
            System.out.printf("Übersetzung: deutsch -> "
                            + "%s%n%s -> %s%n",
                    sprache, wort, uebersetzung);
        } else {
            System.out.printf("Unbekanntes Wort: %s%n", wort);
        }
    }
}

package pr2.collections.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Klassen, um die in einem Text vorkommenden Wörter zu sammeln.
 */
public class WordCollector {


    /**
     * Listet alle Worte in der Datei alphabetisch auf. Duplikate werden
     * entfernt. Die Wörter werden in Kleinbuchstaben umgewandelt.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Worte
     * @throws IOException Fehler beim Dateizugriff.
     */
    public static List<String> listWords(String filename) throws IOException {
        List<String> allWords = readFileAndSplitIntoWords(filename);
        List<String> result = removeDuplicates(allWords);

        return result;
    }

    /**
     * Listet alle Worte in der Datei auf.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Worte
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static List<String> readFileAndSplitIntoWords(String filename)
            throws IOException {

        // Datei zum Lesen öffnen
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line; // aktuelle Zeile

        List<String> wordList = new LinkedList<>();

        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {

            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.toLowerCase();
            line = line.replaceAll("[\",.:'\\-!?]", "");

            String[] words = line.toLowerCase().split("[,. ]");

            // Worte in den Puffer übertragen
            wordList.addAll(Arrays.asList(words));
        }

        reader.close();

        return wordList;
    }

    /**
     * Sortiert das übergebene Array alphabetisch und entfernt Duplikate.
     *
     * @param input Eingabe Array
     * @return sortiertes und bereinigtes Array
     */
    @SuppressWarnings("PMD.AvoidReassigningLoopVariables")
    private static List<String> removeDuplicates(List<String> input) {

        // Eingabe-Liste kopieren
        List<String> strings = new ArrayList<>(input);

        // Liste sortieren
        Collections.sort(strings);

        // Über die Einträge laufen
        for (int i = 0; i < strings.size(); i++) {

            String word = strings.get(i);

            // Über die Einträge laufen
            for (int k = i + 1; k < strings.size(); k++) {

                String otherWord = strings.get(k);

                if (otherWord.compareTo(word) > 0) {
                    // Sind schon hinter der möglichen Position
                    break;
                }
                else if (otherWord.equals(word)) {
                    // Duplikat, entfernen
                    strings.remove(k);
                    k--;
                }
            }
        }

        return strings;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        try {
            List<String> words = listWords(
                    "kafka.txt");
            System.out.println(words);
        } catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}

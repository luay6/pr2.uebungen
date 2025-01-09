package pr2.collections.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Klassen, um die in einem Text vorkommenen Wörter zu sammeln.
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
        Set<String> allWords = readFileAndSplitIntoWords(filename);
        List<String> wordsSorted = new ArrayList<>(allWords);
        Collections.sort(wordsSorted);
        return wordsSorted;
    }

    /**
     * Listet alle Worte in der Datei auf.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Worte
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static Set<String> readFileAndSplitIntoWords(String filename)
            throws IOException {

        // Datei zum Lesen öffnen
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line; // aktuelle Zeile
        Set<String> wordBuffer = new HashSet<>(); // Puffer für die Worte

        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {

            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.replaceAll("[\",.:'\\-!?]", "");

            String[] words = line.toLowerCase().split("[,. ]");

            // Worte in den Puffer übertragen
            wordBuffer.addAll(Arrays.asList(words));
        }

        reader.close();

        return wordBuffer;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        try {
            List<String> words = listWords("kafka.txt");
            System.out.println(words);
        } catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}

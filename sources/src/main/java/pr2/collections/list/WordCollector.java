package pr2.collections.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Klassen, um die in einem Text vorkommenden Wörter zu sammeln.
 */
public class WordCollector {

        /**
         * Listet alle Worte in der Datei alphabetisch auf. Duplikate werden
         * entfernt. Die Wörter werden in Kleinbuchstaben umgewandelt.
         *
         * @param filename Dateiname
         * @return die Liste der vorhandenen Wort
         * @throws IOException Fehler beim Dateizugriff.
         */
        public static ArrayList<String> listWords(String filename) throws IOException {
            ArrayList<String> allWords = readFileAndSplitIntoWords(filename);
            ArrayList<String> result = removeDuplicates(allWords);

            return result;
        }

        /**
         * Listet alle Worte in der Datei auf.
         *
         * @param filename Dateiname
         * @return die Liste der vorhandenen Wort
         * @throws IOException Fehler beim Dateizugriff.
         */
        private static ArrayList<String> readFileAndSplitIntoWords(String filename)
                throws IOException {

            // Datei zum Lesen öffnen
            BufferedReader reader = new BufferedReader(
                new FileReader(filename));

            String line; // aktuelle Zeile
            ArrayList<String> wordlist = new ArrayList<String>(); // Puffer für die Worter

            // Über die Zeilen der Datei iterieren
            while ((line = reader.readLine()) != null) {

                // Sonderzeichen entfernen und die Zeilen in Worte splitten
                line = line.toLowerCase();
                line = line.replaceAll("[\",.:'\\-\\!?]", "");
                String[] words = line.toLowerCase().split("[,. ]");
                for(String word : words) {
                    wordlist.add(word);                    
                }

            }
            Set<String> tempSet = new HashSet();
            tempSet.addAll(wordlist);
            wordlist.clear();
            wordlist.addAll(tempSet);
            return wordlist;
        }

        /**
         * Sortiert das übergebene Array alphabetisch und entfernt Duplikate.
         *
         * @param input Eingabe Array
         * @return sortiertes und bereinigtes Array
         */
        private static ArrayList<String> removeDuplicates(ArrayList<String> list) {
            Collections.sort(list);
            return list;
        }

        /**
         * Hauptmethode.
         *
         * @param args Kommandozeilen-Argumente.
         */
        public static void main(String[] args) {

            try {
                ArrayList<String> words = listWords(
                    "kafka.txt");
                System.out.println(words);
            }
            catch (IOException e) {
                System.err.println("Probleme beim Dateizugriff: " + e);
            }
        }
}

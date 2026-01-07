package pr2.io.reader_writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Liest eine Textdatei und gibt den Inhalt auf der Konsole aus.
 */
public class ReadAndPrintFile {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Path current = Paths.get("C:\\MyFiles\\thma\\ib2\\pr2\\uebungen\\sources");
        Path ziel = Paths.get("C:\\MyFiles\\thma\\ib2\\pr2\\uebungen\\sources\\src\\main\\resources\\pr2\\io\\reader_writer\\kafka.txt");
        Path relativized = current.relativize(ziel);
        String filename = args.length == 1
                ? args[0]
                : relativized.toFile().toString();

        try (BufferedReader bf = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(relativized);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }
}

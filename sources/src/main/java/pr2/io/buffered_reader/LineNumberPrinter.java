package pr2.io.buffered_reader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Liest eine Textdatei und gibt den Inhalt auf der Konsole aus.
 */
public class LineNumberPrinter {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        String filename = args.length == 1
                ? args[0]
                : "	src\\main\\resources\\pr2\\io\\reader_writer\\kafka.txt";
              //  : "pr2/io/reader_writer/kafka.txt";

        try (BufferedReader bis = new BufferedReader(new FileReader(filename))){
            String lineRead;
            int lineNumber = 1;
            while((lineRead = bis.readLine()) != null) {
                System.out.println(lineNumber + ": " + lineRead);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e1) {
            System.out.println("File not found 1");
            e1.printStackTrace();
        }
        
    }
}

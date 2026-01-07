package pr2.io.datei_lesen;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Daten aus einer Datei lesen.
 */
public class ReadData {

    /**
     * Datei.
     */
    private static final String FILE = "src\\main\\resources/pr2/io/datei_lesen/daten.dat";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        // TODO: Datei `FILE` öffnen
        
            try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE))){
                try {
                    int read;
                    while((read = dis.read()) != -1) {
                    // TODO: Bytes in Strings umwandeln (siehe Klasse `Integer`)
                    String s = Integer.toString(read);    
                    // TODO: Bytes ausgeben

                        System.out.print("0x" + Integer.toHexString(read) + " ");

                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // TODO: Bytes aus der Datei lesen
 catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        
    }
}

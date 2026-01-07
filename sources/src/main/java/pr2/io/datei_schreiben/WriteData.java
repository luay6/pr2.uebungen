package pr2.io.datei_schreiben;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Daten aus einer Datei lesen.
 */
public class WriteData {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {

        String file = args[0];
        // TODO: OutputStream für Datei `file` öffnen
        try(OutputStream os =  new FileOutputStream(file)){
            // TODO: 0xca 0xff 0xfe 0xba 0xbe 0x0 0xde 0xad 0xbe 0xef schreiben
            byte[] byteArray = {(byte)0xca, (byte)0xff, (byte)0xfe, (byte)0xba, (byte)0xbe, (byte)0x0, (byte)0xde, (byte)0xad, (byte)0xbe, (byte)0xef};
            os.write(byteArray);
        }
        // TODO: OutputStream schließen
 catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

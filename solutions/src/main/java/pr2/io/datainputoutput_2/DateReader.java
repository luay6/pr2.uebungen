package pr2.io.datainputoutput_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReader {

    public static void main(String[] args) {

        ObjectInputStream ois = null;

        try {
            DateFormat df = new SimpleDateFormat(DateWriter.FORMAT);
            ois = new ObjectInputStream(
                    new FileInputStream(DateWriter.DATEINAME));

            Date date = (Date) ois.readObject();
            System.out.printf("Das Datum war: %s%n%n", df.format(date));

        } catch (FileNotFoundException e) {
            System.err.printf("Datei %s kann nicht gelesen werden: %s%n%n",
                    DateWriter.DATEINAME, e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.printf("Fehler beim Lesen der Datei %s:%s%n%n",
                    DateWriter.DATEINAME, e.getMessage());
            System.exit(1);
        } catch (ClassNotFoundException e) {
            // Date ist Teil der Library, ist immer vorhanden
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }
}

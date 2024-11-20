package pr2.io.datainputoutput_1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReader {
    public static void main(String[] args) {

        DataInputStream dis = null;

        try {
            DateFormat df = new SimpleDateFormat(DateWriter.FORMAT);
            dis = new DataInputStream(
                    new FileInputStream(DateWriter.DATEINAME));

            long time = dis.readLong();
            System.out.printf("Das Datum war: %s%n%n",
                    df.format(new Date(time)));

        } catch (FileNotFoundException e) {
            System.err.printf("Datei %s kann nicht gelesen werden: %s%n%n",
                    DateWriter.DATEINAME, e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.printf("Fehler beim Lesen der Datei %s:%s%n%n",
                    DateWriter.DATEINAME, e.getMessage());
            System.exit(1);
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }
}

package pr2.io.datainputoutput_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWriter {

    /**
     * Dateiname mit den Testdaten.
     */
    public static final String DATEINAME = "/tmp/test.ser";

    /**
     * Datumsformat.
     */
    public static final String FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.printf("Bitte eine Datum im Format %s angeben%n%n",
                    FORMAT);
            System.exit(1);
        }

        ObjectOutputStream dos = null;

        try {
            DateFormat df = new SimpleDateFormat(FORMAT);
            Date date = df.parse(args[0]);
            dos = new ObjectOutputStream(
                    new FileOutputStream(DATEINAME));

            dos.writeObject(date);
        } catch (ParseException e) {
            System.err.printf("%s ist kein gültiges Datumsformat: %s%n%n",
                    args[0], FORMAT);
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.printf("Datei %s kann nicht geschrieben werden: %s%n%n",
                    DATEINAME, e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.printf("Fehler beim Schreiben der Datei %s:%s%n%n",
                    DATEINAME, e.getMessage());
            System.exit(1);
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }
}

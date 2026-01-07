package pr2.io.datainputoutput_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWriter {

    /**
     * Dateiname mit den Testdaten.
     */
    public static final String DATEINAME = "temp/test.ser";

    /**
     * Datumsformat.
     */
    public static final String FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
        
        Path path = Paths.get(DATEINAME);
        if(path.getParent() != null) {
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            ){
                try {
                    Date date = sdf.parse(args[0]);
                    oos.writeObject(date);
                    System.out.println("done");
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
    }
}

package pr2.io.datainputoutput_1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    public static final String DATEINAME = "temp/test.data";

    /**
     * Datumsformat.
     */
    public static final String FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) {
        Path path = Paths.get(DATEINAME);
        if(path.getParent() != null) {
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
               System.out.println("IOException");
            }
        }
        if(args.length < 1 ) {
            System.out.println("your input please");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(path.toFile()))) {
            Date date = sdf.parse(args[0]);
            dos.writeLong(date.getTime());
            System.out.println("done");
        } catch (ParseException e) {
            System.err.println("wrong format");
        } catch (FileNotFoundException e1) {
            System.err.println("file not found");
        } catch (IOException e1) {
            System.err.println("file not found");
            
        }
        
        
        
        
    }
}

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

       try (DataInputStream dis = new DataInputStream(new FileInputStream("temp/test.data"))) {
           Date date = new Date(dis.readLong());
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
           System.out.println(sdf.format(date));
       } catch (FileNotFoundException e) {
        System.out.println("file not found");
       } catch (IOException e1) {
        System.out.println("IOException");
    }
    }
}

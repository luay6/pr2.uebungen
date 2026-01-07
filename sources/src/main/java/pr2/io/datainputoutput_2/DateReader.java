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

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp/test.ser"))){
            Date date = (Date) ois.readObject();
            System.out.println(sdf.format(date));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

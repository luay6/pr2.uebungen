package pr2.io.scrambler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Scrambler {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Bitte eine Datei angeben");
            System.exit(1);
        }

        FileInputStream re = new FileInputStream(args[0]);
        int read;
        boolean printThisByte = true;
        while ((read = re.read()) != -1) {
            re.skip(1);
            System.out.print((char) read);

            re.skip(2);
        }
        re.close();

    }
}

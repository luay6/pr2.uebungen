package pr2.io.scrambler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Scrambler {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Bitte eine Datei angeben");
            System.exit(1);
        }

        FileInputStream fis;

        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.err.printf("Datei nicht gefunden: %s%n", args[0]);
            System.exit(1);
            return; // never reached
        }

        int input;
        int count = 0;

        while ((input = fis.read()) != -1) {
            byte b = (byte) input;

            if (count++ % 2 == 0) {
                System.out.write(b);
            }
        }

        fis.close();
    }
}

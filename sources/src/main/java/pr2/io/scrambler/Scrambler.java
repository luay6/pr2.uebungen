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

    }
}

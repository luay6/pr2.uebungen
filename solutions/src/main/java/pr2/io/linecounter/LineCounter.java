package pr2.io.linecounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

    public static void main(String[] args) throws IOException {

        int lines = 0;

        if (args.length != 1) {
            System.err.println("Bitte eine Datei angeben");
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(new FileReader(args[0]));


        while (br.readLine() != null) {
            lines++;
        }

        br.close();

        System.out.printf("Datei: %s hat %d Zeilen%n", args[0], lines);
    }
}

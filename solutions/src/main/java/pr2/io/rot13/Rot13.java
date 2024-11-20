package pr2.io.rot13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Rot13 {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Bitte eine Datei angeben");
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(
                new Rot13Reader(new FileReader(args[0])));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

package pr2.io.linecounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LineCounter {

    public static void main(String[] args) throws IOException {

        int lines = 0;

        BufferedReader bf = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = bf.readLine()) != null) {
            lines++;
        }
        System.out.printf("Datei: %s hat %d Zeilen%n", args[0], lines);
    }
}

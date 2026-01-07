package pr2.io.rot13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Rot13 {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Bitte eine Datei angeben");
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(new Rot13Reader(new FileReader(args[0])));
        String read;
        while((read = br.readLine()) != null){
            System.out.print(read);
            
        }
        
    }
}

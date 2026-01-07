package pr2.exceptions.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Ein simples Zahlenraten-Spiel.
 */
public final class Zahlenraten {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     * @throws IOException Probleme mit der Console
     */
    private static String readNumber() throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args){

        // zu ratende Zahl bestimmen
        int zahl = new Random().nextInt(100) + 1;

        int versuche = 0;

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl ein: ");
            try {
                
            int geraten  = Integer.parseInt(readNumber());
            versuche++;

            if (geraten < zahl) {
                System.out.println("Zu niedrig");
            }
            else if (geraten > zahl) {
                System.out.println("Zu hoch.");
            }
            else {
                System.out.printf("Richtig in %d Versuchen", versuche);
                break;
            }
            }
            catch(NumberFormatException e) {
                System.out.println("number format Exception");
            } catch (IOException e) {
                System.out.println("falsche Zahl");
                e.printStackTrace();
            }
        }
    }
}

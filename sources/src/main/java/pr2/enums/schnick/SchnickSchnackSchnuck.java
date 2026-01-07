package pr2.enums.schnick;

import java.util.Random;
import java.util.Scanner;

/**
 * Schick - Schnack - Schnuck (Rock - Paper - Scissors).
 */
public class SchnickSchnackSchnuck {
    public static void main(String args[]) {
        Random rnd = new Random();
        int runde = 1;
        int spielerPoints = 0;
        int computerPoints = 0;
        Scanner in = new Scanner(System.in);
        String sZug;
        Move sMove = null;
        Move cMove;
        do {
            System.out.print(
            "Rund: " + runde + " Dein Zug ([r]rock, [p]aper, [s]cissors)? "
                    );
            sZug = in.nextLine();
            for(Move m : Move.values()) {
                if(sZug.equals(m.key)) {
                    sMove = m;
                }
            }
            cMove = Move.values()[rnd.nextInt(Move.values().length)];
            if(cMove.equals(sMove)) {
                System.out.println(
                        "Unentschieden - Du: " + sMove + ", Computer: " + cMove
                        + "- [" + spielerPoints +
                        " : " + computerPoints + " ]"
                        );
            }
            if(cMove.beats(sMove)) {
                computerPoints++;
                System.out.println(
                        "Der Computer hat gewonnen - Du: " + sMove + ", Computer: " + cMove
                        + "- [" + spielerPoints +
                        " : " + computerPoints + " ]"
                        );
            }
            
            if(sMove.beats(cMove)) {
                spielerPoints++;
                System.out.println(
                        "Du hast gewonnen - Du: " + sMove + ", Computer: " + cMove
                        + "- [" + spielerPoints +
                        " : " + computerPoints + " ]"
                        );
            }
            runde++;
        }
        while(runde <=3 );
        System.out.println(
                "Ergebnis: Du [" + spielerPoints + "] Punkt(e), Computer [" + computerPoints + "] Punkt(e)"
                );
        

    }

}

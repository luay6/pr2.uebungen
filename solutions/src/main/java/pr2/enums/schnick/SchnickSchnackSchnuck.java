package pr2.enums.schnick;

import java.util.Random;
import java.util.Scanner;

/**
 * Schick - Schnack - Schnuck (Rock - Paper - Scissors).
 */
public class SchnickSchnackSchnuck {

    /**
     * Vergleicht den Zug zweier Spieler.
     *
     * @param a Zug von Spieler a.
     * @param b Zug von Spieler b.
     * @return 1 spieler a hat gewonnen, 0, unentschieden, -1 spieler b
     *     hat gewonnen.
     */
    private static int compare(Move a, Move b) {

        if (a == b) {
            return 0;
        }
        else if (a == Move.SCISSORS && b == Move.PAPER) {
            return 1;
        }
        else if (a == Move.ROCK && b == Move.SCISSORS) {
            return 1;
        }
        else if (a == Move.PAPER && b == Move.ROCK) {
            return 1;
        }
        else {
            return compare(b, a) * -1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int pointsPlayer = 0;
        int pointsComputer = 0;

        // Play three rounds
        for (int i = 0; i < 3; i++) {

            // Read the player's choice
            Move movePlayer = null;

            while (movePlayer == null) {
                System.out.printf(
                        "\nRunde %s: Dein Zug ([r]rock, [p]aper, [s]cissors)? ",
                        i);
                String move = scanner.nextLine().trim();
                movePlayer = Move.find(move);
            }

            // Random move of the computer
            Move moveComputer =
                    Move.values()[rnd.nextInt(2)];

            // Compare moves
            int winner = compare(movePlayer, moveComputer);

            String winnerText;

            if (winner == 1) {
                pointsPlayer++;
                winnerText = "Du hast gewonnen";
            } else if (winner == -1) {
                pointsComputer++;
                winnerText = "Der Computer hat gewonnen";
            } else {
                winnerText = "Unentschieden";
            }
            System.out.printf("%s: %s, Computer: %s - [%d:%d]\n",
                    winnerText,
                    movePlayer, moveComputer,
                    pointsPlayer, pointsComputer);
        }

        System.out.printf(
                "\nErgebnis - Du %d Punkt(e), "
                + "Computer %d Punkt(e)",
                pointsPlayer, pointsComputer);
    }
}

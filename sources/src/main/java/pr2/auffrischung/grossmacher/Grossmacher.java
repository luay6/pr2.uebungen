package pr2.auffrischung.grossmacher;

import java.util.Scanner;

import ui.Colors;
import ui.ConsoleUI;

public class Grossmacher {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            String input;
            do {
                System.out.print(ConsoleUI.CLEAR);
                System.out.print(ConsoleUI.HOME);

                System.out.println("Type \"exit\" to exit!");
                System.out.println("Your text here: ");

                input = in.nextLine();

                char[] inputChar = input.toCharArray();
                for (int i = 0; i < inputChar.length; i++) {
                    if ('a' <= inputChar[i] && inputChar[i] <= 'z') {
                        inputChar[i] -= 32;
                    }
                }

                String result = new String(inputChar);

                if (input.equals("exit")) {
                    System.out.println(Colors.BURNT_PEACH_SOFT
                            + "program finished" + Colors.RESET);
                } else {
                    System.out.println(
                            Colors.HONEY_BRONZE_LIGHT + result + " " + result.length() + Colors.RESET);
                        
                }

            } while (!input.equals("exit"));

        }

    }

}

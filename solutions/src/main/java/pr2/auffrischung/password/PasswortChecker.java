package pr2.auffrischung.password;

public class PasswortChecker {

    private static final char[] NUMBERS = "1234567890".toCharArray();
    private static final char[] LOWERCASE
            = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] UPPERCASE
            = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] SPECIAL_CHARS = "!%()\"".toCharArray();

    private static boolean contains(String string, char[] chars) {
        for (char c : chars) {
            if (string.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static int checkPassword(String password) {
        int points = 0;

        if (password.length() >= 8) {
            points++;
        }

        if (contains(password, NUMBERS)
                && (contains(password, LOWERCASE)
                || contains(password, UPPERCASE))) {
            points++;
        }

        if (contains(password, SPECIAL_CHARS)) {
            points++;
        }

        if (contains(password, LOWERCASE) && contains(password, UPPERCASE)) {
            points++;
        }

        return points;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("mutti"));
        System.out.println(checkPassword("Mutti"));
        System.out.println(checkPassword("mutti123"));
        System.out.println(checkPassword("Mutti123"));
        System.out.println(checkPassword("Mutti123!%"));
        System.out.println(checkPassword("1234"));
    }
}

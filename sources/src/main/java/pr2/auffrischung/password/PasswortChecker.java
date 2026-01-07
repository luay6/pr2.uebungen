package pr2.auffrischung.password;

public class PasswortChecker {
    static final char[] LOWER_CASE= "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static final char[] UPPER_CASE= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static final char[] NUMBERS = "1234567890".toCharArray();
    static final char[] SYMBOLS = "!%()\"".toCharArray();
    
    public static boolean contains(String string, char[] charArray) {
        for(char c : charArray) {
            if(string.indexOf(c) >=0) {
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
        if(contains(password, LOWER_CASE) &&
           contains(password, UPPER_CASE)) {
            points++;
        }
        if((contains(password, LOWER_CASE) || contains(password, UPPER_CASE)) &&
            contains(password, NUMBERS)) {
            points++;
        }
        if(contains(password, SYMBOLS)) {
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

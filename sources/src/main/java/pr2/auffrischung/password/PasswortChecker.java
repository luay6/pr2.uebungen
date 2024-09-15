package pr2.auffrischung.password;

public class PasswortChecker {


    public static int checkPassword(String password) {
        int points = 0;

        // TODO: Methode implementieren

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


package pr2.interfaces.uebersetzer;

public class UebersetzerDeutschEnglisch implements Uebersetzer {

    @Override
    public String uebersetze(String string) {

        return switch (string) {
            case "gehen" -> "go";
            case "schalfen" -> "sleep";
            case "tanzen" -> "dance";
            default -> null;
        };

    }
}

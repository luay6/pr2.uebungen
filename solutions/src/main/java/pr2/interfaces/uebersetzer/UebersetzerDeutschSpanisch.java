package pr2.interfaces.uebersetzer;

public class UebersetzerDeutschSpanisch implements Uebersetzer {

    @Override
    public String uebersetze(String string) {

        return switch (string) {
            case "gehen" -> "ir";
            case "schalfen" -> "dormir";
            case "tanzen" -> "bailar";
            default -> null;
        };

    }
}

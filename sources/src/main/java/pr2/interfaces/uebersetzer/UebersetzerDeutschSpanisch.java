package pr2.interfaces.uebersetzer;

public class UebersetzerDeutschSpanisch implements Uebersetzer {
    String[] deutsch = { "haus", "hund", "katze", "baum", "wasser" };

    String[] spanisch = { "casa", "perro", "gato", "árbol", "agua" };

    @Override
    public String uebersetze(String string) {
        for (int i = 0; i < deutsch.length; i++) {
            if (deutsch[i].equals(string)) {
                return spanisch[i];
            }
        }
        return "Unbekanntes Wort";
    }

}

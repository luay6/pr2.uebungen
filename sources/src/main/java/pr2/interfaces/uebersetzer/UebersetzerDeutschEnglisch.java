package pr2.interfaces.uebersetzer;

public class UebersetzerDeutschEnglisch implements Uebersetzer{
    String[] deutsch = {
            "haus",
            "hund",
            "katze",
            "baum",
            "wasser"
        };
    
    String[] englisch = {
            "house",
            "dog",
            "cat",
            "tree",
            "water"
        };
    
    @Override
    public String uebersetze(String string) {
        for(int i = 0; i < deutsch.length; i++) {
            if(deutsch[i].equals(string)) {
                return englisch[i];
            }
        }
        return "Unbekanntes Wort";
    }

}

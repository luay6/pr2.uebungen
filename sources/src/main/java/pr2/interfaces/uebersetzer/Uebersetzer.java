package pr2.interfaces.uebersetzer;

public interface Uebersetzer {

    /**
     * Übersetzt den gegebeben String.
     *
     * @param string String, der übersetzt werden soll
     * @return die Übersetzung oder {@literal null}, wenn das Wort nicht
     *     bekannt ist
     */
    public String uebersetze(String string);
}
    
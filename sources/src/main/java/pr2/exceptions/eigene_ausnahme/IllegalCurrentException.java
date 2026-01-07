package pr2.exceptions.eigene_ausnahme;

/**
 * Ausnahme, wenn eine Sicherung angelegt werden soll, die es nicht gibt.
 */
public class IllegalCurrentException extends Exception{
    int nennstrom;
    public IllegalCurrentException(int nennstrom) {
        super();
        this.nennstrom = nennstrom;
    }
    public IllegalCurrentException(String message, int nennstrom) {
        super(message);
        this.nennstrom = nennstrom;
    }
    
}

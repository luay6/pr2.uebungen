package pr2.exceptions.fakultaet;

public class FakultaetException extends Exception{
    String message;
    public FakultaetException() {
        super();
    }
    public FakultaetException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}

package pr2.lambda.observer;

public class Datenhalter {

    private final int geheimerWert;

    public Datenhalter(int geheimerWert) {
        this.geheimerWert = geheimerWert;
    }

    public Beobachter getBeobachter() {
        return new BeobachterImpl();
    }

    private class BeobachterImpl implements Beobachter {

        @Override
        public int getValue() {
            return geheimerWert;
        }

    }
}

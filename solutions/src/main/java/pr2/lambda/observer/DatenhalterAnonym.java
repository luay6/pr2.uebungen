
package pr2.lambda.observer;

public class DatenhalterAnonym {

    private final int geheimerWert;

    public DatenhalterAnonym(int geheimerWert) {
        this.geheimerWert = geheimerWert;
    }

    public Beobachter getBeobachter() {
        return new Beobachter() {
            @Override
            public int getValue() {
                return geheimerWert;
            }
        };
    }
}

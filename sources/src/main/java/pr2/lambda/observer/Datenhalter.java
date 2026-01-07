package pr2.lambda.observer;

public class Datenhalter {
    private int data;
    public Datenhalter(int data) {
        this.data = data;
    }
    private class MeinBeobachter implements Beobachter{

        @Override
        public int getValue() {
            return data;
        }
        
    }
    public Beobachter getBeobachter() {
        return new MeinBeobachter();
    }
}

package pr2.vererbung.ueberschreiben_lebewesen;

public class Dackel extends Lebewesen {

    @Override
    public void bewegen() {
        System.out.println("Auf kurzen Beinen vorwärts wackeln");
    }

    public void bellen() {
        System.out.println("Wau wau wau");
    }
}

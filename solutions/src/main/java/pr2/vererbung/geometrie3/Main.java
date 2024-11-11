package pr2.vererbung.geometrie3;

public class Main {

    public static void main(String[] args) {
        Figur f1 = new Gerade(10);
        Figur f2 = new Gerade(5);

        System.out.println(f1.getFlaeche());
        System.out.println(f2.getFlaeche());
    }
}

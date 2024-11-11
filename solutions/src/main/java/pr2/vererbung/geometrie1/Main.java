package pr2.vererbung.geometrie1;

public class Main {

    public static void main(String[] args) {
        Figur f1 = new Rechteck(10, 10);
        Figur f2 = new Rechteck(5, 10);

        System.out.println(f1.getFlaeche());
        System.out.println(f2.getFlaeche());
    }
}

package pr2.vererbung.geometrie3;

public class Main {

    public static void main(String[] args) {
        Figur fi = new Figur(44);
        Rechteck re = new Rechteck(3, 5);
        Quadrat qu = new Quadrat(5);
        Gerade ge = new Gerade(6);
        System.out.println(fi.getFlaeche());
        System.out.println(re.getFlaeche());
        System.out.println(qu.getFlaeche());
        System.out.println(ge.getFlaeche());
    }
}

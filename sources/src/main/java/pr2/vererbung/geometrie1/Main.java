package pr2.vererbung.geometrie1;

public class Main {

    public static void main(String[] args) {
        Rechteck re = new Rechteck(3,6);
        System.out.println(re.getFlaeche());
        Figur fi = new Figur(55);
        System.out.println(fi.getFlaeche());
    }
}

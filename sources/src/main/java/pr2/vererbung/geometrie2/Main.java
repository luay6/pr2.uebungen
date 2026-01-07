package pr2.vererbung.geometrie2;

public class Main {

    public static void main(String[] args) {
        Rechteck re = new Rechteck(3,5);
        System.out.println(re.getFlaeche());
        
        Figur fi = new Figur(55);
        System.out.println(fi.getFlaeche());
        
    }
}

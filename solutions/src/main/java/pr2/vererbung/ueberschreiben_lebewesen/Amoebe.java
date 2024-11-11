package pr2.vererbung.ueberschreiben_lebewesen;

public class Amoebe extends Lebewesen { 

    @Override
    public void bewegen() {
        System.out.println("Schleimen");
    }
}

package pr2.generics.pair;

public class Main {
    public static void main(String[] args) {
        var note1 = new Pair<String, Integer>("Peter", 1);
        var note2 = new Pair<String, Integer>("Frank", 3);
        var note3 = new Pair<String, Integer>("Sabine", 1);

        var name = new Pair<String, String>("Peter", "Meier");

        System.out.printf("%s:%d\n", note1.getFirst(), note1.getSecond());
        System.out.printf("%s:%d\n", note2.getFirst(), note1.getSecond());
        System.out.printf("%s:%d\n", note3.getFirst(), note1.getSecond());

        System.out.printf("%s %s\n", name.getFirst(), name.getSecond());
    }
}

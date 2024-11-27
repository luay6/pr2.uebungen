package pr2.generics.same_pair;

public class Main {
    public static void main(String[] args) {
        var note = new Pair<String, Integer>("Peter", 1);
        var name = new SamePair<String>("Peter", "Meier");
        var tel = new SamePair<Integer>(621, 2009992);

        System.out.printf("%s:%d\n", note.getFirst(), note.getSecond());

        System.out.printf("%s %s\n", name.getFirst(), name.getSecond());

        System.out.printf("%d %d\n", tel.getFirst(), tel.getSecond());
    }
}

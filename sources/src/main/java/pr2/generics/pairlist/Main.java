package pr2.generics.pairlist;

public class Main {
    public static void main(String[] args) {
// TODO: Einkommentieren
        var note1 = new Pair<String, Integer>("Peter", 1);
        var note2 = new Pair<String, Integer>("Frank", 3);
        var note3 = new Pair<String, Integer>("Sabine", 1);

        var pl = new PairList<String, Integer>(3);
        pl.add(note1);
        pl.add(note2);
        pl.add(note3);

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s:%d\n", pl.get(i).getFirst(),
                    pl.get(i).getSecond());
        }
    }
}

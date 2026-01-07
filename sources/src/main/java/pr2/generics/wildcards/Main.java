package pr2.generics.wildcards;

/**
 * Ausgabe der Liste.
 */
public final class Main {

    /**
     * Constructor.
     */
    private Main() {
        // keine Instanzen
    }

    /**
     * Haupt-Methode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        @SuppressWarnings("PMD.LooseCoupling")
        SimpleList<String> l1 = new SimpleList<>();
        l1.add("Dies");
        l1.add("ist");
        l1.add("ein");
        l1.add("Test");
        l1.add(".");

        @SuppressWarnings("PMD.LooseCoupling")
        SimpleList<Integer> l2 = new SimpleList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        ListHelper.printList(l1);
        ListHelper.printList(l2);
        System.out.println(ListHelper.sumList(l2));
    }
}

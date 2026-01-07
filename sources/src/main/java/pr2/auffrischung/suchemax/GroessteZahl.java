package pr2.auffrischung.suchemax;

public class GroessteZahl {

    public int sucheMax(int[] zahlen) {
        int max = zahlen[0];

        for(int i : zahlen) {
            if(i > max) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        GroessteZahl g = new GroessteZahl();
        System.out.println(g.sucheMax(new int[] {1, 5, 8, 2, 0}));
        System.out.println(g.sucheMax(new int[] {-1, -5, -8, -2, -20}));
        System.out.println(g.sucheMax(new int[] {10000, -10000, 1, 2, 33}));
    }
}

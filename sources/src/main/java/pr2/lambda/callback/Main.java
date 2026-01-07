package pr2.lambda.callback;

import java.util.Arrays;

/**
 * Hauptklasse.
 */
public class Main {

    private static final int[] ZAHLEN =
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                    20};

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {

        NumberSelector s = new NumberSelector();

        int[] gerade = null;

        gerade = s.filter(new Predicate(){
            @Override
            public boolean accept(Object obj) {
                return (Integer)obj % 2 ==0;
            }
        }, ZAHLEN);

        System.out.println(Arrays.toString(gerade));

        int[] ungerade = null;

        ungerade = s.filter(t -> t % 2 !=0, ZAHLEN);

        System.out.println(Arrays.toString(ungerade));

    }
}

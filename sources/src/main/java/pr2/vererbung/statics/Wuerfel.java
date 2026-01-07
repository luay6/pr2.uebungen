package pr2.vererbung.statics;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Häufigkeit der Werte. */
    private static int[] haeufigkeit = new int[6];

    /** Zufallsgenerator. */
    private static Random random = new Random();
    private static int wurfe = 0;

    /**
     * Bestimmt den nächsten Wurf.
     *
     * @return der Wurf.
     */
    public static int wuerfele() {
        int wert = random.nextInt(6);
        haeufigkeit[wert]++;
        wurfe++;
        return wert + 1;
    }

    /**
     * Gibt die Häufigkeit der Würfe zurück.
     *
     * @return die Statistik mit der Häufigkeit.
     */
    public static String statistik() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < haeufigkeit.length; i++) {
            result.append(i + 1)
                  .append(": ")
                  .append(haeufigkeit[i]*100/wurfe)
                  .append("%\n");
        }

        return result.toString();
    }
}

package pr2.vererbung.statics;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Häufigkeit der Werte. */
    private static final int[] HAEUFIGKEIT = new int[6];

    /** Anzahl der Würfe mit dem Würfel. */
    private static int wuerfe = 0;

    /** Zufallsgenerator. */
    private final Random random = new Random();

    /**
     * Bestimmt den nächsten Wurf.
     *
     * @return der Wurf.
     */
    public int wuerfele() {
        int wert = random.nextInt(6);
        HAEUFIGKEIT[wert]++;
        wuerfe++;
        return wert + 1;
    }

    /**
     * Gibt die Häufigkeit der Würfe zurück.
     *
     * @return die Statistik mit der Häufigkeit.
     */
    public static String statistik() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < HAEUFIGKEIT.length; i++) {
            result.append(i + 1)
                  .append(": ")
                  .append(String.format("%.2f %%",
                          ((double) HAEUFIGKEIT[i] / wuerfe) * 100))
                  .append("\n");
        }

        result.append("Summe: ")
              .append(wuerfe)
              .append("\n");

        return result.toString();
    }

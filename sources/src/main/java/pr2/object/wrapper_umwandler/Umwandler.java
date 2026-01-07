package pr2.object.wrapper_umwandler;

/**
 * Enthält Methoden, um Integer-Zahlen umzuwandeln.
 */
public final class Umwandler {

    /**
     * Konstruktor.
     */
    private Umwandler() {
        // keine Instanzen
    }

    /**
     * Wandelt eine Zahl in meherer Formate um.
     *
     * @param i die Zahl.
     * @return String mit mehreren Formaten.
     */
    public static String toString(int i) {
        String decimal = Integer.toString(i);
        String hex  = Integer.toHexString(i);
        String oktal = Integer.toOctalString(i);
        String binary = Integer.toBinaryString(i);
        return "Dezimal: " + decimal + "\nHex: " + hex
                + "\nOktal: " + oktal + "\nBinär: " + binary;
    }

    /**
     * Wandelt einen String (zur Basis 10) in eine Zahl um.
     *
     * @param s String, der umgewandelt werden soll
     * @return Umgewandelte Zahl
     */
    public static int fromString(String s) {
        return Integer.parseInt(s);
    }

    /**
     * Einstiegspunkt in das Programm.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        String s = "17871";
        int i = fromString(s);
        System.out.println(toString(i));
        System.out.println(Integer.valueOf("5"));
        Byte four = -1;
        System.out.println(Byte.toUnsignedInt(four));
    }
}

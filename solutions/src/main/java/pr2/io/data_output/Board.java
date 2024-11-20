package pr2.io.data_output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ein Dame-Brett.
 */
public class Board {

    /**
     * Belegung des Brettes.
     */
    private final Color[][] brett = new Color[8][8];

    /**
     * Liest den Inhalt aus einer Datei.
     *
     * @param file Dateipfad.
     * @return das gelesene Spielfeld
     * @throws IOException IO-Probleme
     */
    public static Board loadFromFile(String file) throws IOException {

        Board result = new Board();

        DataInputStream dis = new DataInputStream(new FileInputStream(file));

        String header = dis.readUTF();

        if (!"Schachbrett".equals(header)) {
            dis.close();
            throw new IOException("Falsches Dateiformat");
        }

        while (true) {
            int x = dis.readByte();
            int y = dis.readByte();
            int ordinal = dis.readInt();

            if (x == 0xff || y == 0xff || ordinal == -1) {
                break;
            }

            result.brett[x][y] = Color.values()[ordinal];
        }

        dis.close();


        return result;
    }


    /**
     * Schreibt den Inhalt des Spielfeldes in eine Datei.
     *
     * @param file Dateiname.
     * @throws IOException IO-Probleme
     */
    public void writeToFile(String file) throws IOException {

        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(file));

        dos.writeUTF("Schachbrett");

        for (int x = 0; x < brett.length; x++) {
            for (int y = 0; y < brett[x].length; y++) {

                Color f = brett[x][y];

                if (f != null) {
                    dos.writeByte(x);
                    dos.writeByte(y);
                    dos.writeInt(f.ordinal());
                }
            }
        }

        dos.writeByte(0xff);
        dos.writeByte(0xff);
        dos.writeInt(-1);

        dos.close();
    }

    /**
     * Setzt einen Stein an die gegebene Koordinate.
     *
     * @param koordinate Koordinate in "a1"-Notation.
     * @param farbe      Fabe des Spielsteins.
     */
    public void set(String koordinate, Color farbe) {
        Tupel t = parseCoordinates(koordinate);
        brett[t.x][t.y] = farbe;
    }

    /**
     * Wandelt textuelle Koordinaten in x- und y-Wert um.
     *
     * @param koordinate Koordinate als String.
     * @return Koordinate als Integer-Tupel.
     */
    private Tupel parseCoordinates(String koordinate) {
        char buchstabe = koordinate.toLowerCase().charAt(0);
        char zahl = koordinate.charAt(1);

        Tupel t = new Tupel();

        t.y = buchstabe - 'a';
        t.x = zahl - '1';

        if (t.x < 0 || t.x > 7) {
            throw new IllegalArgumentException();
        }

        if (t.y < 0 || t.y > 7) {
            throw new IllegalArgumentException();
        }

        return t;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        char y = '1';

        result.append(" ");
        for (char c : "abcdefgh".toCharArray()) {
            result.append(' ').append(c);
        }

        result.append("\n");

        for (Color[] figurs : brett) {

            result.append(y++);

            for (Color figur : figurs) {
                if (figur != null) {
                    result.append(' ').append(figur);
                }
                else {
                    result.append("  ");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }

    /**
     * Tupel von zwei int-Werten.
     */
    private static class Tupel {
        int x;

        int y;
    }
}

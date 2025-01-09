package pr2.io.filter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Filter-Reader, der den Inhalt in Großbuchstaben umwandelt.
 */
public class UCaseReader extends FilterReader {


    /**
     * Legt einen neuen Reader an.
     *
     * @param in Reader, von dem die Daten gelesen werden.
     */
    public UCaseReader(Reader in) {
        super(in);
    }

    /**
     * @see FilterReader#read(char[], int, int).
     */
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {

        int charsGelesen = super.read(cbuf, off, len);

        for (int i = 0; i < cbuf.length; i++) {
            cbuf[i] = Character.toUpperCase(cbuf[i]);
        }

        return charsGelesen;
    }
}

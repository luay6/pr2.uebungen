package pr2.io.rot13;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class Rot13Reader extends FilterReader {

    public Rot13Reader(Reader in) {
        super(in);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {

        int charsGelesen = super.read(cbuf, off, len);

        for (int i = off; i < charsGelesen; i++) {
            cbuf[i] = cbuf[i] == '\n' ? '\n' : (char) (cbuf[i] + 13);
        }

        return charsGelesen;
    }
}

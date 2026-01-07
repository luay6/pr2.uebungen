package pr2.io.rot13;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class Rot13Reader extends FilterReader{

    protected Rot13Reader(Reader in) {
        super(in);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int read() throws IOException {
        int result = super.read();
        if (result == -1) {
            return -1;
        }
        return result + 13;
    }
    
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int result = super.read(cbuf, off, len);
        for(int i = off; i < off + result; i++) {
            cbuf[i] += 13;
        }
        return result;
    }
}

package pr2.io.filter;


import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;


/**
 * Filter-Reader, der den Inhalt in Großbuchstaben umwandelt.
 */
public class UCaseReader extends FilterReader {

    public UCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int result = super.read();
        if (result == -1) {
            return -1;
        }
        return Character.toUpperCase(result);
        
    }
    
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int charNum = super.read(cbuf, off, len);
        for(int i = off; i < off + charNum; i++) {
            cbuf[i] = Character.toUpperCase(cbuf[i]);
        }
        return charNum;
    }
}



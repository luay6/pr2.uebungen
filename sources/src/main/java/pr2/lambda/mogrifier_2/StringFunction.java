package pr2.lambda.mogrifier_2;


public interface StringFunction {
    static StringFunction caesar(int shift) {
        return s -> {
            { 
                char[] c = s.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    c[i] = (char) (c[i] + shift);
                }
                return new String(c);
            }
        };
    }
    String apply(String s);
}

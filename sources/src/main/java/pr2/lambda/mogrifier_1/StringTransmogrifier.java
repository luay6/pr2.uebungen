package pr2.lambda.mogrifier_1;

public class StringTransmogrifier {

    public static String [] transmogrify (String[] strings, StringFunction sf) {
        String[] result = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            result[i] = sf.apply(strings[i]);
        }
        return result;
    }
}

package pr2.lambda.mogrifier_1;

public class StringTransmogrifier {

    public static String[] transmogrify(String[] elements, StringFunction t) {
        String[] result = new String[elements.length];

        for (int i = 0; i < elements.length; i++) {
            result[i] = t.apply(elements[i]);
        }

        return result;
    }
}

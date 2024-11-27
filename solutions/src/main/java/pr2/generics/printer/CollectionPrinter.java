package pr2.generics.printer;

import java.util.Collection;

public class CollectionPrinter {
    public static void print(Collection<?> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }
}

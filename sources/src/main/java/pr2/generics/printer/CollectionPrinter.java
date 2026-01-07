package pr2.generics.printer;

import java.util.Collection;

public class CollectionPrinter{
    public static void print(Collection<?> c) {
        for(Object t: c) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

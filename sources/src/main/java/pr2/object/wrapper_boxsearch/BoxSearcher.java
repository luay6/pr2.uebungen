package pr2.object.wrapper_boxsearch;

public class BoxSearcher {

    public static void main(String[] args) {
        Integer[] integers1 = new Integer[201];
        Integer[] integers2 = new Integer[201];
        for(int i = 0; i < integers1.length; i++) {
            integers1[i] = i;
            integers2[i] = i;
            boolean gleich = integers1[i] == integers2[i];
            System.out.println("" + integers1[i] + " == " + integers2[i] + " -> " + gleich);
        }
        
    }
}

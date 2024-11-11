package pr2.vererbung.vararg_summe;

public class Summator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int... as) {
        int sum = a + b + c;

        for (int i : as) {
            sum += i;
        }

        return sum;
    }
}

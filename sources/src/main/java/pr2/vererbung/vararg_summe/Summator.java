package pr2.vererbung.vararg_summe;

public class Summator {
    public int sum(int ... a) {
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }
}

package pr2.threads.synchronize;

public class Synchronizer {

    private int i = 0;

    public static void main(String[] args) {

    }

    public synchronized void addAndPrint() {
        System.out.println(i++);
    }
}

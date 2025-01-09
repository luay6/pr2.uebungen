package pr2.threads.synchronize;

public class Synchronizer {

    private int i = 0;

    public static void main(String[] args) {

        final Synchronizer s = new Synchronizer();

        Runnable runner = () -> {
            while (true) {
                s.addAndPrint();
            }
        };

        new Thread(runner).start();
        new Thread(runner).start();
    }

    public synchronized void addAndPrint() {
        System.out.println(i++);
    }
}

package pr2.threads.notifier;

public class Main {

    private static final int SLEEP_TIME = 200;

    public static void main(String[] args) {

        final Notifier notifier = new Notifier();

        Runnable putter = () -> {
            while (true) {
                notifier.setString(Thread.currentThread().getName());
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    return;
                }
            }
        };

        Runnable getter = () -> {
            while (true) {
                System.out.println(notifier.getString());

                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    return;
                }
            }
        };

        new Thread(putter, "Putter 1").start();
        new Thread(putter, "Putter 2").start();
        new Thread(getter, "Getter 1").start();
        new Thread(getter, "Getter 2").start();
        new Thread(getter, "Getter 3").start();
    }
}

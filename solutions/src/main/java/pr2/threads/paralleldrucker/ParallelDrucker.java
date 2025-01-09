package pr2.threads.paralleldrucker;

public class ParallelDrucker {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 1 speaking");
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 2 speaking");
            }
        });

        t1.start();
        t2.start();

        while (true) {
            System.out.println("Main Thread speaking");
        }
    }
}

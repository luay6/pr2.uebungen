package pr2.threads.interrupt;

public class ThreadsBeenden {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Paralleler Thread");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });

        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}

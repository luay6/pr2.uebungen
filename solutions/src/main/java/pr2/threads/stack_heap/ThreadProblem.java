package pr2.threads.stack_heap;

public class ThreadProblem {

    private int i = 0;

    public static void main(String[] args) {
        new ThreadProblem().go();
    }

    public void go() {
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();
    }

    private class Incrementer implements Runnable {

        private int j = 0;

        @Override
        public void run() {
            int k = 0;

            i++;
            j++;
            k++;

            System.out.printf("i=%d, j=%d, k=%d%n", i, j, k);
        }
    }
}

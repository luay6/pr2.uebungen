package pr2.threads.notifier;

public class Notifier {

    private String theString;

    public synchronized String getString() {
        while (theString == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null; // simply return
            }
        }

        String result = theString;
        theString = null;
        notifyAll();
        return result;
    }

    public synchronized void setString(String string) {
        while (theString != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                return; // simply return
            }
        }

        theString = string;
        notifyAll();
    }
}

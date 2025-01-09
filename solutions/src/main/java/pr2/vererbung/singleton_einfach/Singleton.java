package pr2.vererbung.singleton_einfach;

public final class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() { /* leer */ }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

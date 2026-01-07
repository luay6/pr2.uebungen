package pr2.vererbung.singleton_einfach;

public class Singleton {
    static final Singleton SINGLETON = new Singleton();
    
   private Singleton() {
       
   }
   
   public Singleton getSingleton() {
       return SINGLETON;
   }
}

package LLD_DesignPatterns.SingletonPattern;

public class Singleton {
    private static Singleton instance  = null;

    private Singleton(){}
   public static int count;
    public static Singleton getObject(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    count++;
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

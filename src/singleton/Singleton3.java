package singleton;

public class Singleton3 {
    private Singleton3(){};
    private static Singleton3 singleton3 = null;
    public static synchronized Singleton3 getSingleton3(){
        if (singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
    public static Singleton3 getInstance(){
        synchronized (Singleton3.class){
            if (singleton3 == null){
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}

package singleton;

/**
 * @Classname Singleton4
 * @Description TODO
 * @Date 2018/10/26 16:52
 * @Created by HP
 */
public class Singleton4 {
    //构造器私有化
    private Singleton4(){};
    private static Singleton4 singleton4 = null;
    public static Singleton4 getInstance(){
        if (singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}

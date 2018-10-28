package singleton;

/**
 * @Classname Singleton
 * @Description 单例模式之饿汉模式（立即加载）
 * @Date 2018/10/26 16:38
 * @Created by HP
 */
public class Singleton {
    //私有构造器
    private Singleton(){}
    private static Singleton singleton = new Singleton();
    //公有静态方法获得实例
    public static Singleton getInstance(){
        return singleton;
    }
}

package singleton;

/**
 * @Classname Singleton5
 * @Description 枚举内部类实现单例
 * @Date 2018/10/26 20:03
 * @Created by HP
 */
class Singleton5{}
public class  SingletonFactory{
    private enum EnumSingleton{
        enumSingleton;
        private  Singleton5 singleton5 = null;
        EnumSingleton(){
            singleton5 = new Singleton5();
        }
        public Singleton5 getInstance(){
            return singleton5;
        }
    }
    public static Singleton5 getInstance(){
        return EnumSingleton.enumSingleton.getInstance();
    }

    public static void main(String[] args) {
        Singleton5 singleton5 = getInstance();
        Singleton5 singleton6 = getInstance();
        System.out.println(singleton5 == singleton6);
    }
}

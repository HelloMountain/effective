package singleton;

public class Singleton2 {
    private static volatile Singleton2 singleton2 = null; //volatile防止代码重排
    private Singleton2(){}
    public static Singleton2 getSinleton2(){//双重校验锁，只有在第一步的时候采用同步机制，提高了性能
        if (singleton2 == null){
            synchronized(Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2(); //步骤1：为引用分配空间  步骤2：初始化对象  步骤三：引用指向分配的空间
                }                                   //代码重排：132   这样就会在线程一发生了代码重排， 线程二在23之间判断对象不为null，返回未初始化对象导致出错
            }
        }
        return singleton2;
    }

    @Override
    public String toString(){
        return "singleton2";
    }
    public static void main(String [] args){
        Singleton2 singleton2 = Singleton2.getSinleton2();
        Singleton2 singleton3 = Singleton2.singleton2;
        System.out.println(singleton3 == null);
        System.out.println(singleton2 == singleton3);
    }
}

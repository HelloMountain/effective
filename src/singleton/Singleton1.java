package singleton;
//线程安全，延迟加载
public class Singleton1 {
    private Singleton1(){}
    static class T {//静态内部类，在使用时才会被加载？？
        private static Singleton1 singleton1 = new Singleton1();
    }
    public static Singleton1 getSinleton1(){
        return T.singleton1;
    }
    @Override
    public String toString(){
        return "singleton";
    }

    public static void  main(String[] args){
        Singleton1 singleton1 = Singleton1.getSinleton1();
        System.out.println(singleton1.toString());

        Singleton1 singleton2 = Singleton1.getSinleton1();

        System.out.println(singleton1 == singleton2);
    }
}

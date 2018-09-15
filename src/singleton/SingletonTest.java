package singleton;

public class SingletonTest {
    private static volatile SingletonTest singletonTest ;
    private SingletonTest(){
        System.out.println("调用无参构造器");
    }
    private SingletonTest(int number){
        System.out.println("调用含参构造器 number:"+number);
    }

    public SingletonTest getInstance(){
        if(singletonTest == null) {
            synchronized (SingletonTest.class){
                if(singletonTest == null){
                    return new SingletonTest();
                }
            }
        }
        return singletonTest;
    }

    @Override
    public String toString(){
        return "SingletonTest";
    }
}

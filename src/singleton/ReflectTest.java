package singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;



public class ReflectTest {

    public static void main(String [] args)throws Exception{
        Class clazz = SingletonTest.class;

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        SingletonTest singletonTest = (SingletonTest)constructor.newInstance();

        System.out.println("调用无参构造器"+singletonTest);

        Constructor constructor1 = clazz.getDeclaredConstructor(new Class[]{int.class});
        constructor1.setAccessible(true);
        SingletonTest singletonTest1 = (SingletonTest)constructor1.newInstance(new Object[]{1});
        System.out.println("调用含参构造器：1"+singletonTest1);
    }
}

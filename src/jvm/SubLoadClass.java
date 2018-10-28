package jvm;

/**
 * @Classname SubLoadClass
 * @Description TODO
 * @Date 2018/10/14 15:12
 * @Created by HP
 */
public class SubLoadClass extends SuperLoadClass {
    static {
        System.out.println("SubLoadClass init");
    }
}

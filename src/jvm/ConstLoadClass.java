package jvm;

/**
 * @Classname ConstLoadClass
 * @Description TODO
 * @Date 2018/10/14 15:26
 * @Created by HP
 */
public class ConstLoadClass {
    static {
        System.out.println("constLoadclass init");
    }
    public static final String HELLOWORLD = "hello world";
}

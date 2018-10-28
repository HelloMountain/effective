package jvm;

/**
 * @Classname SuperLoadClass
 * @Description TODO
 * @Date 2018/10/14 15:10
 * @Created by HP
 */
public class SuperLoadClass {
    static {
        System.out.println("SuperClass load");
    }
    public static int value = 12;
}

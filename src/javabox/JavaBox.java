package javabox;

/**
 * @Classname javabox
 * @Description TODO
 * @Date 2018/10/10 15:54
 * @Created by HP
 */
public class JavaBox {
    Integer integer1 = new Integer(100);
    Integer integer2 = new Integer(100);
    Integer integer3 = new Integer(1000);
    Integer integer4 = new Integer(1000);

    Integer integer5 = 100;
    Integer integer6 = 100;
    Integer integer7 = 1000;
    Integer integer8 = 1000;

    public void isEqual(){
        System.out.println(integer1 == integer2);
        System.out.println(integer3 == integer4);
        System.out.println(integer5 == integer6);
        System.out.println(integer7 == integer8);
    }

    public static void main(String[] args) {
        JavaBox javaBox = new JavaBox();
        javaBox.isEqual();
    }
}

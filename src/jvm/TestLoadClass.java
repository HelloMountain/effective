package jvm;

/**
 * @Classname TestLoadClass
 * @Description TODO
 * @Date 2018/10/14 15:14
 * @Created by HP
 */
public class TestLoadClass {
    public static void main(String[] args) {
        //test1:对于静态字段，只有直接定义它的class才会被初始化，所以通过子类引用父类的静态变量，子类不会初始化
//        System.out.println(SubLoadClass.value);

        //test2:SuperLoadClass并未初始化。通过数组创建来引用类，不会触发类的初始化。
//        SuperLoadClass[] superLoadClasses = new SuperLoadClass[10];

        //test3:常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，所以不会触发初始化
        System.out.println(ConstLoadClass.HELLOWORLD);
    }
}

package jvm;

import java.util.List;

/**
 * @Classname GenericTypes
 * @Description 由于加入了不同的返回值，下面的类可以正常编译（但是idea聪明了识别除了泛型擦除后的签名相同），方法重载要求方法具备不同的签名，返回值并不包含在方法的签名之中，所以返回值不参与方法的重载，
 * 但是在Class文件的格式中，只要描述符不是完全一致的两个方法就能共存。
 * @Date 2018/10/15 16:59
 * @Created by HP
 */
public class GenericTypes2 {
//    public static String method(List<String> string){
//        System.out.println("List<string> string");
//        return "";
//    }

    public static int method(List<Integer> integers){
        System.out.println("List<Integer> integers");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("1");
    }
}

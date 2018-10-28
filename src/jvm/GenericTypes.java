package jvm;

import java.util.List;

/**
 * @Classname GenericTypes
 * @Description 两个方法有都用到了泛型，在编译的时候经过泛型擦出，变成原生类型List<E>，导致方法签名相同，对于运行期的Java语言来说，下面的两个方法就是同一个方法。无法通过编译
 * @Date 2018/10/15 16:59
 * @Created by HP
 */
public class GenericTypes {
    public static void method(List<String> string){
        System.out.println("List<string> string");
    }

//    public static void method(List<Integer> integers){
//        System.out.println("List<Integer> integers");
//    }
}

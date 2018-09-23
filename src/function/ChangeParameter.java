package function;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ChangeParameter
 * @Description TODO
 * @Date 2018/9/21 9:30
 * @Created by HP
 */
public class ChangeParameter {
    String str = "hello";

    public static void changeString(String str){
        str = "world";
    }

    public static void changeClass(ChangeParameter changeParameter){
        changeParameter.str = "workd";
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

//    public static void main(String[] args){
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list1.add(0);
//        list2.add(0);
//        func(list1, list2);
//    }
    void func(List<Integer> list1, List<Integer> list2){
        list1 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        list2 = new ArrayList<>();
        list1.add(2);
        list2.add(2);
    }
    public static void main(String[] args) {
//        ChangeParameter changeParameter = new ChangeParameter();
//        changeParameter.str = "hello";
//        String str = "hello";
//        changeString(str);
//        changeClass(changeParameter);
//        System.out.println(changeParameter.str);

        int a = 10;
        int b = 20;
        swap(10, 20);
        System.out.println("a:" + a + ";b:" + b);
    }
}

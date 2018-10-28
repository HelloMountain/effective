package offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Add
 * @Description 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 步骤一：temp ~：相加各位值，不算进位
 * 步骤二：计算进位
 * 步骤三：重复上述过程，直到进位 = 0
 * @Date 2018/10/24 15:43
 * @Created by HP
 */
public class Add {
    public static int add(int number, int number2){
        while (number2!=0){
            int temp = number^number2;
            number2 = (number&number2)<<1;
            number = temp;
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 300));
    }
}

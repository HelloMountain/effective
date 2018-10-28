package offer;

import java.util.Arrays;

/**
 * @Classname MoreThanHalfNum
 * @Description 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 * @Date 2018/10/19 16:11
 * @Created by HP
 */
public class MoreThanHalfNum {
    public int moreThanHalfNum(int[] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        Arrays.sort(array);
        int result = array[(array.length-1)/2];
        int count = 0;
        for (int temp:array
             ) {
            if (temp == result){
                count++;
            }
        }
        return count>array.length/2?result:0;
    }

    public static void main(String[] args) {
        int num = 3/2;
        System.out.println(num);
    }
}

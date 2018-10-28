package offer;


/**
 * @Classname ReOrderArray
 * @Description
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @Date 2018/10/16 10:40
 * @Created by HP
 */
public class ReOrderArray {
    public static void reOrderArray(int[] array){
        if (array == null || array.length == 0 || array.length == 1){
            return;
        }
        for (int i = 1; i<array.length; i++){
            if (!isEven(array[i])){
                int temp = i;
                int odd = array[i];
                while (temp>0&&isEven(array[temp-1])){
                    array[temp] = array[temp-1];
                    temp--;
                }
                array[temp] = odd;
            }
        }
    }
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void show(int[] array){
        for (int num:array) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] array = {2,4,6,1,3,5,7};
        reOrderArray(array);
        show(array);
    }
}

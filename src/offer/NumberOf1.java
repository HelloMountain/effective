package offer;

/**
 * @Classname NumberOf1
 * @Description 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @Date 2018/10/15 22:20
 * @Created by HP
 */
public class NumberOf1 {
    public int numberOf1(int n) {
        int result = 0;
        if (n < 0){
            result++;
            n = -n;
        }
        return process(n, result);
    }
    public int process(int n, int result){
        if (n == 0){
            return result;
        }
        if (n%2 == 1){
            result++;
        }
        return process(n>>1, result);
    }

    public int numberOf1_2(int n) {
        int result = 0;
        if (n < 0){
            result++;
            n = -n;
        }
        while (n != 0){
            if (n%2 == 1){
                result++;
            }
            n = n >> 1;
        }
        return result;
    }
    //正解，上面两个解法在n = -2147483648 = -10000000000000000000000000000000时错误
    public int numberOf1_3(int n) {
        int result = 0;
        while (n != 0){
            n = n & (n - 1);
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        NumberOf1 numberOf1 = new NumberOf1();
        System.out.println(numberOf1.numberOf1(8));
        System.out.println(numberOf1.numberOf1_2(8));
        System.out.println(numberOf1.numberOf1_3(8));
    }
}

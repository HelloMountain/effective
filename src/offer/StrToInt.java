package offer;

/**
 * @Classname StrToInt
 * @Description 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 * @Date 2018/10/24 16:42
 * @Created by HP
 */
public class StrToInt {
    public static int strToInt(String str) {
        if (str == null || str == ""){
            return 0;
        }
        char[] temp = str.toCharArray();
        int result = 0;
        int count = 0;
        if (str == ""){
            return 0;
        }
        for (int i = temp.length - 1; i > 0; i--) {
            int temp1 = (int) temp[i] - '0';
            if (temp1<0 || temp1>9){
                return 0;
            }
            result += temp1*(int) Math.pow(10, count);
            count++;
        }
        if (temp[0] == '-'){
            return -result;
        }else if (temp[0] == '+'){
            return result;
        }else {
            return result += ((int) temp[0] - '0')*(int) Math.pow(10, count);
        }
    }

    public static void main(String[] args) {
        System.out.println(strToInt(" "));
    }
}

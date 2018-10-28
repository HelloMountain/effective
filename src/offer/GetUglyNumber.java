package offer;

/**
 * @Classname GetUglyNumber
 * @Description 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，
 * 因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @Date 2018/10/22 16:41
 * @Created by HP
 */
public class GetUglyNumber {
    public static int getUglyNumber(int index) {
        if (index < 7) {
            return index;
        }
        int count = 1;
        int temp = 0, temp2 = 0, temp3 = 0, temp5 = 0;
        int[] result = new int[index];
        result[0] = 1;
        while (count < index) {
            temp = min(result[temp2]*2, result[temp3]*3, result[temp5]*5);
            if (temp == result[temp2]*2){
                temp2++;
            }
            if (temp == result[temp3]*3){
                temp3++;
            }
            if (temp == result[temp5]*5){
                temp5++;
            }
            result[count++] = temp;
        }
        return result[index-1];
    }
    public static int min(int num1, int num2, int num3){
        int min = num1<num2?num1:num2;
        return min<num3?min:num3;
    }

    public static void main(String[] args) {
        System.out.println(getUglyNumber(7));
    }
}

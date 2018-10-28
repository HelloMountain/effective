
/**
 * @Classname Main
 * @Description TODO
 * @Date 2018/9/25 19:23
 * @Created by HP
 */
public abstract class Main {
    public static int RectCover(int target) {
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        return RectCover(target - 1)+ RectCover(target - 2);
    }
    public static int NumberOf1(int n) {
        int result = 0;
        if (n < 0){
            result++;
            n = -n;
        }
        return process(n, result);
    }
    public static int process(int n, int result){
        if (n == 0){
            return result;
        }
        if (n>>1 == 1){
            return process(n>>1, result+1);
        }else{
            return process(n>>1, result);
        }
    }
    public static void main(String[] args){
        System.out.println(NumberOf1(10));
    }
}

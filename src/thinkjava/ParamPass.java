package thinkjava;

/**
 * @Classname ParamPass
 * @Description TODO
 * @Date 2018/10/15 19:16
 * @Created by HP
 */
public class ParamPass {
    static class Letter{
        char c;
        Letter(char c){
            this.c = c;
        }
    }
    public static void changeLetter(Letter letter){
        letter.c = 'z';
    }

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = num1;
    }
    public static void main(String[] args) {
        Letter letter = new Letter('a');
        System.out.println("before : " + letter.c);
        changeLetter(letter);
        System.out.println("after : " + letter.c);

        int num1 = 1, num2 = 10;
        System.out.println("before swap:num1:"+num1+",num2="+num2);
        swap(num1, num2);
        System.out.println("after swap:num1:"+num1+",num2="+num2);
    }
}

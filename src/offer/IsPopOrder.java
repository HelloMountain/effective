package offer;

import java.util.Stack;

/**
 * @Classname IsPopOrder
 * @Description 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个
 * 弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @Date 2018/10/19 15:24
 * @Created by HP
 */
public class IsPopOrder {
    public static boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        for (int i = 0; i<pushA.length; i++){
            stack.push(pushA[i]);
            while (popIndex<popA.length&&stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return  stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        System.out.println(isPopOrder(push, pop));
    }
}

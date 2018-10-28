package offer;

import java.util.Stack;

/**
 * @Classname StackToQueue
 * @Description TODO
 * @Date 2018/9/26 20:57
 * @Created by HP
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (!stack2.isEmpty()){
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        stack1.push(node);
    }

    public int pop() {
        if (!stack1.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            System.out.println("error");
            return 0;
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(2);
        stackToQueue.push(3);
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());
        stackToQueue.push(4);
        System.out.println(stackToQueue.pop());
        stackToQueue.push(5);
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());
    }
}

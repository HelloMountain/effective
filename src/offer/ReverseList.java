package offer;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

/**
 * @Classname ReverseList
 * @Description
 * 输入一个单链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @Date 2018/9/23 17:23
 * @Created by HP
 */
class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
public class ReverseList {
    //两个arraylist
    public static ArrayList<Integer> reverseList(ListNode head){
        if (head == null){
            return null;
        }
        ArrayList temp = new ArrayList<Integer>();
        while (head != null){
            temp.add(head.value);
            head = head.next;
        }
        ArrayList result = new ArrayList<Integer>();
        for (int i = temp.size()-1; i >= 0; i--) {
            result.add(temp.get(i));
        }
        return result;
    }

    //使用Java工具类
    public static ArrayList<Integer> reverseList2(ListNode head){
        if (head == null){
            return null;
        }
        ArrayList temp = new ArrayList<Integer>();
        while (head != null){
            temp.add(head.value);
            head = head.next;
        }
        Collections.reverse(temp);
        return temp;
    }

//    //反转链表
//    public static ArrayList<Integer> reverseList3(ListNode head){
//        if (head == null){
//            return null;
//        }
//        ArrayList temp = new ArrayList<Integer>();
//        if (head.next == null){
//            temp.add(head.value);
//            return temp;
//        }
//        //反转
//        while (head != null){
//            temp.add(head.value);
//            head = head.next;
//        }
//
//    }

//    private static ListNode reverse(ListNode head){
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode reservseHead = null;
//        ListNode current;
//        ListNode next;
//        current = head;
//        next = current.next;
//        current.next = reservseHead;
//        reservseHead = current;
//        current = next;
//
//    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        ArrayList<Integer> arrayList = reverseList2(head);
        for (int num:arrayList){
            System.out.println(num);

        }
    }
}

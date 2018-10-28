package offer;

import java.util.HashMap;

/**
 * @Classname FindFirstCommonNode
 * @Description 输入两个链表，找出它们的第一个公共结点。
 * @Date 2018/10/21 16:37
 * @Created by HP
 */
public class FindFirstCommonNode {
    public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode newHead1 = ReverseList2.reverseList2(pHead1);
        ListNode newHead2 = ReverseList2.reverseList2(pHead2);

        ListNode temp = null;
        while (newHead1 != null && newHead2 != null && newHead1.value == newHead2.value){
            temp = newHead1;
            newHead1 = newHead1.next;
            newHead2 = newHead2.next;
        }
        return temp;
    }
    //思路一：
    public static ListNode findFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        int length1 = 0;
        int length2 = 0;
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;

        while (temp1!=null){
            temp1 = temp1.next;
            length1++;
        }
        while (temp2!=null){
            temp2 = temp2.next;
            length2++;
        }

        if (length1>length2){
            while (length1>length2){
                pHead1 = pHead1.next;
                length1--;
            }
        }else {
            while (length2>length1){
                pHead2 = pHead2.next;
                length2--;
            }
        }
        while (pHead1!=null&&pHead2!=null&&pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    //思路二：
    public static ListNode findFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode, Integer> hashmap = new HashMap<ListNode, Integer>();
        ListNode result = null;
        while (pHead1!=null){
            hashmap.put(pHead1, pHead1.value);
            pHead1 = pHead1.next;
        }
        while (pHead2!=null){
            if (hashmap.containsKey(pHead2)){
                result = pHead2;
                return result;
            }
            pHead2 = pHead2.next;
        }
        return result;
    }
    //思路三
    public static ListNode findFirstCommonNode4(ListNode pHead1, ListNode pHead2) {
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while (temp1!=temp2){
            temp1 = temp1==null?pHead2:temp1.next;
            temp2 = temp2==null?pHead1:temp2.next;
        }
        return temp1;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
//        ListNode listNode8 = new ListNode(8);
//        ListNode listNode9 = new ListNode(9);
//
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode6;

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        listNode6.next = listNode7;
//        System.out.println(findFirstCommonNode(listNode1, listNode4).value);
        System.out.println(findFirstCommonNode2(listNode1, listNode4).value);
        System.out.println(findFirstCommonNode3(listNode1, listNode4).value);
        System.out.println(findFirstCommonNode4(listNode1, listNode4).value);
    }
}

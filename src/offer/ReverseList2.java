package offer;

/**
 * @Classname ReverseList2
 * @Description 输入一个链表，反转链表后，输出新链表的表头。
 * @Date 2018/10/17 15:25
 * @Created by HP
 */


public class ReverseList2 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode temp2 = head.next;
        temp.next = null;
        ListNode newHead = reverseList(temp2);
        ListNode temp3 = newHead;
        while (temp3.next != null){
            temp3 = temp3.next;
        }
        temp3.next = temp;
        return newHead;
    }
    public static ListNode reverseList2(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null, current = head, next = head.next;
        while (current.next != null){
            current.next = pre;
            pre = current;
            current = next;
            next = next.next;
        }
        current.next = pre;
        return current;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4= new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        head.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode reHead = reverseList2(head);
        while (reHead != null){
            System.out.println(reHead.value);
            reHead = reHead.next;
        }
    }
}

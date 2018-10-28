package offer;

/**
 * @Classname FindKthToTail
 * @Description 输入一个链表，输出该链表中倒数第k个结点。
 * @Date 2018/10/17 14:48
 * @Created by HP
 */
public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode first = head, second = head;
        int count = 0;
        while (first.next != null){
            first = first.next;
            count++;
            if (count>=k){
                second = second.next;
            }
        }
        if (count<k-1||k<=0){
            return null;
        }
        return second;
    }
}

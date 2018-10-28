package offer;

/**
 * @Classname MergeList
 * @Description 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @Date 2018/10/17 16:14
 * @Created by HP
 */
public class MergeList {
    public static ListNode mergeListNode(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode head, listNode;
        if (list1.value <= list2.value){
            listNode = new ListNode(list1.value);
            list1 = list1.next;
        }else {
            listNode = new ListNode(list2.value);
            list2 = list2.next;
        }
        head = listNode;
        ListNode temp;
        while (list1 != null && list2 != null){
            if (list1.value <= list2.value){
                temp = new ListNode(list1.value);
                list1 = list1.next;
            }else {
                temp = new ListNode(list2.value);
                list2 = list2.next;
            }
            listNode.next = temp;
            listNode = listNode.next;
        }
        if (list1 == null){
            listNode.next = list2;
        }
        if (list2 == null){
            listNode.next = list1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);

        listNode.next = listNode2;
        listNode2.next = listNode4;

        listNode1.next = listNode3;
        listNode3.next = listNode5;

        ListNode head = mergeListNode(listNode, listNode1);
        while (head!=null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}

package offer;

/**
 * @Classname RebuildTree
 * @Description
 *              输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结
 *              果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @Date 2018/9/23 23:32
 * @Created by HP
 */

class TreeNode {
    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int value) {
        this.value = value;
    }
}
public class RebuildTree {
    public static TreeNode reConstructBinaryTree(int[] pre, int preBegin, int preEnd, int[] in,
            int inBegin, int inEnd) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0 || preBegin > preEnd
                || inBegin > inEnd) {
            return null;
        }
        TreeNode head = new TreeNode(pre[preBegin]);
        int index;
        for (index = inBegin; index <= inEnd && in[index] != pre[preBegin]; index++) {}
        head.leftChild = reConstructBinaryTree(pre, preBegin + 1, preBegin + index - inBegin, in,
                inBegin, index - 1);
        head.rightChild = reConstructBinaryTree(pre, preBegin + index - inBegin + 1, preEnd, in,
                index + 1, inEnd);
        return head;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode head = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        while (head != null) {
            System.out.println(head.value);
            head = head.leftChild;
        }

    }
}

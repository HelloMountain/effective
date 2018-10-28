package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname PrintFromTopToBottom
 * @Description 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Date 2018/10/19 16:26
 * @Created by HP
 */
public class PrintFromTopToBottom {

    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.leftChild != null){
                queue.offer(temp.leftChild);
            }
            if (temp.rightChild != null){
                queue.offer(temp.rightChild);
            }
            result.add(temp.value);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(14);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(12);
        TreeNode treeNode7 = new TreeNode(16);

        treeNode1.leftChild = treeNode2;
        treeNode1.rightChild = treeNode3;

        treeNode2.leftChild = treeNode4;
        treeNode2.rightChild = treeNode5;

        treeNode3.leftChild = treeNode6;
        treeNode3.rightChild = treeNode7;

        ArrayList<Integer> result = printFromTopToBottom(treeNode1);
        for (int temp:result
             ) {
            System.out.println(temp);
        }
    }
}

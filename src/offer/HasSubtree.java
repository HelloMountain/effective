package offer;

/**
 * @Classname HasSubtree
 * @Description TODO
 * @Date 2018/10/22 16:09
 * @Created by HP
 */
public class HasSubtree {
//    public static boolean hasSubtree(TreeNode root1, TreeNode root2) {
//        if (root2 == null){
//            return false;
//        }
//        TreeNode temp1 = root1;
//        TreeNode temp2 = root2;
//        while (temp1!=null&&temp1.value!=temp2.value){
//            temp1 = temp1.leftChild;
//        }
//    }

    public static boolean equalTree(TreeNode root1, TreeNode root2){
        if (root1!=null&&root2!=null&&root1.value == root2.value){
            return equalTree(root1.leftChild, root2.leftChild)&&equalTree(root1.rightChild, root2.rightChild);
        }
        if (root1 == null&&root2 == null){
            return true;
        }
        return false;
    }
}

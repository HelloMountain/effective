package offer;

import java.util.Arrays;

/**
 * @Classname Offer1
 * @Description
 *              原题目描述：
 *              在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列
 *              都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * @Date 2018/9/23 12:11
 * @Created by HP
 */
public class Offer1 {
    public static boolean findInArray(int[][] array, int key) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] > key) {
                return false;
            } else {
                if (Arrays.binarySearch(array[i], key) >=0){
                    return true;
                }
//                if (binaryFind(i, array, key)) {
//                    return true;
//                }
            }
        }
        return false;
    }

    private static boolean binaryFind(int row, int[][] array, int key) {
        if (array[row].length == 0) {
            return false;
        }
        int begin = 0;
        int end = array[row].length - 1;
        int middle;
        while (begin <= end) {
            middle = (begin + end) / 2;
            if (array[row][middle] < key) {
                begin = middle + 1;
            } else if (array[row][middle] > key) {
                end = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {
                {2, 3, 6, 7, 9},
                {4, 8, 10, 12, 14},
                {7, 9, 10, 14, 17}
        };
//        System.out.println(Arrays.binarySearch(array[0], 1));
        // System.out.println(binaryFind(1, array, 11));
         System.out.println(findInArray(array, 4));
        // System.out.println(array[1][0]);
    }
}

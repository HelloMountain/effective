package search;

/**
 * @Classname TwoBinarySearch
 * @Description 注意begin，end ,middle变化，while退出条件判断
 * @Date 2018/9/17 10:35
 * @Created by HP
 */
public class TwoBinarySearch {
    public static int twoBinarySearch(int[] array, int key) {
        if (array == null || array.length == 0 || key < array[0] || key > array[array.length - 1]) {
            return -1;
        }
        int length = array.length;
        int begin = 0;
        int end = length - 1;
        int middle = (begin + end) / 2;
        while (begin <= end) {
            if (array[middle] < key) {
                begin = middle + 1;
            } else if (array[middle] > key) {
                end = middle - 1;
            } else {
                return middle;
            }
            middle = (begin + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9};
        System.out.println(twoBinarySearch(array, 9));
    }
}

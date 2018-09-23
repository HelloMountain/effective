package sort;

public class QuickSort {
    // public static int[] quickSort(int[] array) {
    // if (array == null) {
    // return null;
    // }
    // if (array.length == 0 | array.length == 1) {
    // return array;
    // }
    // processSort(array, 0, array.length - 1);
    // return array;
    // }
    //
    // public static void processSort(int[] array, int begin, int end) {
    // // 根据值划分
    // int middle = getMiddle(array, begin, end);
    // // 左右分别快排
    // processSort(array, begin, middle - 1);
    // processSort(array, middle + 1, end);
    // // 合并
    // }
    //
    // public static int getMiddle(int[] array, int begin, int end) {
    // if (begin == end) {
    // return begin;
    // }
    // int index = array[begin];
    // int left = begin;
    // int right = end;
    //
    // while (begin < end) {
    // while (begin < end && array[begin] <= index) {
    // begin++;
    // }
    // while (begin < end && array[end] > index) {
    // end--;
    // }
    // int temp = array[begin];
    // array[begin] = array[end];
    // array[end] = temp;
    // }
    // array[left] = array[begin - 1];
    // array[begin - 1] = index;
    // return begin - 1;
    // }
    //
    public static void show(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    // 快速排序入口
    public static void quickSort(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return;
        }
        sortPro(array, 0, array.length - 1);
    }

    // 快排过程
    public static void sortPro(int array[], int begin, int end) {
        if (array.length == 1) {
            return;
        }
        // 找到比较值，遍历数组，大于该比较值的放在数组右侧，小于该值的放在数组左侧
        // 最后对比较值的位置做调整，对左右侧数组递归，整合左右侧的结果。
        // 当左侧或右侧只剩最后一个数据
        // 的时候跳出递归。

        int index = array[begin];
        int left = begin;
        int right = end;
        while (left < right) {
            //
            while (array[left] <= index && left < right) {
                left++;
            }
            //
            while (array[right] > index && left < right) {
                right--;
            }
            //
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        // 调整
        array[begin] = array[left-1];
        array[left-1] = index;

        sortPro(array, begin, left-1);
        sortPro(array, left + 1, end);

    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 1, 7, 0, 5, 3};
        quickSort(array);
        show(array);
    }
}

package sort;

public class SelectSort {
    public static int[] selectSort(int[] array) {
        if (array == null | array.length == 0) {
            return null;
        }
        if (array.length == 1) {
            return array;
        }
        int temp;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    index = j;
                }
            }
            change(array, i, index);
//            array[i] = array[i] ^ array[index];
//            array[index] = array[i] ^ array[index];
//            array[i] = array[i] ^ array[index];
        }
        return array;
    }

    public static int[] change(int[] array, int i, int j){
        if (array == null){
            return null;
        }
        if (i < 0 | j < 0 | i >= array.length | j >= array.length){
            System.out.println("数组位置error");
            return null;
        }
        if (i == j){
           return array;
        }
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
        return array;
    }
    public static void show(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 2, 6, 8, 4, 2};
        change(array, 0, 0);
        show(array);
//        selectSort(array);
//        show(array);
    }
}

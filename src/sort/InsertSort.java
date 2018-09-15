package sort;

public class InsertSort {
    public static int[] insertSort(int[] array){
        if (array == null | array.length == 1){
            return null;
        }
        if (array.length == 1){
            return array;
        }
        int index;
        int temp;
        for (int i = 1; i < array.length; i++) {
            index = i;
            temp = array[i];
            for (int j = i-1; j >= 0&temp < array[j]; j--) {
                    array[j+1] = array[j];
                    index = j;
            }
            array[index] = temp;
        }
        return array;
    }

    public static void show(int[] array){
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 2, 6, 8, 4, 2 };
        insertSort(array);
        show(array);
    }
}

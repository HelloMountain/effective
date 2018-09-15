package sort;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0 | array.length == 1){
            return array;
        }
        int temp = 0;
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1]=array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void show(int[] array){
        if (array == null|array.length == 0){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array= { 5, 1, 8, 4, 1, 4, 7, 8, 53,2 };
        bubbleSort(array);
        show(array);
    }
}

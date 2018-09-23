package zuochengyun;

public class Code_04_QuickSort {
    public static void quickSort(int[] array){
        if (array == null){
            return;
        }
        if (array.length < 2){
            return;
        }
        //快排的主要部分
        sortProcess(array, 0, array.length - 1);
    }

    public static void sortProcess(int[] array, int begin, int end){
        if (begin < end){
            //递归发生的条件，必须是begin<end ,防止partition返回无效位置
            //将数组分成两部分 > = <   equla为返回相等部分的边界
            int[] equal = partiton(array, begin, end);
            sortProcess(array, begin, equal[0] - 1);
            sortProcess(array, equal[1] + 1, end);
        }
    }

    public static int[] partiton(int[] array, int begin, int end){
        //按最后一个数为判断标杆
        int less = begin - 1;
        int more = end;
        while (begin < more){
            if (array[begin] > array[end]){
                swap(array, begin, --more);
            }else if (array[begin] < array[end]){
                swap(array, begin++, ++less);
            }else{
                begin++;
            }
        }
        swap(array, more, end);
        int[] equal = {less + 1, more - 1};
        return equal;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        quickSort(array);
        show(array);
    }
}

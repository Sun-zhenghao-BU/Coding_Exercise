import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = new int[] {-1, -3, 4, 9, -18};
        int[] resArr = selectionSort(arr1);
        System.out.println(Arrays.toString(resArr));
    }

    public static int[] selectionSort(int[] array) {
        // corner case
        if (array == null || array.length == 0) {
            return array;
        }
        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// TC:O(n^2)
// SC:O(1)
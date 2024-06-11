import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{7, 2, 4, 9, 3, 1, 5};
        QuickSort solution = new QuickSort();
        int[] resArr = solution.quickSort(array);
        System.out.println(Arrays.toString(resArr));
    }

    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        // base case
        if (left >= right) {
            return;
        }
        // subProblem
        int pivotIndex = left + (int) (Math.random() * (right - left + 1));
        swap(array, pivotIndex, right);
        int i = left;
        int j = right - 1;
        while (i <= j) {
            if (array[i] <= array[right]) {
                i++;
            } else {
                swap(array, i, j);
                j--;
            }
        }
        swap(array, i, right);
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// TC: Worst case O(n^2), average case O(nlogn), best case: O(nlogn)
// SC: Worst case O(n), average case O(logn), best case:O(logn)
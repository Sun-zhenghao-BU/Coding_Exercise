import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 7, 4, 1, 3, 6, 8};
        MergeSort solution = new MergeSort();
        int[] resArr = solution.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(resArr));
    }

    public int[] mergeSort(int[] array, int left, int right) {
        // corner case
        if (array == null || array.length == 0) {
            return null;
        }
        // base case
        if (left == right) {
            return new int[]{array[left]};
        }
        // subProblem
        int mid = left + (right - left) / 2;
        int[] leftResult = mergeSort(array, left, mid);
        int[] rightResult = mergeSort(array, mid + 1, right);

        return mergeArray(leftResult, rightResult);
    }

    private int[] mergeArray(int[] leftResult, int[] rightResult) {
        int[] result = new int[leftResult.length + rightResult.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftResult.length && j < rightResult.length) {
            if (leftResult[i] <= rightResult[j]) {
                result[k] = leftResult[i];
                i++;
            } else {
                result[k] = rightResult[j];
                j++;
            }
            k++;
        }
        //postProcessing
        while (i < leftResult.length || j < rightResult.length ) {
            if (i < leftResult.length) {
                result[k] = leftResult[i];
                i++;
            } else {
                result[k] = rightResult[j];
                j++;
            }
            k++;
        }
        return result;
    }
}

// TC: O(n) + O(n) * logn = O(nlogn)
// SC: O(n)
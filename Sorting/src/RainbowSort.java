import java.util.Arrays;

public class RainbowSort {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 0, 1, 0 , -1 ,1, -1, -1, 0};
        RainbowSort solution = new RainbowSort();
        int[] resArr = solution.rainbowSort(array);
        System.out.println(Arrays.toString(resArr));
    }

    public int[] rainbowSort(int[] array) {
        // corner case
        if (array == null || array.length == 0) {
            return null;
        }
        int i = 0;
        int j = 0;
        int k = array.length - 1;
        while (j <= k) {
            if (array[j] == -1) {
                swap(array, i, j);
                i++;
                j++;
            } else if (array[j] == 0) {
                j++;
            } else {
                swap(array, j, k);
                k--;
            }
        }
        return array;
    }

    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

// TC: O(n)
// SC: O(1)

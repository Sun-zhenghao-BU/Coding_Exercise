import java.util.Arrays;

public class KthClosetInSortedArray {
    public static void main(String[] args) {
        KthClosetInSortedArray solution = new KthClosetInSortedArray();
        int[] array = new int[]{1};
        int target = 0;
        int k = 1;
        System.out.println(Arrays.toString(solution.kClosest(array, target, k)));
    }

    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }
        int[] res = new int[k];
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int i = left;
        int j = right;
        int ct = 0;

        while (ct < k) {
            if (i >= 0 && j < array.length) {
                if (Math.abs(array[i] - target) <= Math.abs(array[j] - target)) {
                    res[ct++] = array[i--];
                } else {
                    res[ct++] = array[j++];
                }
            } else if (i >= 0 && j >= array.length) {
                res[ct++] = array[i--];
            } else if (j < array.length && i < 0) {
                res[ct++] = array[j++];
            }
        }
        return res;
    }
}

// TC: O(logn + k)
// SC: O(k)
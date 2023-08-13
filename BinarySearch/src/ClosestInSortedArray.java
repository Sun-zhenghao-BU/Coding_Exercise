// Given a target integer T and an integer array A sorted in ascending order,
// Find the index i in A such that A[i] is closet to T.

//Assumptions: There can be duplicate elements in the array, and we can return any of the indices with same value

public class ClosestInSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6};
        int target = 5;
        int res = closestInSortedArray(array, target);
        System.out.println(res);
    }

    private static int closestInSortedArray(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        while(left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (array[right] - target >= target - array[left]) {
            return left;
        } else {
            return right;
        }
    }
}

// TC: O(logn)
// SC: O(1)
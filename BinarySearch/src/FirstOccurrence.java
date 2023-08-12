// Assumptions: There can be duplicate elements in the array

// Examples:
// A = {1, 2, 3}, T = 2, return 1
// A = {1, 2, 3}, T = 4, return -1
// A = {1, 2, 2, 2, 3}, T = 2, return 1

// Corner Cases: What if A is null or A of zero length? We should return -1 in this case


public class FirstOccurrence {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int res = firstOccurrence(array, target);
        System.out.println(res);
    }

    private static int firstOccurrence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

//        Terminate Condition: (left < right - 1 ---> 3 elements, after search ---> 2 elements left ---> break)
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

//        For the post-processing
//        Must handle left, the handle right.

        if (array[left] == target) {
            return left;
        } else if (array[right] == target) {
            return right;
        } else {
            return -1;
        }
    }
}

// TC: O(logn)
// SC: O(1)
public class SmallestElementLargerThanTarget {
    public static void main(String[] args) {
        SmallestElementLargerThanTarget soultion = new SmallestElementLargerThanTarget();
        int[] array = new int[]{3, 4, 6, 8, 9, 12};
        int target = 8;
        System.out.println(soultion.smallestElementLargerThanTarget(array, target));
    }

    public int smallestElementLargerThanTarget(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (array[left] > target) {
            return left;
        } else if (array[right] > target) {
            return right;
        } else {
            return -1;
        }
    }
}

// TC: O(logn)
// SC: O(1)
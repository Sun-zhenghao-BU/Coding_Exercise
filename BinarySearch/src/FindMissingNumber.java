public class FindMissingNumber {
    public static void main(String[] args) {
        FindMissingNumber solution = new FindMissingNumber();
        int[] array = new int[]{1,3,4,5,6};
        System.out.println(solution.missing(array));
    }

    public int missing(int[] array) {
        if (array.length == 0) {
            return 1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] - mid < 2) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (array[left] - left == 2) {
            return left + 1;
        } else if (array[right] - right == 2) {
            return right + 1;
        } else {
            return array.length + 1;
        }
    }
}

// TC: O(logn)
// SC: O(1)
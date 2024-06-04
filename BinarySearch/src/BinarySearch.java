public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 9, 13, 17, 23};
        int target = 23;
        int res = binarySearch(array, target);
        System.out.println(res);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
//            In case that right + left too much big and cause overflow of MAX_VALUE
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

// TC: O(logn)
// SC: O(1) (Stack + Heap)
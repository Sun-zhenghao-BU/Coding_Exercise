// Given a 2D matrix that contains integers only, which each row is sorted in ascending order. The first element of next row is
// larger than the last element of previous row. Given a target number, returning the position that the target locates within the matrix.
// If the target number does not exist in the matrix, return{-1, -1}

// Assumptions: The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0
// N rows, M Columns

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1}, {2}, {3}, {4}};
        int target = 0;
        int[] res1 = sortedMatrix1(matrix, target);
        int[] res2 = sortedMatrix2(matrix, target);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }


//    Method 1
//    1. Search the largest smaller value then target
//    2. Search target value in this row
//    3. Binary Search
//    4. log(n) --> search in first col, log(m), search in this row
//    5. TC:log(n) + log(m) --> log(m * n)

    private static int[] sortedMatrix1(int[][] matrix, int target) {
//        if (matrix.length != 0) matrix[0] must not be null, so the condition can be changed as
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int resRow = -1;
        int resCol = -1;
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] <= target && matrix[i][col - 1] >= target) {
                int[] arr = matrix[i];
                resCol = binarySearch(arr, target);
                if (resCol != -1) {
                    resRow = i;
                }
                break;
            }
        }
        return new int[]{resRow, resCol};
    }

    private static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    //    Method 2
    //    mapping the matrix to 1D array and Binary Search
    private static int[] sortedMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int curRow = mid / col;
            int curCol = mid % col;
            if (matrix[curRow][curCol] == target) {
                return new int[]{curRow, curCol};
            } else if (matrix[curRow][curCol] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
//    TC: O(log(m * n))
//    SC: O(1)
}

public class FindKthElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        int target = 4;
        int res = findKthElementInSortedMatrix(matrix, target);
        System.out.println(res);
    }

    private static int findKthElementInSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length ==0 ) {
            return -1;
        }
        int cols = matrix[0].length;
        return matrix[target / cols][target % cols];
    }
}

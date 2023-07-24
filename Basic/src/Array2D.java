import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        System.out.println("Rows: " + matrix1.length);
        System.out.println("Columns: " + matrix1[0].length);
        setElement(matrix1,1 ,2, 10);
        System.out.println(Arrays.deepToString(matrix1));

        int m = 4, n = 6;
        int[][] matrix2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = i * 10 + j;
            }
        }
        System.out.println(Arrays.deepToString(matrix2));

        int[][] matrix3 = new int[][]{{3, 2, 1}, {3, 4, 4}, {2, 3, 4}};
        int[][] matrix4 = {{1, 2, 3}, {2, 3, 4}};
        int[][] matrix5 = {{1, 7, 3}, {5, 9, 6}};


        int res = sumDiagonal(matrix3);
        System.out.println(res);

        int[][] resMat = addTwoMatrix(matrix4, matrix5);
        System.out.println(Arrays.deepToString(resMat));
    }

    private static void setElement(int[][] matrix, int row, int col, int num) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        matrix[row][col] = num;
    }

    private static int sumDiagonal(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return -1;
        }
        if (mat.length != mat[0].length) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        return sum;
    }

    private static int[][] addTwoMatrix(int[][] mat1, int[][] mat2) {
//        corner case: Ensure these two matrix has the same size. Both of them are not null
        if (mat1 == null || mat2 == null) {
            return null;
        }
        if (mat1.length == 0) {
            return mat2;
        }
        if (mat2.length == 0) {
            return mat1;
        }
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            return null;
        } else {
            int rows = mat1.length;
            int cols = mat1[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat1[i][j] += mat2[i][j];
                }
            }
        }
        return mat1;
    }
}

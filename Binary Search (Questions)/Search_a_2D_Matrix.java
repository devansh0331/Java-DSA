public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 3;
        System.out.println(searchMatrixBROOTFORCE(matrix, target));
    }

    public static boolean searchMatrixBROOTFORCE(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }

            }

        }

        return false;

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }

            else if (matrix[row][col] > target) {
                col--;

            } else {
                row++;
            }

        }

        return false;

    }

}

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };

        int[][] mat2 = { { 5 } };
        System.out.println(diagonalSum(mat2));
    }

    static int diagonalSum(int[][] mat) {

        int priSum = 0;
        int secSum = 0;

        for (int i = 0; i < mat.length; i++) {

            priSum += mat[i][i];

        }
        for (int i = mat.length - 1; i >= 0; i--) {

            secSum += mat[i][mat.length - 1 - i];

        }

        if (mat.length % 2 != 0) {
            secSum = secSum - mat[mat.length / 2][mat.length / 2];

        }

        return priSum + secSum;
    }

}

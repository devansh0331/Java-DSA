import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 4, -1 },
                { -10, 5, 11 },
                { 18, -7, 6 }
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(i));

        }
    }

    static int[][] transpose(int[][] matrix) {

        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                ans[j][i] = matrix[i][j];

            }

        }

        return ans;

    }
}

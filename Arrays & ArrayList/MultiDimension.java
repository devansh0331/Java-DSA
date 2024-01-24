import java.util.Arrays;
import java.util.Scanner;

/**
 * MultiDimension
 */
public class MultiDimension {

    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        // int[][] arr = new int[3][];
        // int[][] arr2d = {
        // { 1, 2, 3 },
        // { 4, 5 },
        // { 6, 7, 8, 9 }
        // };
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][3];

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = sc.nextInt();
            }

        }
        // for (int row = 0; row < arr2d.length; row++) {
        // for (int col = 0; col < arr2d[row].length; col++) {
        // System.out.print(arr2d[row][col] + " ");
        // }
        // System.out.println();

        // }

        // Output

        // for (int row = 0; row < arr2d.length; row++) {
        // System.out.println(Arrays.toString(arr2d[row]));

        // }

        for (int[] is : arr2d) {
            System.out.println(Arrays.toString(is));
        }

        sc.close();
    }
}
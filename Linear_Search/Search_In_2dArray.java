package Linear_Search;

import java.util.Arrays;

public class Search_In_2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 39, 54, 86 },
                { 18, 12 }
        };
        int target = 86;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };

                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = arr[0][0];

        // METHOD-1

        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // if (arr[row][col] > max)
        // max = arr[row][col];

        // }
        // }

        // METHOD-2

        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }

            }

        }
        return max;
    }
}

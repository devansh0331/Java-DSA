package Patterns;
//     *

//    ***
//   *****
//  *******
// *********

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCols = 2 * row - 1;
            int totalSpaces = n - row;

            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print("  ");

            }

            for (int col = row; col >= 1; col--) {
                System.out.print("* ");

            }

            for (int col = 1; col <= totalCols - row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

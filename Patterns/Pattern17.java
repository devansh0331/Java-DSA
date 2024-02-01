package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalColsInRow;

            for (int spaces = 1; spaces <= n - totalColsInRow; spaces++) {
                System.out.print("  ");

            }

            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");

            }

            System.out.println();

        }
    }

}

package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            // int totalSpaces = row > n ? row - n : n - row;
            int totalSpaces = n - totalColsInRow;

            for (int spaces = 0; spaces < totalSpaces; spaces++) {
                System.out.print(" ");

            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

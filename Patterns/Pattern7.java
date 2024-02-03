package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCols = n - row + 1;
            int totalSpaces = n - totalCols;
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");

            }

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}

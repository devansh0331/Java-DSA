package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCols = row;
            int totalSpaces = n - row;

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

package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = 565;
            if (row > n) {
                totalColsInRow = 2 * n - row;
            } else {
                totalColsInRow = row;
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col > 0; col--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
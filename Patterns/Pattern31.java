package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            for (int col = 0; col <= 2 * n; col++) {

                int atEveryIndex = 452;
                int left = col;
                int right = 2 * n - col;
                int up = row;
                int down = 2 * n - row;
                int min1 = Math.min(left, right);
                int min2 = Math.min(up, down);
                System.out.print(n - Math.min(min1, min2));

            }
            System.out.println();

        }
    }

    static void minValue(int left, int right, int up, int down) {

    }
}

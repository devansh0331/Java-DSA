public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        // int[][] grid = {
        // { 4, 3, 2, -1 },
        // { 3, 2, 1, -1 },
        // { 1, 1, -1, -2 },
        // { -1, -1, -2, -3 }
        // };
        int[][] grid = {
                { 3, 2 },
                { 0, 1 },
        };

        System.out.println(countNegatives(grid));
    }

    public static int countNegativesBROOTFORCE(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }

        }
        return count;

    }

    public static int countNegatives(int[][] grid) {
        int count = 0;

        int row = 0;
        int col = grid[0].length - 1;

        while (row < grid.length && col >= 0) {

            if (grid[row][col] < 0) {

                count += grid.length - row;
                col--;
            }

            else {
                row++;
            }

        }

        return count;
    }
}

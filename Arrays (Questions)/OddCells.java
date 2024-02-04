public class OddCells {
    public static void main(String[] args) {
        int[][] indices = {
                { 1, 1 },
                { 0, 0 }
        };
        int m = 2;
        int n = 2;
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[r][j]++;

            }

            for (int j = 0; j < m; j++) {
                matrix[j][c]++;

            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    ans++;
                }

            }

        }
        return ans;
    }
}

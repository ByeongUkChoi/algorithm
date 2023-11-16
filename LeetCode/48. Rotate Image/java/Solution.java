class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int max = n - 1;
        int val;
        int tmp;
        for (int y = 0; y <= n / 2; y++) {
            for (int x = y; x < n - y - 1; x++) {
                val = matrix[x][y];
                tmp = matrix[y][max - x];
                matrix[y][max - x] = val;

                val = tmp;
                tmp = matrix[max - x][max - y];
                matrix[max - x][max - y] = val;

                val = tmp;
                tmp = matrix[max - y][x];
                matrix[max - y][x] = val;

                val = tmp;
                matrix[x][y] = val;
            }
        }
    }
}
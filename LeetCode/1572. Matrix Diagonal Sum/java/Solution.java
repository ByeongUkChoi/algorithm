class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        int length = mat.length;

        for (int i = 0; i < length; i++) {
            if (length % 2 == 1 && i == length / 2) {
                answer += mat[i][i];
            } else {
                answer += mat[i][i] + mat[i][length - 1 - i];
            }
        }
        return answer;
    }
}
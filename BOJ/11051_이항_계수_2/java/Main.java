import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = solution(n, k);

        System.out.println(result);
    }

    /**
     * 이항 계수
     *  n
     *  k
     *  구하기
     * @param n
     * @param k
     * @return
     */
    public static int solution(int n, int k) {
        /**
         * dp[n][k] : 이항 계수 n k의 값
         *
         * n\k | 0 | 1 | - | - | - | - |
         *   0 | 1 | - | - | - | - | - |
         *   1 | 1 | 1 | - | - | - | - |
         *   2 | 1 | 2 | 1 | - | - | - |
         *   3 | 1 | 3 | 3 | 1 | - | - |
         *   4 | 1 | 4 | 6 | 4 | 1 | - |
         *   5 | 1 | 5 | 10| 10| 5 | l |
         *
         *   dp[i][0] = 1
         *   dp[i][1] = i (i > 0)
         *   dp[i][j] = dp[i-1][j] + dp[i-1][j-1]
         */
        int[][] dp = new int[n+1][k+1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= k; i++) {
            dp[i][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                dp[i][j] %= 10007;
            }
        }

        return dp[n][k];
    }
}


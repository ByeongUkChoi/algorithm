import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result = solution(n, k);
        System.out.println(result);
    }
    public static long solution(int n, int k) {
        int[][] dp = new int[n+1][k+1];

        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }
        for (int j = 1; j <= k; j++) {
            dp[1][j] = j;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1_000_000_000;
            }
        }

        return dp[n][k];
    }
}


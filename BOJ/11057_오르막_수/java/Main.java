import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 10007;

        /**
         * dp[n][l] : n번째 자리의 수가 l인 경우의 수
         */
        int[][] dp = new int[n][10];
        // 한 자리의 경우 각 수는 1가지의 경우의 수를 가짐
        for (int i = 0; i <= 9; i++) {
            dp[0][i] = 1;
        }

        // 두자리 이상의 경우. 현재 자리의 수(dp[i][j])가 앞 자리의 수(dp[i-1][k], 단 k <= j)의 합
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= mod;
                }
            }
        }

        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result += dp[n-1][i];
            result %= mod;
        }

        System.out.println(result);
    }
}

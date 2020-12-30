import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        // dp[n] : n원을 만드는 경우의 수
        int[] dp = new int[k+1];
        dp[0] = 1;

        // 동전 개수 만큼 반복
        for (int i = 0; i < n; i++) {
            int coin = coins[i];    // 동전
            // 해당 동전 금액부터 반복
            for (int j = coin; j <= k; j++) {
                dp[j] += dp[j - coin];
            }
        }

        System.out.println(dp[k]);
    }
}


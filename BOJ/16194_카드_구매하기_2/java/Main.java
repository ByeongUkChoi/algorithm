import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] p = new int[n+1];
        for (int i = 1; i <= n; i++) {
            p[i] = scanner.nextInt();
        }

        // dp[n]은 n장 카드 구매시 최소 비용
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            // 초기값
            dp[i] = p[i];
            for (int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j] + dp[j]);
            }
        }

        System.out.println(dp[n]);
    }
}


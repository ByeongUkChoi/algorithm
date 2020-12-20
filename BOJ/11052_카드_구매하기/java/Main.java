import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n+1];
        p[0] = 0;

        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            p[i+1] = Integer.parseInt(s[i]);
        }

        // dp[n] : 카드 n장 구매 시 최대 비용
        int[] dp = new int[n+1];
        dp[0] = 0;

        /**
         * dp[0] = p[0] = 0
         * dp[1] = p[1]     // 카드 한 장 구매 (최대)가격
         * dp[2] = max(p[2], dp[1] + dp[1])
         * dp[3] = max(p[3], dp[2] + dp[1])
         * dp[4] = max(p[4], dp[3] + dp[1], dp[2] + dp[2])
         * dp[4] = max(p[5], dp[4] + dp[1], dp[3] + dp[2])
         * ...
         * dp[n] = max(p[n], dp[n-1] + dp[1],,,dp[0] + dp[n])       // n : 카드 개수
         */
        for (int i = 1; i <= n; i++) {
            // 초기 값
            dp[i] = p[i];
            // dp[n-1] + p[1],,,dp[0] + p[n] 중 최대값 찾기
            for (int j = i - 1; j >= i / 2; j--) {
                dp[i] = Math.max(dp[j] + dp[i - j], dp[i]);
            }
        }

        System.out.println(Arrays.toString(dp));
    }
}


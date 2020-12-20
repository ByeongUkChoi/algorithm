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
         * dp[2] = max(dp[1] + p[1], dp[0])
         * dp[3] = max(dp[2] + p[1], dp[1] + p[2], dp[0] + p[3])
         * ...
         * dp[n] = max(dp[n-1] + p[1],,,dp[0] + p[n])       // n : 카드 개수
         */
        for (int i = 1; i <= n; i++) {
            // dp[n-1] + p[1],,,dp[0] + p[n] 중 최대값 찾기
            for (int j = i - 1; j >= 0; j--) {
                dp[i] = Math.max(dp[j] + p[i - j], dp[i]);
            }
        }
        
        System.out.println(dp[n]);
    }
}


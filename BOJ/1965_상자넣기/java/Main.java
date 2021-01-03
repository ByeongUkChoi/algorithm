import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        // dp[n] : n번째 인덱스까지의 증가 부분 수열 길이
        int[] dp = new int[n];
        int result = 0; // max dp 값

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (result < dp[i]) {
                result = dp[i];
            }
        }

        System.out.println(result);
    }
}


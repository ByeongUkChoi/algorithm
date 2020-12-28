import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        // dp[n] : n번째 인덱스까지의 증가 부분 수열의 합
        int[] dp = new int[n];
        int result = 0;     // 최대 dp 값
        for (int i = 0; i < n; i++) {
            dp[i] = sequence[i];    // 초기값 (i인덱스의 값이 0~(i-1)인덱스의 값보다 작은 경우)(가장 큰 증가 부분 수열이 자기 자신인 경우)
            for (int j = 0; j < i; j++) {
                if(sequence[j] < sequence[i]) {
                    dp[i] = Math.max(sequence[i] + dp[j], dp[i]);
                }
            }
            // 최대 dp값 구하기
            if(result < dp[i]) {
                result = dp[i];
            }
        }

        System.out.println(result);
    }
}


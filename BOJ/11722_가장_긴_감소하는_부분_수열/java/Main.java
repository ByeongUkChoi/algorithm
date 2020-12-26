import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int[] dp = new int[n];

        int result = 0; // dp중 가장 큰 값을 찾아 출력하기 위함
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;  // 초기값 자기자신
            // 현재 인덱스의 앞 부분 중에서 수가 현재 수 보다 큰 값들 중 dp가 큰 값을 찾아 +1 하여 현재 인덱스 dp값 구함
            for (int j = 0; j < i; j++) {
                if(sequence[j] > sequence[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // dp 값중 큰 값 찾기
            if (result < dp[i]) {
                result = dp[i];
            }
        }

        System.out.println(result);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 소비되는 체력
        int[] L = new int[N+1];
        // 기쁨
        int[] J = new int[N+1];

        String[] strL = br.readLine().split(" ");
        String[] strJ = br.readLine().split(" ");

        L[0] = 0;
        J[0] = 0;
        for (int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(strL[i-1]);
            J[i] = Integer.parseInt(strJ[i-1]);
        }

        // dp[i][hp] : i번째 까지 갔을때 남은 체력이 hp일 때 기쁨의 합
        int[][] dp = new int[N+1][100+1];
        // L 소비되는 체력, J 기쁨
        for (int i = 1; i <= N; i++) {
            // hp 남아있는 체력
            for (int hp = 1; hp < 100; hp++) {
                // 인사를 안할 경우
                // 전 단계 그대로 가져옴
                dp[i][hp] = dp[i - 1][hp];

                // 인사를 할 경우

                // 남아있는 체력이 사용할 체력보다 적은 경우 pass
                if(hp < L[i]) {
                    continue;
                }
                // 인사를 하는 경우가
                if(dp[i - 1][hp - L[i]] + J[i] > dp[i][hp]) {
                    dp[i][hp] = dp[i - 1][hp - L[i]] + J[i];
                }
            }
        }

        System.out.println(dp[N][99]);
    }
}


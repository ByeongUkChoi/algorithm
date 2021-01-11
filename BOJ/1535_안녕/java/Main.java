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

        // dp[i][hp] : i번째 까지 갔을때 남은 체력이 hp일 때 최대 기쁨의 합
        int[][] dp = new int[N+1][100+1];
        // L 소비되는 체력, J 기쁨
        for (int i = 1; i <= N; i++) {
            // hp 남아있는 체력 or 사용 할 체력
            // hp를 가지고 최대 기쁨을 구한다.
            for (int hp = 1; hp < 100; hp++) {
                // 전 단계 그대로 가져옴
                dp[i][hp] = dp[i - 1][hp];

                // 남아있는 체력이 사용할 체력보다 적은 경우 pass
                if(hp < L[i]) {
                    continue;
                }
                // 남아있는 체력 hp로 할 수 있는 최대 기쁨을 구함
                // 현재 악수를 했을 때 현재 사람의 기쁨 + 전 단계의 최대 기쁨(현재 악수를 했으니 그 만큼의 체력을 제외한 전 단계의 최대 기대 기쁨)이 아무것도 하지 않은 것(체력을 이번 사람과 악수하는 데 사용하지 않음) 보다 큰 경우 악수를 함
                if(dp[i - 1][hp - L[i]] + J[i] > dp[i][hp]) {
                    dp[i][hp] = dp[i - 1][hp - L[i]] + J[i];
                }
            }
        }

        System.out.println(dp[N][99]);
    }
}


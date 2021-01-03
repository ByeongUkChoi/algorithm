import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 0) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 3;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1]*2 + dp[i-2]) % 9901;
        }

        System.out.println(dp[n]);
    }
}


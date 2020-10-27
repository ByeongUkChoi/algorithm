
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] rgb = new int[n + 1][3];
        int[][] dp = new int[n + 1][3];

        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            String[] s = scanner.nextLine().split(" ");
            rgb[i][0] = Integer.parseInt(s[0]);
            rgb[i][1] = Integer.parseInt(s[1]);
            rgb[i][2] = Integer.parseInt(s[2]);
        }

        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + rgb[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + rgb[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + rgb[i][2];
        }

        int result = Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]);
        System.out.println(result);
    }
}


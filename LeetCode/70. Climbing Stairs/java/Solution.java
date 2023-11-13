class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int[] dp = new int[n];
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 2] + dp[n - 1];
    }
}

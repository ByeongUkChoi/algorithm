class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = IntArray(cost.size + 1)
        dp[0] = cost[0]
        dp[1] = cost[1]
        for (i in 2 until cost.size) {
            dp[i] = cost[i] + min(dp[i - 1], dp[i - 2])
        }
        return Math.min(dp[cost.size - 1], dp[cost.size - 2])
    }
}
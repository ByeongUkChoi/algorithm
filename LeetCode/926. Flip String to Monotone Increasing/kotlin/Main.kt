class Solution {
    fun minFlipsMonoIncr(s: String): Int {
        val n = s.length
        val dp = IntArray(n + 1)
        for (i in 1..n) {
            dp[i] = dp[i - 1] + if (s[i - 1] == '1') 1 else 0
        }
        var result = dp[n]
        for (i in 0..n) {
            result = Math.min(result, dp[i] + n - i - (dp[n] - dp[i]))
        }
        return result
    }
}
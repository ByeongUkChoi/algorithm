import java.lang.Integer.max
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val nums = IntArray(n)
    for (i in 0 until n) {
        nums[i] = scanner.nextInt()
    }

    if (n < 3) {
        println(nums.sum())
        return;
    }

    val dp = IntArray(n)
    dp[0] = nums[0]
    dp[1] = nums[0] + nums[1]
    dp[2] = max(nums[0] + nums[2], nums[1] + nums[2])
    dp[2] = max(dp[1], dp[2])
    for (i in 3 until n) {
        dp[i] = max(dp[i - 3] + nums[i - 1] + nums[i], dp[i - 2] + nums[i])
        dp[i] = max(dp[i - 1], dp[i])
    }

    println(dp[n - 1])
}


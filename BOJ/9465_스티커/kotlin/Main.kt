import java.util.*
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    val answer = IntArray(t)
    for (i in 0 until t) {
        val n = scanner.nextInt()
        val nums = Array(2) { IntArray(n) }
        for (j in 0 until n) {
            nums[0][j] = scanner.nextInt()
        }
        for (j in 0 until n) {
            nums[1][j] = scanner.nextInt()
        }
        answer[i] = solve(n, nums)
    }

    for (i in 0 until t) {
        println(answer[i])
    }
}

fun solve(n: Int, nums: Array<IntArray>): Int {
    if (n == 1) {
        return max(nums[0][0], nums[1][0])
    } else if (n == 2) {
        return max(nums[0][0] + nums[1][1], nums[1][0] + nums[0][1])
    }
    
    val dp = Array(2) { IntArray(n) }
    dp[0][0] = nums[0][0]
    dp[1][0] = nums[1][0]
    dp[0][1] = dp[1][0] + nums[0][1]
    dp[1][1] = dp[0][0] + nums[1][1]

    for (i in 2 until n) {
        dp[0][i] = max(dp[1][i - 2], dp[1][i - 1]) + nums[0][i]
        dp[1][i] = max(dp[0][i - 2], dp[0][i - 1]) + nums[1][i]
    }

    return max(dp[0][n - 1], dp[1][n - 1])
}


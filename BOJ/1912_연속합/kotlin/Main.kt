import java.lang.Integer.max
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val nums = IntArray(n)

    for (i in 0 until n) {
        nums[i] = scanner.nextInt()
    }

    val dp = IntArray(n)

    dp[0] = nums[0]
    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + nums[i], nums[i])
    }

    println(dp.maxOrNull())
}


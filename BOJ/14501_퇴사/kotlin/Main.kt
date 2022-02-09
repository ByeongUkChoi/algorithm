import java.util.*
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val t = IntArray(n)
    val p = IntArray(n)

    for (i in 0 until n) {
        t[i] = scanner.nextInt()
        p[i] = scanner.nextInt()
    }

    val dp = IntArray(n + 1)
    for (i in 0 until n) {
        if (i + t[i] <= n) {
            dp[i + t[i]] = max(dp[i + t[i]], dp[i] + p[i])
        }

        dp[i + 1] = max(dp[i + 1], dp[i])
    }

    println(dp[n])
}


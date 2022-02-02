import java.util.*
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val stairs = IntArray(n + 1)
    for (i in 1..n) {
        stairs[i] = scanner.nextInt()
    }

    if (n < 3) {
        println(stairs.sum())
        return
    }

    val dp = IntArray(n + 1)
    dp[1] = stairs[1]
    dp[2] = stairs[1] + stairs[2]

    for (i in 3..n) {
        dp[i] = max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i]
    }

    println(dp[n])
}


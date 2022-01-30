import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val answer = solve(n)
    println(answer)
}

fun solve(n: Int): Int {
    val dp = IntArray(n + 1)
    dp[0] = 0
    dp[1] = 0

    for (i: Int in 2..n) {
        dp[i] = dp[i - 1] + 1
        if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
            dp[i] = dp[i / 3] + 1
        }
        if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
            dp[i] = dp[i / 2] + 1
        }
    }
    return dp[n]
}


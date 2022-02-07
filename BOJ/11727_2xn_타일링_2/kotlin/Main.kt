package boj.no_11727

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val dp = IntArray(n + 1)

    if (n == 1) {
        println(1)
        return
    } else if (n == 2) {
        println(3)
        return
    }

    dp[1] = 1
    dp[2] = 3
    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007
    }

    println(dp[n])
}


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val dp = IntArray(n + 1)

    if (n < 3) {
        println(n)
        return
    }

    dp[1] = 1
    dp[2] = 2
    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
    }

    println(dp[n])
}


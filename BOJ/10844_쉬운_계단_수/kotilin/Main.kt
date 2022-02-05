import java.util.*

const val mod = 1_000_000_000

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val dp = Array(n) { LongArray(10) }
    dp[0][0] = 0
    dp[0][1] = 1
    dp[0][2] = 1
    dp[0][3] = 1
    dp[0][4] = 1
    dp[0][5] = 1
    dp[0][6] = 1
    dp[0][7] = 1
    dp[0][8] = 1
    dp[0][9] = 1


    for (i in 0 until n - 1) {
        dp[i + 1][1] += dp[i][0]
        dp[i + 1][0] += dp[i][1]
        dp[i + 1][2] += dp[i][1]
        dp[i + 1][1] += dp[i][2]
        dp[i + 1][3] += dp[i][2]
        dp[i + 1][2] += dp[i][3]
        dp[i + 1][4] += dp[i][3]
        dp[i + 1][3] += dp[i][4]
        dp[i + 1][5] += dp[i][4]
        dp[i + 1][4] += dp[i][5]
        dp[i + 1][6] += dp[i][5]
        dp[i + 1][5] += dp[i][6]
        dp[i + 1][7] += dp[i][6]
        dp[i + 1][6] += dp[i][7]
        dp[i + 1][8] += dp[i][7]
        dp[i + 1][7] += dp[i][8]
        dp[i + 1][9] += dp[i][8]
        dp[i + 1][8] += dp[i][9]

        for (j in 0..9) {
            dp[i + 1][j] = dp[i + 1][j] % mod
        }
    }

    println(dp[n - 1].sum() % mod)
}


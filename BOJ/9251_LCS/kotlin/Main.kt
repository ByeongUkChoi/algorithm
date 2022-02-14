import java.util.*
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)

    val str1 = scanner.next()
    val str2 = scanner.next()

    val n = str1.length
    val m = str2.length

    val dp = Array(n + 1) { IntArray(m + 1) }

    for (i in 1..n) {
        for (j in 1..m) {
            if (str1[i - 1] == str2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            }
            dp[i][j] = max(dp[i - 1][j], dp[i][j])
            dp[i][j] = max(dp[i][j - 1], dp[i][j])
        }
    }
    println(dp[n][m])
}


import java.lang.Integer.max
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val triangle = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0..i) {
            triangle[i][j] = scanner.nextInt()
        }
    }

    var dp = Array(n) { IntArray(n) }
    dp[0][0] = triangle[0][0]

    for (i in 1 until n) {
        for (j in 0..i) {
            if (j == 0) {
                dp[i][j] = dp[i - 1][j] + triangle[i][j]
            } else if (j == i) {
                dp[i][j] = dp[i - 1][j - 1] + triangle[i][j]
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j]
            }
        }
    }

    println(dp[n - 1].maxOrNull())
}


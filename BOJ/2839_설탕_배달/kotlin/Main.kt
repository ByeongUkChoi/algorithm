import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var answer = 0
    for (i in 0..n / 3) {
        val leftWeight = n - (3 * i)
        if (leftWeight % 5 == 0) {
            answer = i + leftWeight / 5
            break
        }
    }
    if (answer > 0) {
        println(answer)
    } else {
        println(-1)
    }
}


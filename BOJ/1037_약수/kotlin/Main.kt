import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = IntArray(n)

    for (i in 0 until n) {
        numbers[i] = scanner.nextInt()
    }
    val min = numbers.minOrNull()!!
    val max = numbers.maxOrNull()!!

    println(min * max)
}


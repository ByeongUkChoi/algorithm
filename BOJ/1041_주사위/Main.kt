import java.util.*
import kotlin.math.min

fun main() {
    /**
     * N^3
     * 1면 : 5(N-2)^2 + 4(N-2) = 5N^2 - 16N + 12
     * 2면 : 4(N-1) + 4(N-2) = 8N - 12
     * 3면 : 4
     */

    val scanner = Scanner(System.`in`)

    val n = scanner.nextLong()
    val numbers = IntArray(6)
    for (i in 0 until 6) {
        numbers[i] = scanner.nextInt()
    }

    if (n == 1L) {
        val maxSide = numbers.maxOrNull() ?: throw Exception()
        println(numbers.sum() - maxSide)
        return
    }

    val dice = Dice(numbers)
    val sumOneSide = dice.getMinOneSide() * (5 * (n - 2) * (n - 2) + 4 * (n - 2))
    val sumTwoSide = dice.getMinTwoSide() * (4 * (n - 1) + 4 * (n - 2))
    val sumThreeSide = dice.getMinThreeSide() * 4

    println(sumOneSide + sumTwoSide + sumThreeSide)
}

class Dice(private val numbers: IntArray) {
    /**
     * 0 - 5
     * 1 - 4
     * 2 - 3
     */

    fun getMinOneSide(): Int {
        return numbers.minOrNull() ?: throw Exception();
    }

    fun getMinTwoSide(): Int {
        val minSides = IntArray(3)
        minSides[0] = min(numbers[0], numbers[5])
        minSides[1] = min(numbers[1], numbers[4])
        minSides[2] = min(numbers[2], numbers[3])
        val maxOfMinSides = minSides.maxOrNull() ?: throw Exception()
        return minSides.sum() - maxOfMinSides
    }

    fun getMinThreeSide(): Int {
        return min(numbers[0], numbers[5]) + min(numbers[1], numbers[4]) + min(numbers[2], numbers[3])
    }
}


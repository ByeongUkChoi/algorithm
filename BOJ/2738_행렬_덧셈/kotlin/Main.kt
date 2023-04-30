import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val (n, m) = readln().split(" ").map { it.toInt() }

    val matrixA = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val matrixB = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    matrixA.zip(matrixB).forEach { (rowA, rowB) ->
        println(rowA.zip(rowB).map { (a, b) -> a + b }.joinToString(" "))
    }
}

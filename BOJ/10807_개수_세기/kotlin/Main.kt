import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()

    scanner.nextLine()
    val numbers = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    val v: Int = scanner.nextInt()

    val count = numbers.count { it == v }
    println("$count")
}

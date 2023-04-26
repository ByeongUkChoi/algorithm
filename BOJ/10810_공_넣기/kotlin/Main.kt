import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    var s: List<String>
    s = scanner.nextLine().split(" ")
    val n: Int = s[0].toInt()
    val m: Int = s[1].toInt()

    val bucket = IntArray(n) { 0 }

    repeat(m) {
        s = scanner.nextLine().split(" ")
        for (i in s[0].toInt().. s[1].toInt()) {
            bucket[i-1] = s[2].toInt()
        }
    }

    val result = bucket.joinToString(" ")
    println(result)
}
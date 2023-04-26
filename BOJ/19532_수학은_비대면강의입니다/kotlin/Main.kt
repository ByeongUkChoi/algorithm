import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val s: List<String> = scanner.nextLine().split(" ")

    val a = s[0].toInt()
    val b = s[1].toInt()
    val c = s[2].toInt()
    val d = s[3].toInt()
    val e = s[4].toInt()
    val f = s[5].toInt()

    var answerX = 0
    var answerY = 0

    for (i in -999..999) {
        for (j in -999..999) {
            if (a * i + b * j == c && d * i + e * j == f) {
                answerX = i
                answerY = j
                break
            }
        }
    }

    println("$answerX $answerY")
}

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    val inputs = IntArray(count)
    for (i in 0 until count) {
        inputs[i] = scanner.nextInt()
    }

    val fibonacci = IntArray(43)
    fibonacci[0] = 1
    fibonacci[1] = 0
    for (i in 2..41) {
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
    }

    for (i in inputs) {
        println("${fibonacci[i]} ${fibonacci[i+1]}")
    }
}
/**
 * 0 : 1 0
 * 1 : 0 1
 * 2 : 1 1
 * 3 : 1 2
 * 4 : 2 3
 */

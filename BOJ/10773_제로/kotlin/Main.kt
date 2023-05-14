import java.util.Scanner
import java.util.Stack

fun main() {
    val scanner = Scanner(System.`in`)
    val k = scanner.nextInt()

    val stack = Stack<Int>()
    var input: Int

    repeat(k) {
        input = scanner.nextInt()
        if (input == 0) {
            stack.pop()
        } else {
            stack.push(input)
        }
    }
    println(stack.sum())
}

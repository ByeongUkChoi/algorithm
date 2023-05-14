import java.util.LinkedList
import java.util.Scanner
import java.util.Stack

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val stack = Stack<Int>()
    val result = LinkedList<String>()

    var cursor = 1
    var number: Int
    repeat(n) {
        number = scanner.nextInt()
        while (cursor <= number) {
            stack.push(cursor)
            cursor++
            result.add("+")
        }

        if (stack.peek() == number) {
            stack.pop()
            result.add("-")
        } else {
            println("NO")
            return
        }
    }

    while (result.isNotEmpty()) {
        println(result.poll())
    }
}

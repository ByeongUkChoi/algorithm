import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    val stack: Stack<Int> = Stack()
    for (i in 0 until n) {
        val input = readLine()
        handle(input, stack)
    }
}

fun handle(input: String, stack: Stack<Int>) {
    val command = input.split(" ")
    val operand = { command: List<String> -> command[1].toInt() }
    when (command[0]) {
        "push" -> stack.push(operand(command))
        "pop" -> if (stack.isEmpty()) {
            println(-1)
        } else {
            println(stack.pop())
        }
        "size" -> println(stack.size)
        "empty" -> println(stack.isEmpty().compareTo(false))
        "top" -> if (stack.isEmpty()) {
            println(-1)
        } else {
            println(stack.peek())
        }
    }
}


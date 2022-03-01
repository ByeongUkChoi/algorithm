import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine()
    val nums = readLine()
        .split(" ")
        .map(String::toInt)
        .toSet()
    readLine()
    readLine()
        .split(" ")
        .forEach { n -> bw.write("${if (nums.contains(n.toInt())) 1 else 0}\n") }
    bw.flush()
}


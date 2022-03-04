import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val commands = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        commands[i] = readLine()
    }

    for (i in 0 until commands[0]!!.length) {
        val charSet = mutableSetOf<Char>()
        for (j in 0 until n) {
            charSet.add(commands[j]!![i])
        }
        bw.write("${if (charSet.size == 1) commands[0]!![i] else "?"}")
    }
    bw.flush()
}


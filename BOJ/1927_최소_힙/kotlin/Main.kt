import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val q = PriorityQueue<Int>()
    for (i in 0 until n) {
        val x = readLine().toInt()
        if (x > 0) {
            q.add(x)
            continue
        }
        bw.write("${if (q.isEmpty()) 0 else q.poll()}\n")
    }
    bw.flush()
}


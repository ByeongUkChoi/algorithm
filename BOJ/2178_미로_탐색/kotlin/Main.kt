import java.util.LinkedList
import java.util.Queue

data class Position(val x: Int, val y: Int)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val maze = Array(n) { readln().toCharArray().map { it - '0' }.toIntArray() }

    val queue: Queue<Position> = LinkedList()
    queue.add(Position(0, 0))

    bfs(queue, maze, n, m)
    println(maze[n - 1][m - 1])
}

fun bfs(queue: Queue<Position>, maze: Array<IntArray>, n: Int, m: Int) {
    if (queue.isNotEmpty()) {
        val current = queue.remove()

        // 상하좌우 이동
        listOf(
            Position(current.x + 1, current.y),
            Position(current.x - 1, current.y),
            Position(current.x, current.y + 1),
            Position(current.x, current.y - 1)
        ).forEach { pos ->
            if (pos.x in 0 until n && pos.y in 0 until m && maze[pos.x][pos.y] == 1) {
                maze[pos.x][pos.y] = maze[current.x][current.y] + 1
                queue.add(Position(pos.x, pos.y))
            }
        }

        bfs(queue, maze, n, m)
    }
}

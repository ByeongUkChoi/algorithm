import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val v = scanner.nextInt()

    val graph = Array(n + 1) { IntArray(n + 1) }
    for (i in 0 until m) {
        val x = scanner.nextInt()
        val y = scanner.nextInt()
        graph[x][y] = 1
        graph[y][x] = 1
    }


    val dfpVisitedHistory = dfs(graph, IntArray(n + 1), LinkedList<Int>(), v)
    val bfpVisitedHistory = bfs(graph, v)

    for (i in 0 until dfpVisitedHistory.size) {
        print(dfpVisitedHistory.pop())
        print(" ")
    }
    println()
    for (i in 0 until bfpVisitedHistory.size) {
        print(bfpVisitedHistory.pop())
        print(" ")
    }
}

fun dfs(graph: Array<IntArray>, visited: IntArray, visitedHistory: LinkedList<Int>, visit: Int): LinkedList<Int> {
    if (visited[visit] == 1) {
        return visitedHistory
    }
    visited[visit] = 1
    visitedHistory.add(visit)
    for (i in 1 until graph.size) {
        if (i == visit) {
            continue
        }
        if (graph[visit][i] == 1 && visited[i] == 0) {
            dfs(graph, visited, visitedHistory, i)
        }
    }
    return visitedHistory
}

fun bfs(graph: Array<IntArray>, startVisit: Int): LinkedList<Int> {
    val visited = IntArray(graph.size + 1)
    val visitedHistory = LinkedList<Int>()

    var searchQueue: Queue<Int> = LinkedList()
    searchQueue.add(startVisit)
    while (searchQueue.isNotEmpty()) {
        val visit = searchQueue.poll()
        if (visited[visit] == 1) {
            continue
        }
        visited[visit] = 1
        visitedHistory.add(visit)
        for (i in 1 until graph.size) {
            if (graph[visit][i] == 1) {
                searchQueue.add(i)
            }
        }
    }

    return visitedHistory
}


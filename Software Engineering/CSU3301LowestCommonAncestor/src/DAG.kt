import java.util.*

enum class Color {
    BLACK, WHITE
}
data class Node(var color: Color,var value: Int, var inDegree: Int, var outDegree: Int, var childNodes: List<Node>)

fun graph(pairs: Array<IntArray>) {
    val graph: HashMap<Int, MutableList<Int>> = hashMapOf()
    pairs.forEach { pair ->
        if (!graph.containsKey(pair[0])) {
            // If the current node isn't in the adjacency list yet,
            // add it and create its dependency list starting with
            // pair[1]
            graph[pair[0]] = mutableListOf(pair[1])
        } else {
            // Otherwise, append pair[1] to its existing dependency
            // list.
            val dependencies = graph[pair[0]]
            dependencies!!.add(pair[1])
            graph[pair[0]] = dependencies
        }
    }
}

fun bfs(nodes: List<List<Node>>) {
    val visited = BooleanArray(nodes.size) { false }
    // Create a queue and add 0 to represent the index of the
    // first node
    val queue: MutableList<Int> = mutableListOf(0)
    while (queue.isNotEmpty()) {
        println("hello")
        // Dequeue a node from queue
        val node = queue.removeAt(0)
        // Add all of the node's unvisited neighbors to the queue
        println(node)
        if (!visited[node]) {
            nodes[node].forEach {
                queue.add(it.value)
            }
            // Mark the dequeued node as visited
            visited[node] = true
            println(node)
            println(visited[node])

        }
    }
}



fun main(args: Array<String>) {

}
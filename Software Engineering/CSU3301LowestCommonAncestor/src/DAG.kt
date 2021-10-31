import java.util.*

enum class Color {
    BLACK, WHITE
}
data class Node(val color: Color,val value: Int, val inDegree: Int, val outDegree: Int, val connectedNodes: List<Node>)

data class Graph(val graph: List<List<Node>>)

fun bfs(nodes: Graph) {
    val visited = BooleanArray(nodes.graph.size) { false }
    // Create a queue and add 0 to represent the index of the
    // first node
    val queue: MutableList<Int> = mutableListOf(0)
    while (queue.isNotEmpty()) {
        // Dequeue a node from queue
        val node = queue.removeAt(0)
        // Add all of the node's unvisited neighbors to the queue
        println(node)
        if (!visited[node]) {
            nodes.graph[node].forEach {
                queue.add(it.value)
            }
            // Mark the dequeued node as visited
            visited[node] = true
            println(node)
            println(visited[node])

        }
    }
}
fun lca(graph: Graph, node1: Node, node2: Node): Set<Node> {
    bfs(graph)
    val sum = node1.connectedNodes + node2.connectedNodes
    return sum.toSet()
}


fun main(args: Array<String>) {

}
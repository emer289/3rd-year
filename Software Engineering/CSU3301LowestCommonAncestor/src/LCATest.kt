package `Directed Acyclic Graph`

import org.junit.Assert.*
import org.junit.Test
import lca
import Graph
import Node

class LCATest {


    @Test

    fun `checking LCA is giving the expected result for a tree with 7 nodes`() {
        var node0 = (Node(Color.WHITE, 0, 0, 2, listOf()))
        var node1 = (Node(Color.WHITE, 1, 1, 2, listOf(node0)))
        var node2 = (Node(Color.WHITE, 2, 1, 2, listOf(node0)))
        var node3 = (Node(Color.WHITE, 3, 1, 2, listOf(node1)))
        var node4 = (Node(Color.WHITE, 4, 1, 2, listOf(node1)))
        var node5 = (Node(Color.WHITE, 5, 1, 2, listOf(node2)))
        var node6 = (Node(Color.WHITE, 6, 1, 2, listOf(node2)))

        val graph = Graph(
            listOf(
                listOf(node0),
                listOf(node1),
                listOf(node2),
                listOf(node4),
                listOf(node3),
                listOf(node5),
                listOf(node6)
            )
        )

        assertEquals("[1]", lca(graph, node4, node3).map { it.value }.toString())
        assertEquals("[2]", lca(graph, node5, node6).map { it.value }.toString())
        assertEquals("[0]", lca(graph, node1, node2).map { it.value }.toString())
        assertEquals("[0,1]", lca(graph, node1, node4).map { it.value }.toString())

    }

    @Test

    fun ` checking LCA is returns -1 for a tree with 0 nodes`() {

        val graph = Graph(
            listOf(
            )
        )
        var node5 = (Node(Color.WHITE, 5, 1, 2, listOf()))
        var node6 = (Node(Color.WHITE, 6, 1, 2, listOf()))

        assertEquals("[-1]", lca(graph, node5, node6).map { it.value }.toString())


    }

    @Test
    fun `checking LCA is returns 1 for a tree with 2 nodes`() {

        var node1 = (Node(Color.WHITE, 1, 1, 2, listOf()))
        var node2 = (Node(Color.WHITE, 2, 1, 2, listOf(node1)))
        val graph = Graph(
            listOf(
                listOf(node1), listOf(node2)
            )
        )


        assertEquals("[1]", lca(graph, node1, node2).map { it.value }.toString())


    }


    @Test
    fun `checking LCA with 2 parent nodes`() {

        var node0 = (Node(Color.WHITE, 0, 0, 3, listOf()))
        var node1 = (Node(Color.WHITE, 1, 1, 1, listOf(node0)))
        var node2 = (Node(Color.WHITE, 2, 1, 1, listOf(node0, node1)))
        var node3 = (Node(Color.WHITE, 3, 1, 1, listOf(node0)))
        var node4 = (Node(Color.WHITE, 4, 3, 1, listOf(node0, node1, node2, node3)))
        var node5 = (Node(Color.WHITE, 5, 2, 0, listOf(node3,node4)))


        val graph = Graph(
            listOf(
                listOf(node0),
                listOf(node1),
                listOf(node2),
                listOf(node4),
                listOf(node3),
                listOf(node5)
            )
        )


        assertEquals("[0 1]", lca(graph, node5, node4).map { it.value }.toString())


    }

}
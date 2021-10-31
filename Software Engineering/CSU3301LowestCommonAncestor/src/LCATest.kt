
import org.junit.Assert.*
import org.junit.Test
import Node
import DAG


val dag: DAG = DAG(1)
val r: Node = dag.root

val n2 = Node(2)
val n3 = Node(3)
val n4 = Node(4)
val n5 = Node(5)
val n6 = Node(6)
val n7 = Node(7)

class LCATest {

    @Test
    //this is the first java test(from part1 of the assignment) to kotlin
    fun `checking LCA is giving the expected result for a tree with 7 nodes`() {

        r.descendants = listOf<Node>(n2,n3)
        n2.ancestors = listOf<Node>(r)
        n2.descendants = listOf<Node>(n4, n5)
        n3.ancestors = listOf<Node>(r)
        n3.descendants = listOf<Node>(n6, n7)
        n4.ancestors = listOf<Node>(n2)
        n5.ancestors = listOf<Node>(n2)
        n6.ancestors = listOf<Node>(n3)
        n7.ancestors = listOf<Node>(n3)


        assertEquals("[2]", dag.lca(n4,n5).map { it.value }.toString())
        assertEquals("[1]", dag.lca(n4,n6).map { it.value }.toString())
        assertEquals("[1]", dag.lca(n3,n4).map { it.value }.toString())
        assertEquals("[2]", dag.lca(n2,n4).map { it.value }.toString())

    }

    @Test
    //this is the second java test(from part1 of the assignment) to kotlin
    fun ` checking LCA returns -1 for a tree with 0 nodes`() {
        assertEquals( "-1",dag.lca().toString())
    }

    @Test
    //this is the third java test(from part1 of the assignment) to kotlin
    fun `checking LCA is returns 1 for a tree with 2 nodes`() {
        r.descendants = listOf<Node>(n2)
        n2.ancestors = listOf<Node>(r)
        assertEquals("[1]", dag.lca(r,n2).map { it.value }.toString())
    }

    //this is the forth java test, this failed with the old LCA code but now passes
    @Test
    //for this test i will use the graph shown in the lecture
    //a=n1,b=n2,c=n3,d=n4,e=n5
    fun `checking LCA with 2 parent nodes`() {
        r.descendants = listOf<Node>(n2,n3,n4,n5)
        n2.ancestors = listOf<Node>(r)
        n2.descendants = listOf<Node>(n4)
        n3.ancestors = listOf<Node>(r)
        n3.descendants = listOf<Node>(n4, n5)
        n4.ancestors = listOf<Node>(r,n2,n3)
        n4.descendants = listOf(n5)
        n5.ancestors = listOf<Node>(r,n3,n4)


        assertEquals("[1]", dag.lca(n2,n3).map { it.value }.toString())
        // returns two LCA
        assertEquals("[1, 3]", dag.lca(n4,n5).map { it.value }.toString())
        assertEquals("[1]", dag.lca(n3,n4).map { it.value }.toString())
        assertEquals("[1]", dag.lca(r,n4).map { it.value }.toString())

    }

}





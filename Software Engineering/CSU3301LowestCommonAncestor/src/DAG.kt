import org.junit.Assert

class Node(val value: Int) {
    var ancestors = listOf<Node>()
    var descendants = listOf<Node>()
}

class DAG(root_val: Int) {
    val root: Node = Node(root_val)
    // a List<Node> is returned so if there are more then 2 LCA
    // it returns all
    fun lca(node1: Node, node2: Node): List<Node> {



        // if one of the nodes is a root node
        // the root node is returned
        if (this.root.value.equals(node1.value) or this.root.value.equals(node2.value))
            return listOf(this.root)

        // if they are the same node
        // the node is returned
        if (node1.value.equals(node2.value))
            return listOf(node1)

        var LCA = mutableListOf<Node>()

        node1.ancestors.map {
                a -> node2.ancestors.map {
            if (a.value.equals(it.value)) LCA.add(a) } }


        if (LCA.isEmpty())
            if (node1.value > node2.value)
                LCA.add(this.lca(node1.ancestors[0], node2)?.get(0))
            else
                LCA.add(this.lca(node1, node2.ancestors[0])?.get(0))

        return LCA
    }
    fun lca(): Int {
        return -1
    }


}



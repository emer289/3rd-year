import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/*public class LowestCommonAncestorTest {
    @Test
    // checking lowestCommonAncestor is giving the expected result for a tree with 7 nodes
    public void testLowestCommonAncestor7Nodes() {
        
        //Set up
        
    /*    LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
       
        AcylicDirectedGraphs g = new AcylicDirectedGraphs();
        g.vertices = 7;
		g.adj = new ArrayList[g.vertices];
		g.tr = new ArrayList[g.vertices];
		for(int i = 0; i < g.vertices; i++)
		{
			g.adj[i] = new ArrayList<Integer>();
			g.tr[i] = new ArrayList<Integer>();
		}
		
		g.addedge(g.adj,  g.tr, 0, 1, false);
		g.addedge(g.adj,  g.tr, 0, 2, false);
		g.addedge( g.adj,  g.tr, 1, 3, false);
        g.addedge(g.adj,  g.tr, 1, 4, false);
        g.addedge( g.adj,  g.tr, 2, 5, false);
        g.addedge(g.adj,  g.tr, 2, 6, false);
				
		System.out.println(g.getParentNodes(g.adj,  g.tr, g.vertices, 3).toString());

		
        
        //assertEquals to get actual value
       /* assertEquals( 2, tree.findLCA(4,5));
        assertEquals( 1, tree.findLCA(4,6));
        assertEquals( 1, tree.findLCA(3,4));
        assertEquals( 2, tree.findLCA(2,4));*/
//    }

   /* @Test
    // checking lowestCommonAncestor is returns -1 for a tree with 0 nodes
    public void testLowestCommonAncestorNoNodes() {
        
        //Set up
        
        LowestCommonAncestor tree = new LowestCommonAncestor();
        
        
        //assertEquals to get actual value
        assertEquals( -1, tree.findLCA(4,5));
        
    }

    @Test
    // checking lowestCommonAncestor is returns 1 for a tree with 2 nodes
    public void testLowestCommonAncestor2Nodes() {
        
        //Set up
        
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        
        //assertEquals to get actual value
        assertEquals( 1, tree.findLCA(1,2));
        
    }
    @Test
    // checking lowestCommonAncestor is returns 1 for a tree with 2 nodes
    public void testLowestCommonAncestor3Nodes() {
        
        //Set up
        
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        //assertEquals to get actual value
        assertEquals( 1, tree.findLCA(3,2));
        
    }
    @Test
    // checking lowestCommonAncestor with 2 parent nodes
    // It's difficult to write the test because my code creates binary graphs
    // and it finds the parent node for two nodes in a binary tree
    public void testLowestCommonAncestor2ParentNodes() {
        
        //Set up
        
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = tree.root.left.right;
        
        //assertEquals to get actual value
        assertEquals( 3, tree.findLCA(4,2));
        
    }

}*/

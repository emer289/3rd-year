// Java program to find single source shortest paths in Directed Acyclic Graphs
import java.io.*;
import java.util.*;

class AcylicDirectedGraphs
{
	static final int INF=Integer.MAX_VALUE;
	class AdjListNode
	{
		private int v;
		private int weight;
		AdjListNode(int _v, int _w) { v = _v; weight = _w; }
		int getV() { return v; }
		int getWeight() { return weight; }
	}

	// Class to represent graph as an adjacency list of
	// nodes of type AdjListNode
	class Graph
	{
		private int V;
		private LinkedList<AdjListNode>adj[];
		Graph(int v)
		{
			V=v;
			adj = new LinkedList[V];
			for (int i=0; i<v; ++i)
				adj[i] = new LinkedList<AdjListNode>();
		}
		void addEdge(int u, int v, int weight)
		{
			AdjListNode node = new AdjListNode(v,weight);
			adj[u].add(node);// Add v to u's list
		}
	
	}

	// Method to create a new graph instance through an object
	// of ShortestPath class.
	Graph newGraph(int number)
	{
		return new Graph(number);
	}

	public static void main(String args[])
	{
		// Create a graph given in the above diagram. Here vertex
		// numbers are 0, 1, 2, 3, 4, 5 with following mappings:
		// 0=r, 1=s, 2=t, 3=x, 4=y, 5=z
		AcylicDirectedGraphs t = new AcylicDirectedGraphs();
		Graph g = t.newGraph(6);
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2, 3);
		g.addEdge(1, 3, 6);
		g.addEdge(1, 2, 2);
		g.addEdge(2, 4, 4);
		g.addEdge(2, 5, 2);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 4, -1);
		g.addEdge(4, 5, -2);
	
	}
}
//This code is contributed by Aakash Hasija

// Java program to find the transpose of a graph
import java.util.*;
import java.lang.*;
import java.io.*;

class AcylicDirectedGraphs
{
	// Total number of vertices
	int vertices;
	
	// Find transpose of graph represented by adj
	ArrayList<Integer>[] adj;
	
	// Store the transpose of graph represented by tr
	ArrayList<Integer>[] tr;
	
	AcylicDirectedGraphs(int vertices){
		this.vertices = vertices;
		adj = new ArrayList[vertices];
		tr = new ArrayList[vertices];

	}

	// Function to add an edge from source vertex u to
	// destination vertex v, if choice is false the edge is added
	// to adj otherwise the edge is added to tr
	public static void addedge(AcylicDirectedGraphs graph, int u, int v, boolean choice)
	{
		if(!choice)
			graph.adj[u].add(v);
		else
			graph.tr[u].add(v);
	}


	public static ArrayList<Integer> getParentNodes(AcylicDirectedGraphs graph, int node){
		// Finding transpose of the graph
		// Traverse the graph and for each edge u, v
		// in graph add the edge v, u in transpose
		for(int i = 0; i < graph.vertices; i++)
			for(int j = 0; j < graph.adj[i].size(); j++)
				addedge(graph, graph.adj[i].get(j), i, true);

		return graph.tr[node];

	}

	public static void main (String[] args) throws java.lang.Exception
	{
		AcylicDirectedGraphs graph = new AcylicDirectedGraphs(5);
		for(int i = 0; i < graph.vertices; i++)
		{
			graph.adj[i] = new ArrayList<Integer>();
			graph.tr[i] = new ArrayList<Integer>();
		}
		addedge(graph, 0, 1, false);
		addedge(graph, 0, 2, false);
		addedge(graph, 0, 3, false);
       	addedge(graph, 0, 4, false);
        addedge(graph, 1, 3, false);
        addedge(graph, 2, 4, false);
		addedge(graph, 3, 4, false);
		
		
		System.out.print(getParentNodes(graph,3));
		
		
       
	}
}

// This code is contributed by code_freak

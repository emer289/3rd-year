// Java program to find the transpose of a graph
import java.util.*;
import java.lang.*;
import java.io.*;

class AcylicDirectedGraphs
{
	// Total number of vertices
	static int vertices;
	
	// Find transpose of graph represented by adj
	static ArrayList<Integer>[] adj;
	
	// Store the transpose of graph represented by tr
	static ArrayList<Integer>[] tr;
	

	// Function to add an edge from source vertex u to
	// destination vertex v, if choice is false the edge is added
	// to adj otherwise the edge is added to tr
	public static void addedge( int u, int v, boolean choice)
	{
		if(!choice)
			adj[u].add(v);
		else
			tr[u].add(v);
	}


	public static ArrayList<Integer> getParentNodes( int node){
		// Finding transpose of the graph
		// Traverse the graph and for each edge u, v
		// in graph add the edge v, u in transpose
		for(int i = 0; i < vertices; i++)
			for(int j = 0; j < adj[i].size(); j++)
				addedge( adj[i].get(j), i, true);

		return tr[node];

	}

	public static void main (String[] args) throws java.lang.Exception
	{
		
		vertices = 5;
		adj = new ArrayList[vertices];
		tr = new ArrayList[vertices];
		for(int i = 0; i < vertices; i++)
		{
			adj[i] = new ArrayList<Integer>();
			tr[i] = new ArrayList<Integer>();
		}
		
		addedge( 0, 1, false);
		addedge( 0, 2, false);
		addedge( 0, 3, false);
       	addedge( 0, 4, false);
        addedge( 1, 3, false);
        addedge( 2, 4, false);
		addedge( 3, 4, false);
		
		
		System.out.print(getParentNodes(3));
		
		
       
	}
}

// This code is contributed by code_freak

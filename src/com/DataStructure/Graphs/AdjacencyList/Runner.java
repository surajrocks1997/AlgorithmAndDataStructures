package com.DataStructure.Graphs.AdjacencyList;

public class Runner {

	public static void main(String[] args) {
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4); 
		graph.addEdge(graph, 1, 2); 
		graph.addEdge(graph, 1, 3); 
		graph.addEdge(graph, 1, 4); 
		graph.addEdge(graph, 2, 3); 
		graph.addEdge(graph, 3, 4); 
		
		graph.printGraph(graph);
		
		System.out.println("BFS: ");
		graph.BFS(4);
		System.out.println();
		System.out.println("DFS: ");
		graph.DFS();
		
		System.out.println("ARRAY: ");
		graph.printArray();

	}

}

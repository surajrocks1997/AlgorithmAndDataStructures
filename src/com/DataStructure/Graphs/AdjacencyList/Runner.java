package com.DataStructure.Graphs.AdjacencyList;

public class Runner {

	public static void main(String[] args) {
		int V = 4;
		Graph graph = new Graph(V);
//		graph.addEdge(graph, 0, 1);
//		graph.addEdge(graph, 0, 4); 
//		graph.addEdge(graph, 1, 2); 
//		graph.addEdge(graph, 1, 3); 
//		graph.addEdge(graph, 1, 4); 
//		graph.addEdge(graph, 2, 3); 
//		graph.addEdge(graph, 3, 4);
		
		graph.addEdge(graph, 0, 1); 
        graph.addEdge(graph, 0, 2); 
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3); 
        graph.addEdge(graph, 3, 3); 
		
		graph.printGraph(graph);
		
		System.out.println("BFS: ");
		graph.BFS(1);
		System.out.println();
		System.out.println("DFS: ");
		graph.DFS();
		
		System.out.println("ARRAY: ");
		graph.printArray();

		if(graph.isCyclic()) {
			System.out.println("Yes, Cyclic");
		}
		else {
			System.out.println("Nope, not cyclic");
		}
	}

}

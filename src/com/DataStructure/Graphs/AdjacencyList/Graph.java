package com.DataStructure.Graphs.AdjacencyList;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	int V;
	LinkedList<Integer> adjListArray[];
	
	public Graph(int V) {
		this.V = V;
		adjListArray = new LinkedList[V];
		
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(Graph graph, int src, int dst) {
		graph.adjListArray[src].add(dst);
		
		graph.adjListArray[dst].add(src);	//since it is undirected graph
	}
	
	public void BFS(int s) {
		boolean[] visited = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[s] = true;
		queue.add(s);
		while(queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			
			Iterator<Integer> i = adjListArray[s].listIterator();
			
			while(i.hasNext()) {
				int n = i.next();
				
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public void printGraph(Graph graph) {
		for (int i = 0; i < graph.V; i++) {
			System.out.println("Adjacency list of Vertex " + i);
			System.out.print("head");
			
			for(Integer x: graph.adjListArray[i]) {
				System.out.print(" -> " + x);
			}
			System.out.println();
		}
	}

}

package com.DataStructure.Graphs.AdjacencyList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	int V;
	LinkedList<Integer>[] adjListArray;
	
	public Graph(int V) {
		this.V = V;
		adjListArray = new LinkedList[V];
		
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}
	
	public void printArray() {
		for (int i = 0; i < adjListArray.length; i++) {
			System.out.print(adjListArray[i]);
		}
	}
	
	public void addEdge(Graph graph, int src, int dst) {
		graph.adjListArray[src].add(dst);
		
//		graph.adjListArray[dst].add(src);	//since it is undirected graph
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
	
	public void DFS() {
		boolean[] visited = new boolean[V];
		
		for (int i = 0; i < V; i++) {
			if(visited[i] == false) {
				DFSUtil(i, visited);
			}
		}
	}
	
	private void DFSUtil(int i, boolean[] visited) {
		visited[i] = true;
		System.out.print(i + " ");
		
		Iterator<Integer> iter = adjListArray[i].listIterator();
		while(iter.hasNext()) {
			int n = iter.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}
	
	public boolean isCyclic() {
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];
		
		for (int i = 0; i < V; i++) {
			if(isCyclicUtil(i, visited, recStack)) {
				return true;
			}
		}
		return false;
	}

	private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
		if(recStack[i]) {
			return true;
		}
		if(visited[i]) {
			return false;
		}
		
		visited[i] = true;
		recStack[i] = true;
		
		for(Integer x: adjListArray[i]) {
			if(isCyclicUtil(x, visited, recStack)) {
				return true;
			}
		}
		recStack[i] = false;
		return false;
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

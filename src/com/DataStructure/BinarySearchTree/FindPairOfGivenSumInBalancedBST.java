package com.DataStructure.BinarySearchTree;

import java.util.ArrayList;

public class FindPairOfGivenSumInBalancedBST {

	public static void main(String[] args) {
		FindPair tree = new FindPair();
		tree.insert(15); 
		tree.insert(10); 
		tree.insert(20); 
		tree.insert(8); 
		tree.insert(12); 
		tree.insert(16); 
		tree.insert(25); 
		
		tree.findPairSum(tree.root, 20);

	}

}

class FindPair extends BinarySearchTree{

	public void findPairSum(Node root, int sum) {
		ArrayList<Integer> nodes = new ArrayList<>();
		storeBSTNodes(root, nodes);
		
		int size = nodes.size();
		
		findPair(nodes, 0, size-1, sum, size-1);
		
		
	}

	private void findPair(ArrayList<Integer> nodes, int start, int end, int sum, int fixend) {
		
		if(nodes.get(start) + nodes.get(end) == sum) {
			System.out.println(nodes.get(start) + " + " + nodes.get(end) + " = " + sum);
			return;
		}
		if(start == end) {
			findPair(nodes, start + 1, fixend, sum, fixend);
		}
		else if(nodes.get(start) + nodes.get(end) != sum) {
			findPair(nodes, start, end-1, sum, fixend);
		}
		
		
	}

	private void storeBSTNodes(Node root, ArrayList<Integer> nodes) {
		if(root == null) {
			return;
		}
		storeBSTNodes(root.left, nodes);
		nodes.add(root.data);
		storeBSTNodes(root.right, nodes);
		
	}

}

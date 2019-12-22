package com.DataStructure.BinaryTree.LinkedList;

public class VerticalOrderTraversal {

	public static void main(String[] args) {
		VerticalOrder tree = new VerticalOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);

		System.out.println("Vertical Order : ");
		tree.verticalOrder(tree.root);

	}
}

class VerticalOrder extends BinaryTree{
	Node root;
	Values val = new Values();
	
	public void verticalOrder(Node node) {
		findMinMax(node, val, val, 0);

		for(int lineNum = val.min; lineNum < val.max; lineNum++) {
			printVerticalLine(node, lineNum, 0);
			System.out.println();
		}

	}

	private static void printVerticalLine(Node node, int lineNum, int horizontaldistance) {
		if(node==null) {
			return;
		}
		if(horizontaldistance == lineNum) {
			System.out.print(node.data + " ");
		}
		printVerticalLine(node.left, lineNum, horizontaldistance-1);
		printVerticalLine(node.right, lineNum, horizontaldistance+1);
	}

	private static void findMinMax(Node node, Values min, Values max, int horizontalDistance) {
		if(node == null) {
			return;
		}

		if(horizontalDistance < min.min) {
			min.min = horizontalDistance;
		}
		else if(horizontalDistance > max.max) {
			max.max = horizontalDistance;
		}

		findMinMax(node.left, min, max, horizontalDistance-1);
		findMinMax(node.right, min, max, horizontalDistance+1);
	}
}

class Values{
	int min, max;
}

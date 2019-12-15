package com.DataStructure.BinarySearchTree;

public class LowestCommonAncesstor {

	public static void main(String[] args) {
		FindLowestCommonAncesstor tree = new FindLowestCommonAncesstor();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.LCA(20,30);

	}

}

class FindLowestCommonAncesstor extends BinarySearchTree{

	public void LCA(int num1, int num2) {
		Node temp = root;
		
		while(temp != null) {
			if(root.data > num1 && root.data > num2) {
				root = root.left;
			}
			else if(root.data < num1 && root.data < num2) {
				root = root.right;
			}
			
			else
				break;
		}
		
		System.out.print("LCA: " + root.data);
	}
	
}
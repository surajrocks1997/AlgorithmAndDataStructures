package com.DataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/*
There are 2 types of Traversal
    1.  Depth First Traversal
        a.  Inorder
        b.  Preorder
        c.  Postorder
    2.  Breadth First Traversal or Level Order Traversal
*/
public class TypesOfTraversal {

    public static void main(String[] args) {

        // BinaryTree tree = new BinaryTree();
        Print print = new Print();
        
        print.root = new Node(1);
        print.root.left = new Node(2);
        print.root.right = new Node(3);
        print.root.left.left = new Node(4);
        print.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        print.printInorder();
        System.out.println();
        System.out.print("Preorder: ");
        print.printPreorder();
        System.out.println();
        System.out.print("PostOrder: ");
        print.printPostOrder();
        
        System.out.println();
        System.out.print("Level Order / Breadth First : ");
        print.printLevelOrder();
    }
}

class Print extends BinaryTree {
    
    public void printInorder() {
        Inorder(root);
    }

	public void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
    }

    public void printPreorder() {
        Preorder(root);
    }

    private void Preorder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
    }

    public void printPostOrder() {
        PostOrder(root);
    }

    private void PostOrder(Node node) {
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data + " ");
    }
    

    public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode  = queue.poll();
			System.out.print(tempNode.data + " ");
			
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
			
			
		}
		
		
		
	}
}
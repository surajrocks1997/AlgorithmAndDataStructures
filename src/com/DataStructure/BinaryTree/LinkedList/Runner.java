package com.DataStructure.BinaryTree.LinkedList;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);    
            //will create 1 as a root with left and right child as null
        tree.root.left = new Node(2);
            //will create left child of 1 as 2
        tree.root.right = new Node(3);
            //will create left child of 1 as 3
        tree.root.left.left = new Node(4);
            //will create left of left child of 1 as 4 so basically left child of 2
    }
}
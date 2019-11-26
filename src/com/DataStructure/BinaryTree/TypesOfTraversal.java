package com.DataStructure.BinaryTree;
/*
There are 2 types of Traversal
    1.  Depth First Traversal
        a.  Inorder
        b.  Preorder
        c.  Postorder
    2.  Breadth First Traversal
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
        
    }
}

class Print extends BinaryTree {
    
    public void printInorder() {
        Inorder(root);
    }

    private void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.key + " ");
        Inorder(node.right);
    }

    public void printPreorder() {
        Preorder(root);
    }

    private void Preorder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.key + " ");
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
        System.out.print(node.key + " ");
    }
}
package com.nhlaks;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order Traversal:");
        bst.inorder();

        System.out.println("Pre-order Traversal:");
        bst.preorder();

        System.out.println("Post-order Traversal:");
        bst.postorder();

        System.out.println();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));

        System.out.println();

        System.out.println("Deleting 30...");
        bst.delete(30);

        System.out.println("In-order after deletion:");
        bst.inorder();
    }
}
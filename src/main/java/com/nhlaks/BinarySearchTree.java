package com.nhlaks;

/**
 * Binary Search Tree implementation.
 */
public class BinarySearchTree {

    private TreeNode root;

    /**
     * Inserts a value into the BST.
     *
     * @param value value to insert
     */
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode current, int value) {

        if (current == null)
            return new TreeNode(value);

        if (value < current.value)
            current.left = insertRecursive(current.left, value);

        else if (value > current.value)
            current.right = insertRecursive(current.right, value);

        return current;
    }

    /**
     * Searches for a value.
     *
     * @param value value to search
     * @return true if found
     */
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(TreeNode current, int value) {

        if (current == null)
            return false;

        if (current.value == value)
            return true;

        return value < current.value
                ? searchRecursive(current.left, value)
                : searchRecursive(current.right, value);
    }

    /**
     * Deletes a node from the BST.
     *
     * @param value value to delete
     */
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode current, int value) {

        if (current == null)
            return null;

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
        } else {

            // Node with one child or no child
            if (current.left == null)
                return current.right;

            if (current.right == null)
                return current.left;

            // Node with two children
            int smallest = findSmallest(current.right);
            current.value = smallest;
            current.right = deleteRecursive(current.right, smallest);
        }

        return current;
    }

    private int findSmallest(TreeNode node) {

        return node.left == null
                ? node.value
                : findSmallest(node.left);
    }

    /**
     * Displays In-order traversal.
     */
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(TreeNode node) {

        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.value + " ");
            inorderRecursive(node.right);
        }
    }

    /**
     * Displays Pre-order traversal.
     */
    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(TreeNode node) {

        if (node != null) {
            System.out.print(node.value + " ");
            preorderRecursive(node.left);
            preorderRecursive(node.right);
        }
    }

    /**
     * Displays Post-order traversal.
     */
    public void postorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(TreeNode node) {

        if (node != null) {
            postorderRecursive(node.left);
            postorderRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }
}
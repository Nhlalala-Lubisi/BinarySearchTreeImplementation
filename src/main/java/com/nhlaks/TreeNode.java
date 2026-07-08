package com.nhlaks;

/**
 * Represents a single node in the Binary Search Tree.
 */
public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    /**
     * Creates a node with the given value.
     *
     * @param value value stored in the node
     */
    public TreeNode(int value) {
        this.value = value;
    }
}
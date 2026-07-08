package com.nhlaks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void testInsertAndSearch() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        assertTrue(bst.search(10));
        assertTrue(bst.search(5));
        assertTrue(bst.search(15));

        assertFalse(bst.search(100));
    }

    @Test
    void testDelete() {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);

        bst.delete(30);

        assertFalse(bst.search(30));
        assertTrue(bst.search(50));
    }
}
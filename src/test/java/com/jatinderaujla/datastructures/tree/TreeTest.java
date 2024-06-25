package com.jatinderaujla.datastructures.tree;

import com.jatinderaujla.datastructures.tree.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TreeTest {
    private Tree<Integer> integerBinaryTree;
    private Tree<String> stringBinaryTree;

    @BeforeEach
    void setUp() {
        integerBinaryTree = new Tree<>();
        integerBinaryTree.add(6);
        integerBinaryTree.add(4);
        integerBinaryTree.add(3);
        integerBinaryTree.add(5);

        integerBinaryTree.add(5);

        integerBinaryTree.add(8);
        integerBinaryTree.add(7);
        integerBinaryTree.add(9);

        //create string binary tree
        stringBinaryTree = new Tree<>();
        stringBinaryTree.add("John");
    }

    @Test
    void rootNodeTest() {
        Tree.Node<Integer> rootNode = integerBinaryTree.root();
        assertNotNull(rootNode);
        assertEquals(6, rootNode.data());
    }

    @Test
    void traversePreOrderTest() {
        Tree.Node<Integer> rootNode = integerBinaryTree.root();
        assertNotNull(rootNode);
        assertEquals(6, rootNode.data());
        integerBinaryTree.traversePreOrder(rootNode);
    }

    @Test
    void traverseInOrderTest() {
        Tree.Node<Integer> rootNode = integerBinaryTree.root();
        assertEquals(6, rootNode.data());
        integerBinaryTree.traverseInOrder(rootNode);
    }

    @Test
    void traversePostOrderTest() {
        Tree.Node<Integer> rootNode = integerBinaryTree.root();
        assertEquals(6, rootNode.data());
        integerBinaryTree.traversePostOrder(rootNode);
    }

    @Test
    void addIllegalStateExceptionTest() {
        stringBinaryTree.add("Doe");
//        assertThrows(IllegalStateException.class, );
    }
}
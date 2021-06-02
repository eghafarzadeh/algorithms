package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Elham
 * @since 6/2/2021
 */
public class InOrderTraversalTest {
    private InOrderTraversal<Integer> inOrderTraversal;

    @BeforeEach
    public void setUp() {
        inOrderTraversal = new InOrderTraversal<>();
    }

    @Test
    public void testInOrderTraversal() {
        Node<Integer> left = new Node<>(1);
        Node<Integer> right = new Node<>(3);
        Node<Integer> root = new Node<>(2, left, right);
        List<Integer> inOrderList = inOrderTraversal.inOrder(root);
        assertEquals(inOrderList.size(), 3);
        assertEquals(inOrderList.get(0), 1);
        assertEquals(inOrderList.get(1), 2);
        assertEquals(inOrderList.get(2), 3);
    }
}

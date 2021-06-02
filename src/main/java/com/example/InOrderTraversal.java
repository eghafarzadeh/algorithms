package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elham
 * @since 6/2/2021
 */
public class InOrderTraversal<T> {

    public List<T> inOrder(Node<T> root) {
        List<T> inOrderList = new ArrayList<>();
        inOrder(root, inOrderList);
        return inOrderList;
    }

    private void inOrder(Node<T> node, List<T> inOrderList) {
        if (node.left != null) {
            inOrder(node.left, inOrderList);
        }
        inOrderList.add(node.data);
        if (node.right != null) {
            inOrder(node.right, inOrderList);
        }
    }
}

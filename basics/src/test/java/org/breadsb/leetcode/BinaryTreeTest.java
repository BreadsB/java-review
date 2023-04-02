package org.breadsb.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    BinaryTree binaryTree = new BinaryTree();

    @Test
    void test1() {
        BinaryTree.TreeNode node3 = new BinaryTree.TreeNode(11);
        BinaryTree.TreeNode node2 = new BinaryTree.TreeNode(10, null, node3);
        BinaryTree.TreeNode node1 = new BinaryTree.TreeNode(9,null, node2);
        Assertions.assertEquals(3, binaryTree.minDepth(node1));
    }

    @Test
    void test2() {
        BinaryTree.TreeNode node7 = new BinaryTree.TreeNode(6);
        BinaryTree.TreeNode node6 = new BinaryTree.TreeNode(5,null,node7);
        BinaryTree.TreeNode node5 = new BinaryTree.TreeNode(4,null,node6);
        BinaryTree.TreeNode node4 = new BinaryTree.TreeNode(3,null,node5);
        BinaryTree.TreeNode node3 = new BinaryTree.TreeNode(2,null,node4);

        Assertions.assertEquals(5, binaryTree.minDepth(node3));
    }
}

package org.breadsb.leetcode;

import com.sun.source.tree.Tree;

public class BinaryTree {
    protected static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    public int minDepth(TreeNode root) {
        if(root!=null) {
            int a = minDepth(root.left);
            int b = minDepth(root.right);
            if (a==0 || b==0) {
                return a+b+1;
            } else {
                if(a<b) {
                    return a+1;
                } else {
                    return b+1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode node3 = new TreeNode(11);
        TreeNode node2 = new TreeNode(10, null, node3);
        TreeNode node1 = new TreeNode(9,null, node2);

        System.out.println("Minimum depth: " + binaryTree.minDepth(node1));
    }
}

package com.ravi.leetcode.tree;

public class UnivaluedTree {

  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public boolean isUnivalTree(TreeNode root) {
    if(root == null) return true;
    if(root.left != null && root.val != root.left.val) return false;
    if(root.right != null && root.val != root.right.val) return false;
    return isUnivalTree(root.left) && isUnivalTree(root.right);
  }

  public static void main(String args[]) {
    UnivaluedTree ut = new UnivaluedTree();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    System.out.println(ut.isUnivalTree(root));
  }

}

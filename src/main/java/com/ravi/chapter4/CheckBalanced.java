package com.ravi.chapter4;


/*
 * A balanced tree is a tree such that the heights of the two subtrees of any
 * node never differ by more than one
 */
public class CheckBalanced {

  public boolean isBalanced(TreeNode root) {
    if(root==null) return true;
    int heightDiff = Math.abs(height(root.left) - height(root.right));
    if(heightDiff>1) {
      return false;
    } else {
      return isBalanced(root.left) && isBalanced(root.right);
    }
  }

  private int height(TreeNode root) {
    if(root == null) return 0;
    return Math.max(height(root.right), height(root.left)) + 1;
  }

}

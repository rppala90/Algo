package com.ravi.chapter4;

/*
 * Validate binary tree is BST.
 */

public class ValidateBST {

  public boolean isBST(TreeNode root) {
    return isBST(root, null, null);
  }

  private boolean isBST(TreeNode root, Integer min, Integer max) {
    if(root == null) return true;
    if(min != null && root.data < min) return false;
    if(max != null && root.data > max) return false;
    return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
  }

}
package com.ravi.chapter4;

/*
 * Return in-order successor
 * Node has link to parent.
 */
public class Successor {

  class TreeNode  extends com.ravi.chapter4.TreeNode {
    TreeNode parent;
  }

  public com.ravi.chapter4.TreeNode successor(TreeNode input) {
    if(input == null) return null;
    if(input.right != null) {
      return leftMostNode(input.right);
    } else {
      TreeNode x = input;
      TreeNode parent = x.parent;
      while(parent.left != x) {
        x = parent;
        parent = x.parent;
      }
      return parent;
    }
  }

  private com.ravi.chapter4.TreeNode leftMostNode(com.ravi.chapter4.TreeNode input) {
    if(input == null) return null;
    while(input.left != null) {
      input = input.left;
    }
    return input;
  }


}

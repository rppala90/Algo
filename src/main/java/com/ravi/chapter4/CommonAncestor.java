package com.ravi.chapter4;

/*
 * First common ancestor of two nodes in a binary tree.
 */
public class CommonAncestor {

  public TreeNode getCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
    if( root == null || node1 == null || node2 == null) return null;
    if( ! (findNode(root, node1) && findNode(root, node2))) return null;
    boolean node1OnLeft = findNode(root.left, node1);
    boolean node2OnLeft = findNode(root.left, node2);

    if(node1OnLeft == node2OnLeft) {
     if(node1OnLeft) {
       return getCommonAncestor(root.left, node1, node2);
     } else {
       return getCommonAncestor(root.right, node1, node2);
     }
    } else {
      return root;
    }
  }

  private boolean findNode(TreeNode root, TreeNode node) {
    if(root == null || node == null) return false;
    if( root.data == node.data) return true;
    return findNode(root.left, node) || findNode(root.right, node);
  }
}

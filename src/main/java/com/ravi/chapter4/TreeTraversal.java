package com.ravi.chapter4;

public class TreeTraversal {

  public static void inOrderTraversal(TreeNode root) {
    if(root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.data + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void preOrderTraversal(TreeNode root) {
    if(root != null) {
      System.out.print(root.data+ " ");
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }
  }

  public static void postOrderTraversal(TreeNode root) {
    if(root != null) {
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.data + " ");
    }
  }

}
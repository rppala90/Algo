package leetcode.Apr23.treegraph;

public class CommonAncestor {
/*
  Design an algorithm and write code to find the
    first common ancestor of two nodes in a binary tree.
  Avoid storing additional nodes in a data structure.
  NOTE: This is not necessarily a binary search tree.
 */

static class TreeNode {
  TreeNode left;
  TreeNode right;
  int val;
  TreeNode(int val) { this.val = val; }
}

private TreeNode getCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
  if(root == n1 || root == n2) return root;
  boolean on_left = exists(root.left, n1, n2);
  boolean on_right = exists(root.right, n1, n2);
  if(on_left == true && on_right == true) return root;
  if(on_left) return getCommonAncestor(root.left, n1, n2);
  return getCommonAncestor(root.right, n1, n2);
}

private boolean exists(TreeNode root, TreeNode n1, TreeNode n2) {
  if(root == null) return false;
  if(root == n1 || root == n2) return true;
  return exists(root.left, n1, n2) || exists(root.right, n1, n2);
}

public static void main(String[] args) {
  CommonAncestor ca = new CommonAncestor();
  TreeNode root = new TreeNode(1);
  root.left = new TreeNode(2);
  root.right = new TreeNode(3);
  root.left.left = new TreeNode(4);
  System.out.println(String.format("Common ancestor for nodes %s and %s is %s",
      root.left.val, root.right.val, ca.getCommonAncestor(root, root.left, root.right).val));
  System.out.println(String.format("Common ancestor for nodes %s and %s is %s",
      root.left.left.val, root.left.val,
      ca.getCommonAncestor(root, root.left.left, root.left).val));
}

}

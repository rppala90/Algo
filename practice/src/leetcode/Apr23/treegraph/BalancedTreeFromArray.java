package leetcode.Apr23.treegraph;

public class BalancedTreeFromArray {
  /*Given a sorted (increasing order) array,
  write an algorithm to create a binary tree with minimal height.*/

  static class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) { this.val = val; }
  }

  private TreeNode treeFromArray(int[] input, int left, int right) {
    if(left > right) return null;
    int mid = (left+right) / 2;
    TreeNode root = new TreeNode(input[mid]);
    root.left = treeFromArray(input, left, mid-1);
    root.right = treeFromArray(input, mid+1, right);
    return root;
  }

  public static void main(String[] args) {
    BalancedTreeFromArray ba = new BalancedTreeFromArray();
    int[] input = {1,2,3,4,5,6};
    TreeNode root = ba.treeFromArray(input, 0, input.length-1);
    printTree(root);
  }

  private static void printTree(TreeNode root) {
    if(root == null) return;
    printTree(root.left);
    System.out.println(root.val);
    printTree(root.right);
  }

}

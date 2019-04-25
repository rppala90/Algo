package leetcode.Apr23.treegraph;

public class BalanceCheck {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
  }

  private int height(TreeNode root) {
    if(root == null) return 0;
    return 1 + Math.max(height(root.left), height(root.right));
  }

  private boolean isBalanced(TreeNode root) {
    if(root == null) return true;
    return Math.abs(height(root.left) - height(root.right)) <= 1;
  }

  public static void main(String[] args) {
    BalanceCheck bc = new BalanceCheck();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    System.out.println("Tree is balanced : ? " + bc.isBalanced(root));
  }

}

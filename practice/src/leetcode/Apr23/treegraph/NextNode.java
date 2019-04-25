package leetcode.Apr23.treegraph;

public class NextNode {

  static class TreeNode{
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    int val;
    TreeNode(int val) { this.val = val;}
  }

  public static void main(String[] args) {
    NextNode nn = new NextNode();
    TreeNode root = new TreeNode(5);
    TreeNode left = new TreeNode(3);
    TreeNode right = new TreeNode(8);
    left.parent = root;
    right.parent = root;
    root.left = left;
    root.right = right;
    TreeNode left_left = new TreeNode(1);
    TreeNode left_right = new TreeNode(4);
    left_right.parent = left;
    left_left.parent = left;
    left.left = left_left;
    left.right = left_right;
    TreeNode right_left = new TreeNode(6);
    TreeNode right_right = new TreeNode(9);
    right_left.parent = right;
    right_right.parent = right;
    right.right = right_right;
    right.left = right_left;
    System.out.println(String.format("Next node of %s is %s",
        left.val, nn.getNextNode(left).val));
    System.out.println(String.format("Next node of %s is %s",
        root.val, nn.getNextNode(root).val));
    System.out.println(String.format("Next node of %s is %s",
        left_left.val, nn.getNextNode(left_left).val));
  }

  private TreeNode getNextNode(TreeNode input) {
    if(input==null) return null;
    if(input.right!= null) {
      return getLeftMost(input.right);
    } else {
      if(input.parent==null) return null;
      if(input.parent != null) {
        if(input.parent.left == input) {
          return input.parent;
        } else if(input.parent.right == input){
          return getNextNode(input.parent);
        }
      }
    }
    return null;
  }

  private TreeNode getLeftMost(TreeNode input) {
    TreeNode current = input;
    while(current.left != null) {
      current = current.left;
    }
    return current;
  }

}

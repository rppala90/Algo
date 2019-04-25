package leetcode.Apr23.treegraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListNodesAllLevels {

  static class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) { this.val = val; }
  }

  private List<LinkedList<TreeNode>> getListOfAllLevels(TreeNode root) {
    TreeNode current = root;
    Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
    currentLevel.add(current);
    List<LinkedList<TreeNode>> output = new LinkedList<LinkedList<TreeNode>>();
    while(!currentLevel.isEmpty()) {
      LinkedList<TreeNode> levelOutput = new LinkedList<TreeNode>();
      while(!currentLevel.isEmpty()) {
        TreeNode node = currentLevel.remove();
        levelOutput.add(node);
      }
      output.add(levelOutput);
      for(TreeNode n: levelOutput) {
        if(n.left != null) currentLevel.add(n.left);
        if(n.right != null) currentLevel.add(n.right);
      }
    }
    return output;
  }

  public static void main(String[] args) {
    ListNodesAllLevels allLevels = new ListNodesAllLevels();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    root.left.left.right = new TreeNode(8);
    List<LinkedList<TreeNode>> output = allLevels.getListOfAllLevels(root);
    printTree(output);
  }

  private static void printTree(List<LinkedList<TreeNode>> input) {
    for(LinkedList<TreeNode> level: input) {
      for(TreeNode n: level) {
        System.out.print(n.val + "---");
      }
      System.out.println();
    }
  }

}

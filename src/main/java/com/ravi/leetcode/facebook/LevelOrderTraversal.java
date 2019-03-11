package com.ravi.leetcode.facebook;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> temp = new LinkedList<TreeNode>();
    List<List<Integer>> levels = new LinkedList<List<Integer>>();
    if(root == null) return levels;
    temp.add(root);
    while( ! temp.isEmpty() ) {
      List<Integer> level = new LinkedList<Integer>();
      Queue<TreeNode> previousLevel = new LinkedList<TreeNode>();
      while( ! temp.isEmpty() ) {
        if(temp.peek() != null)  previousLevel.add(temp.remove());
      }
      while(! previousLevel.isEmpty()) {
        TreeNode current = previousLevel.remove();
        level.add(current.val);
        if(current.left != null) temp.add(current.left);
        if(current.right != null) temp.add(current.right);
      }
      levels.add(level);
    }
    return levels;
  }

  static class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    public void setVal(int val) { this.val = val;}
  }

}
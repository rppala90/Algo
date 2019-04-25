package com.ravi.leetcode.tree;

import apple.laf.JRSUIUtils.Tree;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinary {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  private int getHeight(TreeNode root) {
    if(root == null) return 0;
    return 1 + Math.max(getHeight(root.left), getHeight(root.right));
  }

  private List<List<String>>  solution(TreeNode root) {
   int h = getHeight(root);
   List<List<String>> ans = new LinkedList<>();
   String[][] res = new String[h][(1<<h)-1];
   fill(res, root, 0, 0, res[0].length);
   for(String[] arr: res) ans.add(Arrays.asList(arr));
   return ans;
  }

  private void fill(String[][] res, TreeNode root, int row, int l, int r) {
    if(root == null) return;
    res[row][(l+r)/2] = ""+root.val;
    fill(res, root.left, row+1, l, (l+r)/2);
    fill(res, root.right, row+1, (l+r+1)/2, r);
  }

  public static void main(String args[]) {
    PrintBinary pb = new PrintBinary();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(5);
    for(List<String> levels : pb.solution(root)) {
      for(String s: levels) {
        System.out.print(s+ " ");
      }
      System.out.println();
    }
  }

}

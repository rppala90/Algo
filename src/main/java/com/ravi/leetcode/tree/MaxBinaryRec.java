package com.ravi.leetcode.tree;

public class MaxBinaryRec {

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val;}
  }

  private int[] getMax(int[] input, int l, int r) {
    int[] output = {};
    int max = 0; // assume positive integers
    int index = -1;
    for(int i=l; i<=r; i++) {
      if(max < input[i]) {index = i; max = input[i];}
    }
    return output;
  }

  private TreeNode solution(int[] input) {
    int[] max = getMax(input, 0, input.length-1);
    TreeNode root = new TreeNode(max[0]);
    root.left = new TreeNode(getMax(input, 0, max[1]-1)[0]);
    root.right = new TreeNode(getMax(input, max[1]+1, input.length-1)[0]);
    return null;
  }

  public static void main(String args[]) {
    int[] input = {3,2,1,6,0,5};
    MaxBinaryRec mr = new MaxBinaryRec();
    mr.solution(input);
  }
}

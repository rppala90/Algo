package com.ravi.chapter4;

import com.ravi.chapter4.TreeNode;
import java.util.Arrays;

public class MinimalTree {

  public TreeNode buildTree(int[] sortedInput) {
    return buildTreeHelper(sortedInput, 0, sortedInput.length-1);
  }

  private TreeNode buildTreeHelper(int[] sortedInput, int start, int end) {
    if(start > end) return null;
    int current = (start + end) / 2;
    TreeNode root = new TreeNode();
    root.data = sortedInput[current];
    root.left = buildTreeHelper(sortedInput, start, current-1);
    root.right = buildTreeHelper(sortedInput, current+1, end);
    return root;
  }

}
package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommonAncestoreTest {

  CommonAncestor ca = new CommonAncestor();
  MinimalTree mt = new MinimalTree();

  @Test
  public void CATest() {
    int[] input = new int[10];
    for(int i=0; i<10;i++) {
      input[i] = i;
    }
    TreeNode root = mt.buildTree(input);
    TreeNode node1 = new TreeNode();
    TreeNode node2 = new TreeNode();
    node1.data = 2;
    node2.data = 8;
    assertEquals(4, ca.getCommonAncestor(root, node1, node2).data);
    node1.data = 1;
    node2.data = 0;
    assertEquals(1, ca.getCommonAncestor(root, node1, node2).data);
    node1.data = 5;
    node2.data = 8;
    assertEquals(7, ca.getCommonAncestor(root, node1, node2).data);
  }

}

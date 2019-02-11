package com.ravi.chapter4;

import org.junit.Test;

public class MinimalTreeTest {

  MinimalTree mt = new MinimalTree();
  @Test
  public void minimalTreeTest() {
    int[] input = new int[10];
    for(int i=0; i<10; i++) input[i] = i;
    TreeTraversal.inOrderTraversal(mt.buildTree(input));
  }

}

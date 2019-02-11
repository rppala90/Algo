package com.ravi.chapter4;

import org.junit.Test;
import org.junit.Assert;

public class BalancedTest {

  CheckBalanced cb = new CheckBalanced();
  MinimalTree mt = new MinimalTree();

  @Test
  public void testBalance() {
    int[] input = new int[10];
    for(int i=0; i<10; i++) input[i] = i;
    Assert.assertEquals(true, cb.isBalanced(mt.buildTree(input)));
  }

}

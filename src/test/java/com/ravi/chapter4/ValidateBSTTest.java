package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateBSTTest {

  ValidateBST vb = new ValidateBST();
  MinimalTree mt = new MinimalTree();

  @Test
  public void validateBSTTest() {
    int[] input = new int[10];
    for(int i=0; i<10; i++) input[i] = i;
    assertEquals(true, vb.isBST(mt.buildTree(input)));
    input[9] = Integer.MIN_VALUE;
    assertEquals(false, vb.isBST(mt.buildTree(input)));
  }

}

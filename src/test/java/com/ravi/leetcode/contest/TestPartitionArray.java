package com.ravi.leetcode.contest;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPartitionArray {

  @Test
  public void testSuccess() {
    PartitionArray pa = new PartitionArray();
    int[] input = {0,2,1,-6,6,-7,9,1,2,0,1};
    assertTrue(pa.canThreePartsEqualSum(input));
  }

  @Test
  public void testFailure() {
    PartitionArray pa = new PartitionArray();
    int[] input = {0,2,1,-6,6,7,9,-1,2,0,1};
    assertFalse(pa.canThreePartsEqualSum(input));
  }

  @Test
  public void testSuccess1() {
    PartitionArray pa = new PartitionArray();
    int[] input = {3,3,6,5,-2,2,5,1,-9,4};
    assertTrue(pa.canThreePartsEqualSum(input));
  }

  @Test
  public void testSuccess2() {
    PartitionArray pa = new PartitionArray();
    int[] input = {18,12,-18,18,-19,-1,10,10};
    assertTrue(pa.canThreePartsEqualSum(input));
  }
}

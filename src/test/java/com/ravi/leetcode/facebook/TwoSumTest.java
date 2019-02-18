package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TwoSumTest {

  @Test
  public void testTwoSum() {
    TwoSum ts = new TwoSum();
    int[] input = {2, 7, 11, 15};
    int[] output = ts.twoSum(input, 9);
    assertEquals(0, output[0]);
    assertEquals(1, output[1]);
  }

}

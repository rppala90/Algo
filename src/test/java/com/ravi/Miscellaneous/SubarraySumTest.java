package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class SubarraySumTest {

  @Test
  public void subArraySumTest() {
    int[] input = {1, 2, 3, 7, 5};
    int finalSum = 12;
    SubarraySum ss = new SubarraySum();
    assertEquals("2 4", ss.findConsSum(input, finalSum));
  }

  @Test
  public void subArraySumTest1() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int finalSum = 15;
    SubarraySum ss = new SubarraySum();
    assertEquals("1 5", ss.findConsSum(input, finalSum));
  }

}

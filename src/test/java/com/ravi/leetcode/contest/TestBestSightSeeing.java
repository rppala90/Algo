package com.ravi.leetcode.contest;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestBestSightSeeing {

  @Test
  public void testSuccess() {
    BestSightSeeing bs = new BestSightSeeing();
    int[] input = {8,1,5,2,6};
    assertEquals(11, bs.maxScoreSightseeingPair(input));
  }

  @Test
  public void testSuccess1() {
    BestSightSeeing bs = new BestSightSeeing();
    int[] input = {3,0,1,2,2};
    assertEquals(3, bs.maxScoreSightseeingPair(input));
  }

}

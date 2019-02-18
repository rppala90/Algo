package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class ThreeSumTest {

  @Test
  public void testThreeSum() {
    int[] input = {-1, 0, 1, 2, -1, -4};
    ThreeSum ts = new ThreeSum();
    ts.threeSum(input).forEach((x) -> {
      x.forEach((y)->System.out.print(y+ " ")); System.out.println();});
    assertEquals(2, ts.threeSum(input).size());
  }

}

package com.ravi.leetcode.contest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SmallestIntTest {

  /*@Test
  public void testSuccess() {
    smallestInteger si = new smallestInteger();
    assertTrue(si.smallestRepunitDivByK(1) == 1);
  }

  @Test
  public void testFailure() {
    smallestInteger si = new smallestInteger();
    assertTrue(si.smallestRepunitDivByK(2) == -1);
  }

  @Test
  public void testSuccess1() {
    smallestInteger si = new smallestInteger();
    assertTrue(si.smallestRepunitDivByK(3) == 3);
  }*/

  @Test
  public void testSuccess2() {
    smallestInteger si = new smallestInteger();
    System.out.println(si.smallestRepunitDivByK(17));
    assertTrue(si.smallestRepunitDivByK(17) == 16);
  }

}

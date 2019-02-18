package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class SortedArrayDupTest {

  @Test
  public void sortedArrDupTest() {
    int[] input = {1,1,2,3,4,5};
    SortedArrayDup sd = new SortedArrayDup();
    assertEquals(5, sd.removeDuplicates(input));
    assertEquals(true, str(input).startsWith("12345"));
  }

  @Test
  public void sortedArrDupTest1() {
    int[] input = {1,1,2,2,2,3,4};
    SortedArrayDup sd = new SortedArrayDup();
    assertEquals(4, sd.removeDuplicates(input));
    assertEquals(true, str(input).startsWith("1234"));
  }

  private String str(int[] input) {
    StringBuilder output = new StringBuilder();
    for(int i: input) output.append(i);
    return output.toString();
  }

}

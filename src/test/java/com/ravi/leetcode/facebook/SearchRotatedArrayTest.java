package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class SearchRotatedArrayTest {

  @Test
  public void searchRotatedArrayTest() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    SearchRotatedArray sra = new SearchRotatedArray();
    assertEquals(4, sra.search(nums, target));
  }

  @Test
  public void searchRotatedArrayTest2() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 3;
    SearchRotatedArray sra = new SearchRotatedArray();
    assertEquals(-1, sra.search(nums, target));
  }

  @Test
  public void searchRotatedArrayTest3() {
    int[] nums = {9,1};
    int target = 9;
    SearchRotatedArray sra = new SearchRotatedArray();
    assertEquals(0, sra.search(nums, target));
  }

  @Test
  public void searchRotatedArrayTest4() {
    int[] nums = {};
    int target = 9;
    SearchRotatedArray sra = new SearchRotatedArray();
    assertEquals(-1, sra.search(nums, target));
  }

  @Test
  public void searchRotatedArrayTest5() {
    int[] nums = {9,1};
    int target = 1;
    SearchRotatedArray sra = new SearchRotatedArray();
    assertEquals(1, sra.search(nums, target));
  }
}

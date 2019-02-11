package com.ravi.Miscellaneous;


import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

  @Test
  public void longestIncrSubSeqTest() {
    //int n = 16;
    //int[] i = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
    int n = 83;
    int[] i = {86,177,115,193,135,186,92,49,21,162,27,90,59,163,126,140,26,172,136,11,168,167,29,182,130,62,123,67,135,129,2,22,58,69,167,193,56,11,42,29,173,21,119,184,137,198,124,115,170,13,126,91,180,156,73,62,170,196,81,105,125,84,127,136,105,46,129,113,57,124,95,182,145,14,167,34,164,43,150,87,8,76,178};
    LongestIncreasingSubsequence ls = new LongestIncreasingSubsequence();
    assertEquals(15, ls.longestSubsequence(n, i));
  }

}

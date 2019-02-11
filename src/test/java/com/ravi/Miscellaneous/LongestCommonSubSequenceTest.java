package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LongestCommonSubSequenceTest {

  @Test
  public void lcsTest() {
    LongestCommonSubSequence lcs = new LongestCommonSubSequence();
    assertEquals(3, lcs.lcs("aabfed".toCharArray(), "acdkfd".toCharArray()));
  }

}
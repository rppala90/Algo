package com.ravi.leetcode;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestLongestPalindrome {

  @Test
  public void tesPalindrome() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("aba", lp.longestPalindrome("abade"));
  }

  @Test
  public void tesPalindrome1() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("bb", lp.longestPalindrome("cbbd"));
  }

  @Test
  public void tesPalindrome2() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("a", lp.longestPalindrome("a"));
  }

  @Test
  public void tesPalindrome3() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("abcba", lp.longestPalindrome("abcba"));
  }

  @Test
  public void tesPalindrome4() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("a", lp.longestPalindrome("abcda"));
  }

  @Test
  public void tesPalindrome5() {
    LongestPalindrome lp = new LongestPalindrome();
    assertEquals("aa", lp.longestPalindrome("aacdefcaa"));
  }

}

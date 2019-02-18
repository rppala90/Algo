package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class StrstrTest {

  @Test
  public void testStrstr() {
    StrStr ss = new StrStr();
    assertEquals(2, ss.strStr("hello", "ll"));
  }

  @Test
  public void testStrstr1() {
    StrStr ss = new StrStr();
    assertEquals(-1, ss.strStr("aaaaa", "bba"));
  }

  @Test
  public void testStrstr2() {
    StrStr ss = new StrStr();
    assertEquals(0, ss.strStr("a", "a"));
  }

  @Test
  public void testStrstr3() {
    StrStr ss = new StrStr();
    assertEquals(4, ss.strStr("mississippi", "issip"));
  }

}

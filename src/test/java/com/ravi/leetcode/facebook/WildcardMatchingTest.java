package com.ravi.leetcode.facebook;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WildcardMatchingTest {

  @Test
  public void testmatch() {
    WildcardMatching wm = new WildcardMatching();
    assertFalse(wm.isMatch("aa", "a"));
    assertTrue(wm.isMatch("aa", "*"));
    assertFalse(wm.isMatch("cb", "?a"));
    assertTrue(wm.isMatch("adceb", "*a*b"));
    assertFalse(wm.isMatch("acdcb", "a*c?b"));
    assertFalse(wm.isMatch("mississippi", "m??*ss*?i*pi"));
    assertTrue(wm.isMatch("ab", "?*"));
    assertFalse(wm.isMatch("a", "aa"));
    assertTrue(wm.isMatch("c", "*?*"));
    assertFalse(wm.isMatch("b", "?*?"));
    assertTrue(wm.isMatch("ho", "**ho"));
  }

}
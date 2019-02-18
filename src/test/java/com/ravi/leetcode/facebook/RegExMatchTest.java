package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class RegExMatchTest {

  @Test
  public void testRegEx() {
    RegExMatch rm = new RegExMatch();
    assertEquals(false, rm.isMatch_recursion("aa", "a"));
  }

  @Test
  public void testRegEx1() {
    RegExMatch rm = new RegExMatch();
    assertEquals(true, rm.isMatch_recursion("aa", "a*"));
  }

  @Test
  public void testRegEx2() {
    RegExMatch rm = new RegExMatch();
    assertEquals(true, rm.isMatch_recursion("abcdefgh", ".*"));
  }

  @Test
  public void testRegEx3() {
    RegExMatch rm = new RegExMatch();
    assertEquals(true, rm.isMatch_recursion("aab", "c*a*b"));
  }

  @Test
  public void testRegEx4() {
    RegExMatch rm = new RegExMatch();
    assertEquals(false, rm.isMatch_recursion("mississippi", "mis*is*p*."));
  }

}

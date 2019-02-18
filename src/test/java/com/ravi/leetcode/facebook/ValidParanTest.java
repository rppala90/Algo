package com.ravi.leetcode.facebook;

import junit.framework.TestCase;
import org.junit.Test;

public class ValidParanTest {

  @Test
  public void testParan() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(true, vp.isValid("()"));
  }

  @Test
  public void testParan1() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(true, vp.isValid("()[]{}"));
  }

  @Test
  public void testParan2() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(false, vp.isValid("(]"));
  }

  @Test
  public void testParan3() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(false, vp.isValid("([)]"));
  }

  @Test
  public void testParan4() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(true, vp.isValid("{[]}"));
  }

  @Test
  public void testParan5() {
    ValidParan vp = new ValidParan();
    TestCase.assertEquals(false, vp.isValid("["));
  }

}

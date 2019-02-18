package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

  @Test
  public void testRomanToInteger() {
    RomanToInteger ri = new RomanToInteger();
    assertEquals(3, ri.romanToInt("III"));
  }

  @Test
  public void testRomanToInteger1() {
    RomanToInteger ri = new RomanToInteger();
    assertEquals(4, ri.romanToInt("IV"));
  }

  @Test
  public void testRomanToInteger2() {
    RomanToInteger ri = new RomanToInteger();
    assertEquals(9, ri.romanToInt("IX"));
  }

  @Test
  public void testRomanToInteger3() {
    RomanToInteger ri = new RomanToInteger();
    assertEquals(58, ri.romanToInt("LVIII"));
  }

  @Test
  public void testRomanToInteger4() {
    RomanToInteger ri = new RomanToInteger();
    assertEquals(1994, ri.romanToInt("MCMXCIV"));
  }

}

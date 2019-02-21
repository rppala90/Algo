package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MultipleStringsTest {

  @Test
  public void testMultipleStringsTest() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("56088", ms.multiply("123", "456"));
  }

  @Test
  public void testMultipleStringsTest2() {
    MultiplyStrings ms = new MultiplyStrings();
      assertEquals("6", ms.multiply("2", "3"));
  }

  @Test
  public void testMultipleStringsTest3() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("0", ms.multiply("234", "0"));
  }

  @Test
  public void testMultipleStringsTest4() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("0", ms.multiply("9133", "0"));
  }
}

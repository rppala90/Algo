package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class CountSayTest {

  @Test
  public void countSayTest() {
    CountSay cs = new CountSay();
    assertEquals("1", cs.countAndSay(1));
  }

  @Test
  public void countSayTest1() {
    CountSay cs = new CountSay();
    assertEquals("1211", cs.countAndSay(4));
  }

  @Test
  public void countSayTest2() {
    CountSay cs = new CountSay();
    assertEquals("111221", cs.countAndSay(5));
  }

}

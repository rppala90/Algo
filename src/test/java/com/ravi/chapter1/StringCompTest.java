package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompTest {

  StringComp sc = new StringComp();

  @Test
  public void compareStringTest() {
    assertEquals("a2b1c5a3", sc.compressString("aabcccccaaa"));
    assertEquals("abcde", sc.compressString("abcde"));
  }

}

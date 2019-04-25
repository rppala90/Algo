package com.ravi.techdevguide.google;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestLongestWord {

  @Test
  public void testLongestWord() {
    LongestWord lw = new LongestWord();
    String[] words = {"able", "ale", "apple", "bale", "kangaroo"};
    assertEquals("apple", lw.findLongestWordInString("abppplee", words));
  }

}
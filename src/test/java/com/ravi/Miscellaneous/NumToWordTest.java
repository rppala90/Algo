package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class NumToWordTest {

  @Test
  public void testNum99() {
    NumToWord nw = new NumToWord();
    assertEquals(nw.numToWord(99), "ninety-nine");
  }

  @Test
  public void testNum15() {
    NumToWord nw = new NumToWord();
    assertEquals(nw.numToWord(15), "fifteen");
  }

}

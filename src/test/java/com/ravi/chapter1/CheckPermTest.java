package com.ravi.chapter1;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class CheckPermTest {

  CheckPerm cp = new CheckPerm();

  @Test
  public void checkPerm() {
    assertEquals(true, cp.checkPermutation("dog", "god"));
  }

  @Test
  public void checkPermFalse() {
    assertEquals(false, cp.checkPermutation("dog", "goD"));
  }

}
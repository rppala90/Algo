package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringRotateTest {

  StringRotate sr = new StringRotate();
  @Test
  public void stringRotateTest() {
    assertEquals(sr.isRotate("erbottlewat", "waterbottle"), true);
  }

}

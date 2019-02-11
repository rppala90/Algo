package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlainPermTest {

  PalinPerm pp = new PalinPerm();

  @Test
  public void isPalinPerm() {
    assertEquals(true, pp.isPalinPerm("Tact coa"));
  }
}

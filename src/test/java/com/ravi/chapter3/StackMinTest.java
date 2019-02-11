package com.ravi.chapter3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackMinTest {

  StackMin sm = new StackMin();

  @Test
  public void minTest() {
    sm.push(5);
    sm.push(3);
    sm.push(10);
    assertEquals(3, sm.min());
    sm.pop();
    assertEquals(3, sm.min());
    sm.pop();
    assertEquals(5, sm.min());
  }

}

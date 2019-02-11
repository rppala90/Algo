package com.ravi.chapter3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetOfStacksTest {

  SetOfStacks ss = new SetOfStacks();

  @Test
  public void testSetOfStacks() {
    int size = 38;
    for(int i=0; i<size; i++) {
      ss.push(i);
    }
    assertEquals(4, ss.stacks.size());
    for(int i=0; i<3; i++) {
      assertEquals(size-i-1, ss.pop().intValue());
    }
    assertEquals(3, ss.stacks.size());
  }

}

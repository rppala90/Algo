package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsUniqueTest {

  IsUnique iu = new IsUnique();

  @Test
  public void testUnique() {
    assertEquals(true, iu.isUnique("abcde"));
  }

  @Test
  public void testUniqueFalse() {
    assertEquals(false, iu.isUnique("abcdea"));
  }

}
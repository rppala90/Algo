package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OneAwayTest {

  OneAway oa = new OneAway();
  @Test
  public void oneAwayTest() {
    assertEquals(oa.oneAway("pale", "ple"), true);
    assertEquals(oa.oneAway("ple", "pale"), true);
    assertEquals(oa.oneAway("ple", "ple"), true);
    assertEquals(oa.oneAway("pales", "pale"), true);
    assertEquals(oa.oneAway("pale", "bale"), true);
    assertEquals(oa.oneAway("pale", "bake"), false);
  }

}

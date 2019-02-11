package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {

  URLify u = new URLify();

  @Test
  public void testURLify() {
    assertEquals("Mr%20sJohn%20sSmith", u.urlIFY("Mr John Smith      ", 13));
  }

}

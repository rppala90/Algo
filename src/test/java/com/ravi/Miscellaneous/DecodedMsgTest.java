package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class DecodedMsgTest {

  @Test
  public void decodeMsgTest() {
    DecodeMsg dm = new DecodeMsg();
    assertEquals(3, dm.decoded(3, "123"));
  }

  @Test
  public void decodeMsgTest1() {
    DecodeMsg dm = new DecodeMsg();
    assertEquals(2, dm.decoded(4, "2563"));
  }

  @Test
  public void decodeMsgTest2() {
    DecodeMsg dm = new DecodeMsg();
    assertEquals(4, dm.decoded(11, "23759228973"));
  }

}

package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MultiplyStringsTest {

  /*@Test
  public void testMulitply() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("66", ms.multiply("33", "2"));
  }

  @Test
  public void testMulitply1() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("253", ms.multiply("11", "23"));
  }

  @Test
  public void testMulitply2() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("56088", ms.multiply("123", "456"));
  }*/

  @Test
  public void testMulitply3() {
    MultiplyStrings ms = new MultiplyStrings();
    assertEquals("2138513236050659684899247596343622586665960432905633868279280553999581331028904457156351582503310945796477", ms.multiply("4249994981639334615617229281247863772372537681364035850998024901200639083873", "00503180179103594846929030337949"));
  }

}

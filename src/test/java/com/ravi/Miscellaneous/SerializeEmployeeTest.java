package com.ravi.Miscellaneous;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SerializeEmployeeTest {

  SerializeEmployee se = new SerializeEmployee();

  @Test
  public void testSerialize() {
    assertEquals("Ravi", se.serializeEmployee());
  }

}

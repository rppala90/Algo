package com.ravi.Miscellaneous;

import org.junit.Test;

public class TestStringPermutations {

  @Test
  public void test3charString() {
    StringPermutations sp = new StringPermutations();
    for(String s: sp.stringPermutate("abc")) {
      System.out.print(s+ " ");
    }
  }

}

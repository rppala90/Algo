package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import java.util.List;
import org.junit.Test;

public class LongestFibonacciTest {

  @Test
  public void longFibTest() {
    LongestFibonacci lf = new LongestFibonacci();
    int[] input = {1, 4, 3, 9, 10, 13, 7};
    List<Integer> output = lf.getLongestFinonacci(input);
    assertEquals(1, (int)output.get(0));
    assertEquals(3, (int)output.get(1));
    assertEquals(13, (int)output.get(2));
  }

}

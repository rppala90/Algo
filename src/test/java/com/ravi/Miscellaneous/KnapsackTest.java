package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class KnapsackTest {

  @Test
  public void testKnapsack() {
    Knapsack k = new Knapsack();
    int wt[] = {4,5,1};
    int val[] = {1,2,3};
    assertEquals(3, k.knapsackValue(4, 3, wt, val));
  }

}

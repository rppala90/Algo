package com.ravi.Miscellaneous;

/*
 * This class tests SortArrays class that is used to sort arrays
 *  based on price per unit in the knapsack problem.
 */

import com.ravi.Miscellaneous.SortArrays.Item;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

public class SortArraysTest {

  @Test
  public void testSortArrays() {
    int[] prices = {60, 1000, 120};
    int[] weights = {10, 20 ,30};
    SortArrays sa = new SortArrays(weights, prices);
    sa.basedOnPricePerUnit();
    for(Item i: sa.getItems()) {
      System.out.println(i.number);
    }
  }

  @Test
  public void testArrayssort() {
    Integer[] prices = {60, 1000, 120};
    Arrays.sort(prices, Collections.reverseOrder());
    for(int i: prices) {
      System.out.print(i+" ");
    }
    System.out.println();
  }

}

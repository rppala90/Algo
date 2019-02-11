package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class FindPairsTest {

  @Test
  public void findPairsTest1() {
    int[] first = {1,2,4,5,7};
    int[] second = {5,6,3,4,8};
    int Sum = 9;
    FindPairs fp = new FindPairs();
    assertEquals("1 8, 4 5, 5 4", fp.findPairs(first, second, Sum));
  }

  @Test
  public void findPairsTest2() {
    int[] first = {0,2};
    int[] second = {1,3};
    int Sum = 3;
    FindPairs fp = new FindPairs();
    assertEquals("0 3, 2 1", fp.findPairs(first, second, Sum));
  }

  @Test
  public void findPairsTest3() {
    int[] first = {-1, 5, -8, -10, 11, -16, 20, -22, -26, -28, -30, -36, 40, 43, -44, -46, 61, -65, 68, 78, -99};
    int[] second = {0, -1, 4, 5, 6, 7, 9, 10, 11, -12, -13, -18, 19, 20, -21, 22, -24, 26, -27, 28, -30, 31, 33, -36, -37, 39, 40, -42, 45, 48, 50, -52, -55,-56, 58, 59, -60, 62, 63, -66, -67, 68, 69, 71, 72, -73, 76, -79, -81, -84, 87, 90, -94, 95, 96, 99};
    int Sum = 52;
    FindPairs fp = new FindPairs();
    assertEquals("-44 96, -16 68, -10 62, 43 9", fp.findPairs(first, second, Sum));
  }

}

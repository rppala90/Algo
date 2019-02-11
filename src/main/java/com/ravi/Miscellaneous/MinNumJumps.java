package com.ravi.Miscellaneous;

import java.util.Arrays;
import java.util.HashMap;

public class MinNumJumps {

  private int minSteps(int[] data, int start) {
    int curInd = start;
    if(data.length == 1) return 0;
    int nextPos = curInd + data[curInd];
    int maxData = 0, maxInd = 0;
    while(nextPos > curInd) {
      if(nextPos >= data.length-1) return 1;
      if(data[nextPos] == 0) { nextPos--; continue; }
      if(nextPos + data[nextPos] > maxData) {
        maxData = nextPos + data[nextPos];
        maxInd = nextPos;
      }
      nextPos--;
    }
    return 1 + minSteps(data, maxInd);
  }

  public int minSteps(int[] input) {
    return minSteps(input, 0);
  }


}
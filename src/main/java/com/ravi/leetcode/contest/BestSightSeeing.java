package com.ravi.leetcode.contest;

public class BestSightSeeing {

  public int maxScoreSightseeingPair(int[] A) {
      int res = Integer.MIN_VALUE, cur = 0;
      for(int i=0; i<A.length;i++) {
        res = Math.max(res, cur + A[i]);
        cur = Math.max(cur, A[i]) - 1;
      }
      return res;
  }

}
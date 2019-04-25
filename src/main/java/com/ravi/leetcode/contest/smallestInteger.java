package com.ravi.leetcode.contest;

import java.math.BigInteger;

public class smallestInteger {

  // Based on ( A * B  + C) % N = (A%N * B%N + C%N ) % N
  public int smallestRepunitDivByK(int K) {
    for(int i=1,val=1; i<=K; i++){
      if(val % K == 0) return i;
      System.out.println(val*10 + 1);
      val = (val*10 + 1)%K;
    }
    return -1;
  }

}

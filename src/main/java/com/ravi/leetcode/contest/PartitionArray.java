package com.ravi.leetcode.contest;

public class PartitionArray {

  public boolean canThreePartsEqualSum(int[] A) {
      int totalSum = 0;
      for(int i: A) {
        totalSum += i;
      }
      if(totalSum %3 != 0) return false;
      int checkSum = totalSum / 3;
      int sum = 0,j = 0;
      for(int i=0; i<A.length; i++,j++) {
        sum += A[i];
        if(sum == checkSum) break;
      }
      System.out.println(j);
      sum = 0;
      for(j=j+1;j<A.length;j++) {
        sum += A[j];
        if(sum == checkSum) break;
      }
      System.out.println(j);
      if(j<A.length-1) return true;
      return false;
  }

}

package com.ravi.leetcode.facebook;

public class TEst{


  private static void get4groups(int i, int[] group) {
    if( i < 4) {
      for(int j=1; j<=i; j++) {
        group[j-1]++;
      }
      return;
    }
    int quotient = i / 4;
    int remainder = i % 4;
    for(int j=0; j< 4; j++) group[j] += quotient;
    get4groups(remainder, group);
  }


  public static void main(String args[]) {
    int[] group = new int[4];
    get4groups(12156, group);
    for(int i: group) {
      System.out.println(i);
    }
  }

}
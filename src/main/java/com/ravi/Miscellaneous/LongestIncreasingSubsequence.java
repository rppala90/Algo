package com.ravi.Miscellaneous;

import java.util.Scanner;

/*
 *  Longest Increasing SubSequence.
 *  https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0/?ref=self
 */
public class LongestIncreasingSubsequence {

    public int longestSubsequence(int n, int input[]) {
      int dp[] = new int[n];
      dp[0] = 1;
      int maxans = 1;
      for(int i=0; i<n; i++) {
        int maxval = 0;
        for(int j=0; j<i; j++) {
          if(input[i] > input[j]) {
            maxval = Math.max(maxval, dp[j]);
          }
        }
        dp[i] = maxval+1;
        maxans = Math.max(maxans, dp[i]);
      }
      return maxans;
    }
}

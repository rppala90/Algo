package com.ravi.Miscellaneous;

import java.util.Scanner;

public class Knapsack {

  public int knapsackValue(int W, int N, int[] wt, int[] v) {
    int[][] val = new int[N+1][W+1];
    for(int i=0; i<=N; i++) {
      val[0][i] = 0;
      val[i][0] = 0;
    }
    int maxVal = 0;
    for(int i=1; i<= N; i++) {
      for(int j=1; j<= W; j++) {
        if(wt[i-1] > j) {
          val[i][j] = val[i-1][j];
        } else {
          val[i][j] = Math.max(val[i-1][j], v[i-1]+val[i-1][j-wt[i-1]]);
        }
        if(val[i][j] > maxVal) maxVal = val[i][j];
      }
    }
    return maxVal;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int numCases = s.nextInt();
    Knapsack ks = new Knapsack();
    for(int i=0; i<numCases; i++) {
      int N = s.nextInt();
      int W = s.nextInt();
      int[] wt = new int[N];
      int[] v = new int[N];
      for(int j=0; j<N; j++) wt[j] = s.nextInt();
      for(int j=0; j<N; j++) v[i] = s.nextInt();
      System.out.println(ks.knapsackValue(W, N, wt, v));
    }
  }

}

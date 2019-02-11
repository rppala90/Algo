package com.ravi.Miscellaneous;

import java.util.Scanner;

public class LongestCommonSubSequence {

  public int lcs(char[] str1, char[] str2) {
    int[][] mem = new int[str1.length+1][str2.length+1];
    for(int i=0; i<=str1.length;i++) mem[i][0] = 0;
    for(int i=0; i<=str2.length;i++) mem[0][i] = 0;
    int maxVal = 0;
    for(int i=1; i<=str1.length; i++) {
      for(int j=1; j<=str2.length; j++) {
        if(str1[i-1] == str2[j-1]) {
          mem[i][j] = mem[i-1][j-1] + 1;
        } else {
          mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
        }
        if(mem[i][j] > maxVal) maxVal = mem[i][j];
      }
    }
    return maxVal;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numCases = s.nextInt();
    LongestCommonSubSequence lcs = new LongestCommonSubSequence();
    for(int i=0; i<numCases; i++) {
      int len1 = s.nextInt();
      int len2 = s.nextInt();
      String str1 = s.next();
      String str2 = s.next();
      System.out.println(lcs.lcs(str1.toCharArray(), str2.toCharArray()));
    }
  }

}

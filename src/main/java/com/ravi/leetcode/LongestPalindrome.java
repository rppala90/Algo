package com.ravi.leetcode;

/*
 * Dynamic Programming
 */
public class LongestPalindrome {

  public String longestPalindrome(String s) {
    int max = 1;
    String maxString = "";
    int[][] memo = new int[s.length()+1][s.length()+1];
    for(int i=1; i<=s.length(); i++) {
      memo[i][i] = 1;
      maxString = s.substring(i-1, i);
    }
    for(int i=1; i<=s.length()-1; i++) {
      if(s.charAt(i-1)==s.charAt(i))  {
        memo[i][i+1] = 2;
        max = 2;
        maxString = s.substring(i-1, i+1);
      }
    }
    for(int i=s.length()-1; i>=1; i--) {
      for(int j=i+2; j<=s.length();j++) {
        if(s.charAt(i-1) == s.charAt(j-1) &&
           memo[i+1][j-1] > 0 ) {
          memo[i][j] = memo[i+1][j-1] + 2;
          if(memo[i][j] > max) {
            max = memo[i][j];
            maxString = s.substring(j-max,j);
          }
        }
      }
    }
    return maxString;
  }

  public static void main(String[] a) {
    LongestPalindrome lp = new LongestPalindrome();
    System.out.println(lp.longestPalindrome("lkjhgbnmlkjhgbnm"));
  }

}

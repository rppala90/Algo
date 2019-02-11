package com.ravi.Miscellaneous;

public class KPalindrome {

  public boolean is_k_palin(String str, int N) {
    int p_len = longestPalindromeSubSequence(str);
    return str.length() - p_len <= N;
  }

  private int longestPalindromeSubSequence(String str) {
    int n = str.length();
    int[][] cache = new int[str.length()][str.length()];
    for(int i=0; i<n; i++) cache[i][i] = 1;
    for(int offset = 1; offset < n; offset++) {
      for(int i=0; i<=n-offset-1; i++) {
        if(str.charAt(i) == str.charAt(i+offset)) {
          cache[i][i+offset] = cache[i+1][i+offset-1] + 2;
        } else {
          cache[i][i+offset] = Math.max(cache[i][i+offset-1], cache[i+1][i+offset]);
        }
      }
    }
    return cache[0][n-1];
  }

}

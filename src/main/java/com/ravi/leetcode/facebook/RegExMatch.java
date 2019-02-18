package com.ravi.leetcode.facebook;

public class RegExMatch {

  /** Recursion to Memoization ( Top-Down approach: 0 to n && Bottom-Up approach: sub-problem) **/
  public boolean isMatch_recursion(String s, String p) {
    int s_len = s.length(), p_len = p.length();
    if(p_len == 0) return s_len==0;
    boolean firstMatch = s_len > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
    if(p_len > 1 && p.charAt(1) == '*') {
      return  (isMatch_recursion(s, p.substring(2))
          || (firstMatch && isMatch_recursion(s.substring(1), p)));
    } else {
      return firstMatch && isMatch_recursion(s.substring(1), p.substring(1));
    }
  }

  /* Memoization --- ???? */

}

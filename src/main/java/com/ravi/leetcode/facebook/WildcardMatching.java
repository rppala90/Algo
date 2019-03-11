package com.ravi.leetcode.facebook;

public class WildcardMatching {

    public boolean isMatch(String s, String p) {
      if (s.equals("") && p.equals("") || s.equals("") && p.equals("*"))
        return true;
      if (s.equals(""))
        return false;
      if (p.equals(""))
        return false;
      boolean[][] memo = new boolean[p.length()][s.length()];
      boolean isStar = false;
      //////
      //  First row --> [0][0] true if chars match else all false.
      //////
      if(s.charAt(0)==p.charAt(0) || p.charAt(0) == '*' || p.charAt(0)=='?') memo[0][0] = true;
      for(int j=1;j<memo[0].length;j++) if(p.charAt(0) == '*') memo[0][j] = true;
      //////
      //  First column --> true as long [i-1][0] is true and char is *
      //////
      boolean firstmatch = s.charAt(0)==p.charAt(0) || p.charAt(0)=='?';
      for(int i=1; i<memo.length; i++) {
        if(memo[i-1][0] == true) {
          if(p.charAt(i) == '*' ) {
            memo[i][0] = true;
            continue;
          }
          if(!firstmatch) {
            if(p.charAt(i-1)=='*' && (p.charAt(i) == s.charAt(0) || p.charAt(i) == '?'))
              memo[i][0] = true;
              firstmatch = true;
          }
        } else {
          break;
        }
      }
      //////
      //  Rest of the rows & columns.
      //  if (p.charAt(i) == '*' then
      //      if (memo[i-1,j-1] or memo[i-1][j] or memo[i][j-1] is true then
      //          memo[i][j] = true && rest of memo[i][j+...] = true
      //  else if(p.charAt(i) == s.charAt(j) || p.charAt(i) == '?'
      //      if(memo[i-1,j-1] is true then
      //          memo[i][j] = true
      //////
      for (int i = 1; i < memo.length; i++) {
        for (int j = 1; j < memo[0].length; j++) {
          if(p.charAt(i) == '*') {
            if(memo[i-1][j-1] || memo[i-1][j] || memo[i][j-1]) {
              memo[i][j] = true;
              for(j=j+1; j<memo[0].length;j++) memo[i][j] = true;
              break;
            }
          } else if(p.charAt(i) == s.charAt(j) || p.charAt(i) == '?') {
            if(memo[i-1][j-1]) memo[i][j] = true;
          }
        }
      }
      for (int i = 0; i < memo.length; i++) {
        for (int j = 0; j < memo[0].length; j++) {
          System.out.print(memo[i][j]+ " ");
        }
        System.out.println();
      }
      return memo[p.length() - 1][s.length() - 1];
    }

}

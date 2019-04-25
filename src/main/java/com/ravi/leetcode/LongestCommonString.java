package com.ravi.leetcode;

public class LongestCommonString {

  public String longestCommonString(String input1, String input2) {
    int row = input1.length()+1;
    int column = input2.length()+1;
    String longString = "";
    int max = 0;
    int[][] memo = new int[row][column];
    for(int i=1; i<row; i++) {
      for(int j=1; j<column; j++) {
        if(input1.charAt(i-1) == input2.charAt(j-1)) {
          memo[i][j] = 1 + memo[i-1][j-1];
          if(memo[i][j] > max) {
            max = memo[i][j];
            longString = input2.substring(j-max,j);
          }
        }
      }
    }
    return longString;
  }

  public static void main(String args[]) {
    LongestCommonString lcs = new LongestCommonString();
    System.out.println(lcs.longestCommonString("pokemon", "monpokemonmon"));
  }

}

package com.ravi.Miscellaneous;

import java.util.Scanner;

public class PalindromeNoSpaces {

  public String  isPalindrome(String input) {
    int len = input.length();
    if(len <= 1) return "YES";
    int i=0, j= len-1;
    while(input.charAt(i) == ' ') i++;
    while(input.charAt(j) == ' ') j--;
    while(input.charAt(i) == input.charAt(j) && j > i) {
      i++;
      j--;
      while(input.charAt(i) == ' ') i++;
      while(input.charAt(j) == ' ') j--;
    }
    if(i!= j) return "NO";
    return "YES";
  }

}

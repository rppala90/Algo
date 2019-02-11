package com.ravi.chapter1;

import java.util.HashMap;
import java.util.Map;

public class PalinPerm {

  public boolean isPalinPerm(String input) {
    input = input.toLowerCase();
    //Get length.
    int len = len(input);
    // If even none of chars should be odd.
    // If odd only one chat should be odd.
    int allowedOdd = 1;
    if(len %2 == 0) allowedOdd = 0;
    Map<Character, Integer> cache = new HashMap<Character, Integer>();
    for(char c: input.toCharArray()) {
      if(c==' ') continue;
      if(cache.get(c) != null) {
        cache.put(c, cache.get(c)+1);
      } else {
        cache.put(c, 1);
      }
    }

    for(int v: cache.values()) {
      if(v%2!=0) {
        allowedOdd--;
      }
      if(allowedOdd<0) return false;
    }
    return true;
  }

  //Ignore spaces
  private int len(String input) {
    int i=0;
    for(char c: input.toCharArray()) {
     if(c == ' ') continue;
     i++;
    }
    return i;
  }
}

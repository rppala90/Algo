package com.ravi.leetcode.facebook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RomanToInteger {

  public int romanToInt(String s) {
    HashMap<Character, Integer> symbols = buildSymbols();
    int ans = 0;
    int last = 0;
    for(char c: s.toCharArray()) {
      int current = symbols.get(c);
      if(current > last) {
        ans += (current - last -last);
      } else {
        ans += current;
      }
      last = current;
    }
    return ans;
  }

  private HashMap<Character, Integer> buildSymbols() {
    HashMap<Character, Integer> symbols = new HashMap<Character, Integer>();
    symbols.put('I', 1);
    symbols.put('V', 5);
    symbols.put('X', 10);
    symbols.put('L', 50);
    symbols.put('C', 100);
    symbols.put('D', 500);
    symbols.put('M', 1000);
    return symbols;
  }

}

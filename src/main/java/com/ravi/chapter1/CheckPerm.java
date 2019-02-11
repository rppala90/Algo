package com.ravi.chapter1;

/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

import java.util.HashMap;
import java.util.Map;

public class CheckPerm {

  public boolean checkPermutation(String s1, String s2) {
    Map<Character, Integer> cache = new HashMap<Character, Integer>();
    for(Character c: s1.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)+1);
      } else {
        cache.put(c, 1);
      }
    }

    for(Character c: s2.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)-1);
      } else {
        return false;
      }
    }

    for(int x: cache.values()) {
      if(x!=0) return false;
    }
    return true;
  }
}

package com.ravi.chapter1;

import java.util.HashMap;
import java.util.Map;

/*
 * Insert Char, Remove Char, Replace Char.
 * Given two strings, check if they are one or 0 edits away.
 */
public class OneAway {

  public boolean oneAway(String s1, String s2) {
    Map<Character, Integer> cache = new HashMap<Character, Integer>();
    for(char c: s1.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)+1);
      } else {
        cache.put(c, 1);
      }
    }
    boolean alreadyOneAway = false;
    for(char c: s2.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)-1);
      } else if(alreadyOneAway){
        return false;
      } else {
        alreadyOneAway = true;
      }
    }
    alreadyOneAway = false;
    for(int i: cache.values()) {
      if(i == 1 || i ==-1 ) {
        if(alreadyOneAway) {
          return false;
        } else {
          alreadyOneAway = true;
        }
      } else if(i != 0 ) {
        return false;
      }
    }
    return true;
  }
}

package com.ravi.chapter1;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/*
 * String has all unique characters or not ??
 *  a.  Using additional data structure.
 *  b.  With out additional data structure.
 */
public class IsUnique {

  public boolean isUnique(String input) {
    BitSet bs = new BitSet();
    for(char c: input.toCharArray()) {
      if(bs.get(c)) {
        return false;
      } else {
        bs.set(c);
      }
    }
    return true;
  }

}

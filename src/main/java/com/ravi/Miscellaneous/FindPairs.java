package com.ravi.Miscellaneous;

import java.util.Arrays;
import java.util.HashSet;

public class FindPairs {

  public String findPairs(int[] input1, int[] input2, int num) {
    Arrays.sort(input1);
    HashSet<Integer> cache = new HashSet<Integer>();
    for(int i=0; i < input2.length; i++) {
      cache.add(input2[i]);
    }
    StringBuilder output = new StringBuilder();
    boolean prependC = false;
    for(int i=0; i<input1.length; i++) {
      if(cache.contains(num - input1[i])) {
        if(prependC) {
          output.append(", " + input1[i] + " " +(num - input1[i]));
        } else {
          output.append(input1[i] + " " +(num - input1[i]));
          prependC = true;
        }
      }
    }
    String retVal = output.toString();
    if(retVal.isEmpty()) {
      return "-1";
    }
    return retVal;
  }

}

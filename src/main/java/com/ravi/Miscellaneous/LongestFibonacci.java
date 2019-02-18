package com.ravi.Miscellaneous;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LongestFibonacci {

  public List<Integer> getLongestFinonacci(int[] input) {
    List<Integer> output = new LinkedList<Integer>();
    HashSet<Integer> cacheFib = new HashSet<Integer>();
    int first = 0, second = 1;
    cacheFib.add(0);
    for(int i=2; i<1001; i++) {
      int current = first + second;
      cacheFib.add(current);
      first = second;
      second = current;
    }
    for(int i=0; i<input.length; i++) {
      if(cacheFib.contains(input[i])) output.add(input[i]);
    }
    return output;
  }

}

package com.ravi.Miscellaneous;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class StringPermutations {

  public Set<String> stringPermutate(String input) {
    return permutate(input);
  }

  private Set<String> permutate(String input) {
    Set<String> output = new HashSet<String>();
    Queue<String> currentLevel = new LinkedList<String>();
    currentLevel.add(input);
    for(int i=0; i< input.length(); i++) {
      Queue<String> nextLevel = new LinkedList<String>();
      while(! currentLevel.isEmpty()) {
        String current = currentLevel.remove();
        for(int j=0; j < input.length(); j++) {
          if(j==i) continue;
          for(int k=0; k<input.length(); k++) {
            if(k==i) continue;
            nextLevel.add(swap(current,j, k));
          }
        }
      }
      currentLevel = nextLevel;
    }
    for(String tmp: currentLevel) {
      output.add(tmp);
    }
    return output;
  }

  private String swap(String input, int i, int j) {
    char[] memo = input.toCharArray();
    char temp = memo[i];
    memo[i] = memo[j];
    memo[j] = temp;
    return new String(memo);
  }

}
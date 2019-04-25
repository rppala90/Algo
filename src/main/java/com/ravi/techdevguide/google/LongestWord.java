package com.ravi.techdevguide.google;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

/*
  https://techdevguide.withgoogle.com/resources/find-longest-word-in-dictionary-that-subsequence-of-given-string/?programming_languages=java#code-challenge
 */
public class LongestWord {

  public String findLongestWordInString(String input, String[] subWords) {
    HashMap<Character, List<Integer>> memo = preProcessString(input);
    Arrays.sort(subWords, new LenComparator());
    for(String temp: subWords) {
      if(isSubString(memo, temp)) return temp;
    }
    return null;
  }

  private HashMap<Character, List<Integer>> preProcessString(String input) {
    HashMap<Character, List<Integer>> memo = new HashMap<Character, List<Integer>>();
    int count = 0;
    for(char curr: input.toCharArray()) {
      if(memo.get(curr) == null)
        memo.put(curr, new LinkedList<Integer>());
      memo.get(curr).add(count++);
    }
    return memo;
  }

  private boolean isSubString(HashMap<Character, List<Integer>> memo, String word) {
    int lastIndex = -1;
    for(char curr: word.toCharArray()) {
      if(memo.get(curr) == null) return false;
      List<Integer> indexes = memo.get(curr);
      boolean forwardIndex = false;
      for(int i: indexes) {
        if(i > lastIndex) {
          forwardIndex = true;
          lastIndex = i;
          break;
        }
      }
      if(! forwardIndex) return false;
    }
    return true;
  }

  private class LenComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
      return ((String)o2).length() - ((String)o1).length();
    }
  }
}

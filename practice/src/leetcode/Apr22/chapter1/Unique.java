package leetcode.Apr22.chapter1;

import java.util.Arrays;
import java.util.HashSet;

public class Unique {
  /*
  Implement an algorithm to determine if a string has all unique characters.
  What if you can not use additional data structures?
   */

  public static void main(String[] args) {
    Unique u = new Unique();
    String input = "abcdef";
    System.out.println(String.format("%s has Unique Character ? %s", input, u.areUnique(input)));
    System.out.println(String.format("%s has Unique Character using no extra space ? %s",
        input, u.areUnique_nospace(input)));
  }

  private boolean areUnique(String input) {
    HashSet<Character> cache = new HashSet<Character>();
    for(char c: input.toCharArray()) {
      if(cache.contains(c)) return false;
      cache.add(c);
    }
    return true;
  }

  private boolean areUnique_nospace(String input) {
    char[] input_arr = input.toCharArray();
    Arrays.sort(input_arr);
    char prev_char = input_arr[0];
    for(int i = 1; i<input_arr.length-1; i++) {
      if(input_arr[i] == prev_char) return false;
    }
    return true;
  }

}

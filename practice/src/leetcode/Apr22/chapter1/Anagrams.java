package leetcode.Apr22.chapter1;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

  public static void main(String[] args) {
    Anagrams a = new Anagrams();
    String input1 = "abcde";
    String input2 = "abcd";
    System.out.println(String.format("%s and %s are anagrams ? : %s",
        input1, input2, a.isAnagram(input1, input2)));
    System.out.println(String.format("%s and %s are anagrams (using counter) ? : %s",
        input1, input2, a.isAnagram_addSpace(input1, input2)));
  }

  private boolean isAnagram(String input1, String input2) {
    char[] input1A = input1.toCharArray();
    char[] input2A = input2.toCharArray();
    Arrays.sort(input1A);
    Arrays.sort(input2A);
    return new String(input1A).equals(new String(input2A));
  }

  private boolean isAnagram_addSpace(String input1, String input2) {
    HashMap<Character, Integer> cache = new HashMap<Character, Integer>();
    for(char c: input1.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)+1);
      } else {
        cache.put(c, 1);
      }
    }
    for(char c: input2.toCharArray()) {
      if(cache.containsKey(c)) {
        cache.put(c, cache.get(c)-1);
        if(cache.get(c) == 0) cache.remove(c);
      } else {
        return false;
      }
    }
    return cache.size()==0;
  }

}

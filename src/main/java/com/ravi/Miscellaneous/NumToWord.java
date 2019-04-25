package com.ravi.Miscellaneous;

import java.util.HashMap;

public class NumToWord {

  HashMap<Integer, String> cache;

  public NumToWord() {
    cache = new HashMap<Integer, String>();
    populateCache(cache);
  }

  private void populateCache(HashMap<Integer, String> cache) {
    cache.put(1, "one");
    cache.put(2, "two");
    cache.put(3, "three");
    cache.put(4, "four");
    cache.put(5, "five");
    cache.put(6, "six");
    cache.put(7, "seven");
    cache.put(8, "eight");
    cache.put(9, "nine");
    cache.put(10, "ten");
    cache.put(11, "eleven");
    cache.put(12, "twelve");
    cache.put(13, "thirteen");
    cache.put(14, "fourteen");
    cache.put(15, "fifteen");
    cache.put(16, "sixteen");
    cache.put(17, "seventeen");
    cache.put(18, "eighteen");
    cache.put(19, "ninteen");
    cache.put(20, "twenty");
    cache.put(30, "thirty");
    cache.put(40, "forty");
    cache.put(50, "fifty");
    cache.put(60, "sixty");
    cache.put(70, "seventy");
    cache.put(80, "eighty");
    cache.put(90, "ninety");
  }

  public String numToWord(int num) {
    if(num < 1 || num > 99) return "ERROR";
    if((num >= 1 && num <= 20) || num %10 == 0) return cache.get(num);
    return cache.get(10 * (num/10)) + "-" + cache.get(num%10);
  }

}

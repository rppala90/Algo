package com.ravi.leetcode.facebook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombo {

  List<String> output = new LinkedList<String>();
  Map<String, String> phone = new HashMap<String, String>() {
    {
      put("2", "abc");
      put("3", "def");
      put("4", "ghi");
      put("5", "jkl");
      put("6", "mno");
      put("7", "pqrs");
      put("8", "tuv");
      put("9", "wxyz");
    }
  };

  public List<String> letterCombinations(String digits) {
    if(digits.length() != 0) letterCombo("", digits);
    return output;
  }

  private void letterCombo(String combination, String digits) {
    if(digits.length()==0) {
      output.add(combination);
    } else {
      String curDigit = digits.substring(0,1);
      String curstrVal = phone.get(curDigit);
      for(int i=0; i< curstrVal.length(); i++) {
        String letter = phone.get(curDigit).substring(i, i+1);
        letterCombo(combination+letter, digits.substring(1));
      }
    }
  }

}

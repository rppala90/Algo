package com.ravi.leetcode.facebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class ValidParan {

  public boolean isValid(String s) {
    Map<String, String> mapper = new HashMap<String, String>(){
        {
          put("(", ")");
          put("{", "}");
          put("[", "]");
        }
    };
    int i = 0;
    Stack<String> tracker = new Stack<String>();
    while(i<s.length()) {
      String currChar = s.substring(i, i+1);
      if("({[".contains(currChar)) {
        tracker.push(currChar);
      } else {
        if(! tracker.isEmpty() && mapper.get(tracker.peek()).equals(currChar)) {
          tracker.pop();
        } else {
          return false;
        }
      }
      i++;
    }
    if(! tracker.isEmpty()) return false;
    return true;
  }

}

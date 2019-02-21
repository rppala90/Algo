package com.ravi.leetcode.facebook;

public class CountSay {

  public String countAndSay(int n) {
    String str="1";
    for(int i=1; i<n; i++) {
      str = getStr(str);
    }
    return str;
  }

  private String getStr(String str) {
    StringBuilder output = new StringBuilder();
    int count=1;
    char prev = str.charAt(0);
    for(int i=1; i<str.length();i++) {
      if(str.charAt(i) == prev) {
        count++;
      } else {
        output.append(count+""+prev);
        count=1;
        prev = str.charAt(i);
      }
    }
    output.append(count+""+prev);
    return output.toString();
  }

}

package com.ravi.leetcode.facebook;

public class StrStr {

  public int strStr(String haystack, String needle) {
    if(needle.length() == 0) return 0;
    if(haystack.length()==0) return -1;
    int needlePtr = 0, i=0;
    for(i=0; i<haystack.length(); i++) {
      if(haystack.charAt(i) == needle.charAt(needlePtr) ) {
        if(needlePtr == needle.length()-1) return i - needlePtr;
        needlePtr++;
      } else {
        i-=needlePtr;
        needlePtr = 0;
      }
    }
    return -1;
  }

}

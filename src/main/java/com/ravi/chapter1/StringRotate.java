package com.ravi.chapter1;

public class StringRotate {

  public boolean isRotate(String s1, String s2) {
      StringBuilder sb = new StringBuilder(s2);
      sb.append(s2);
      return isSubString(sb.toString(), s1);
  }

  private boolean isSubString(String s1, String s2) {
    return s1.contains(s2);
  }

}

package com.ravi.chapter1;

public class URLify {

  public String urlIFY(String input, int n) {
    StringBuilder output = new StringBuilder();
    for(int i=0;i<n;i++) {
      if(input.charAt(i) == ' ') {
        output.append("%20s");
      } else {
        output.append(input.charAt(i));
      }
    }
    return output.toString();
  }

}

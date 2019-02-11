package com.ravi.chapter1;

public class StringComp {

  public String compressString(String input) {

    StringBuilder output = new StringBuilder();
    char[] inputs = input.toCharArray();
    int count = 1;
    Character lastChar = inputs[0];
    for(int i=1; i<inputs.length; i++) {
      if(lastChar == inputs[i]) {
        count++;
      } else {
        output.append(lastChar).append(count);
        count = 1;
        lastChar = inputs[i];
      }
    }
    output.append(lastChar).append(count);
    if(output.toString().length() >= input.length())
      return input;
    return output.toString();
  }

}

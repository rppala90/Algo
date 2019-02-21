package com.ravi.leetcode.facebook;

import java.util.LinkedList;
import java.util.List;

public class MultiplyStrings {

  public String multiply(String num1, String num2) {
    if(num1.equals("0") || num2.equals("0")) return "0";
    List<String> outputs = new LinkedList<String>();
    for(int j=num2.length()-1; j>=0; j--) {
      int curr2 = Integer.parseInt(""+num2.charAt(j));
      int carry = 0; String output = "";
      for(int k= j; k<num2.length()-1; k++ ) output += "0";
      for(int i=num1.length()-1;i>=0; i--) {
        int curr1 = Integer.parseInt("" + num1.charAt(i));
        if(i!=0) {
          output = (carry + (curr1*curr2))%10 + output;
          carry = (carry + (curr1*curr2)) / 10;
        } else {
          output = (carry + (curr1*curr2)) + output;
        }

      }
      outputs.add(output);
    }
    prependZeros(outputs);
    return addListStrings(outputs);
  }

  private String addListStrings(List<String> inputs) {
    String output = "";
    if(inputs.size() == 0) return "0";
    int carry = 0;
    for(int i=inputs.get(0).length()-1; i>=0; i--) {
      int temp = 0;
      for(String input: inputs) {
        temp += Integer.parseInt(""+input.charAt(i));
      }
      if(i!=0) {
        output = (carry + temp)%10 + output;
        carry = (carry + temp) / 10;
      } else {
        output = (carry+temp) + output;
      }
    }
    return output;
  }

  private void prependZeros(List<String> outputs) {
    int lastStringLen = outputs.get(outputs.size()-1).length();
    for(int i=0; i<outputs.size();i++) {
      String temp = outputs.get(i);
      for(int j=temp.length(); j<lastStringLen; j++) {
        temp = "0" + temp;
      }
      outputs.set(i, temp);
    }
  }
}

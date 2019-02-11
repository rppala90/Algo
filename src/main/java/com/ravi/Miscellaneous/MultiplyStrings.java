package com.ravi.Miscellaneous;

import java.util.LinkedList;
import java.util.List;

public class MultiplyStrings {

  public String multiply(String first, String second) {
    int firstL = first.length(), secondL = second.length();
    boolean firstNegative = (first.charAt(0) == '-') ? true: false;
    boolean secondNegative = (second.charAt(0)== '-') ? true: false;
    if(firstNegative) {first = first.substring(1); firstL--;}
    if(secondNegative) {second = second.substring(1); secondL--;}
    boolean isNegative = (firstNegative==secondNegative) ? false: true;

    List<StringBuilder> answers = new LinkedList<StringBuilder>();
    for(int i=secondL-1; i>=0; i--) {
      int carry = 0;
      StringBuilder interAns = new StringBuilder();
      for(int j=firstL-1; j>=0; j--) {
        int secondDigit = Integer.parseInt(""+ second.charAt(i));
        int firstDigit = Integer.parseInt("" + first.charAt(j));
        int curDigit = (secondDigit * firstDigit) + carry;
        int curAns = curDigit % 10;
        carry = curDigit/10;
        if(j==0) curAns = curDigit;
        interAns.insert(0, curAns);
      }
      for(int k=i; k<secondL-1 ; k++) {
        interAns.append(0);
      }
      answers.add(interAns);
    }
    int maxAnsLen = ((LinkedList<StringBuilder>) answers).getLast().length();
    for(int i=0; i<answers.size(); i++) {
      int len = answers.get(i).length();
      for(int j=0; j<maxAnsLen-len; j++) {
        answers.get(i).insert(0, 0);
      }
    }
    StringBuilder reply = new StringBuilder();

    int carry = 0;
    for(int i=maxAnsLen-1; i>=0; i--) {
      int sum=0;
      for(int j=0; j<answers.size(); j++) {
        sum += Integer.parseInt(""+answers.get(j).charAt(i));
      }
      sum += carry;
      if(i==0) reply.insert(0, sum);
      else {
        carry = sum / 10;
        reply.insert(0, sum%10);
      }
    }
    String retVal = reply.toString();
    int i =0;
    while(retVal.charAt(i) == '0') i++;
    return retVal.substring(i);
  }

}

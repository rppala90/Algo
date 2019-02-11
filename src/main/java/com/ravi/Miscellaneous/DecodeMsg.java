package com.ravi.Miscellaneous;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DecodeMsg {

  private int decoded(int n, int[] input) {
    int count = 1;
    Queue<Integer> pos = new LinkedList<Integer>();
    for(int cur=0; cur < n-1; cur++) {
      int num = (input[cur] * 10) + input[cur+1];
      if(num == 0) return 0;
      if (num > 26) {
        if(num%10 == 0 && cur == n-1) return 0;
        else continue;
      }
    }

    count += pos.size();
    return count;
  }

  public int decoded(int n, String s) {
    if(s.charAt(0) == ' ') return 1;
    int[] input = new int[s.length()];
    for(int i=0; i<n; i++) {
      input[i] = Integer.parseInt(""+s.charAt(i));
    }
    return decoded(n, input);
  }

}

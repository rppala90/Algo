package com.ravi.Miscellaneous;

import java.util.LinkedList;
import java.util.Queue;

public class SubarraySum {

  public String findConsSum(int[] data, int finalSum) {
    Queue<Integer> indexQ = new LinkedList<Integer>();
    int sum =0;
    for(int i=0; i<data.length; i++) {
      sum += data[i];
      indexQ.add(i);
      while(sum > finalSum) {
        if(indexQ.isEmpty()) return "-1";
        int curInd = indexQ.poll();
        sum -= data[curInd];
      }
      if(sum == finalSum) return indexQ.remove()+1 + " " + (i+1);
    }
    return "-1";
  }

}

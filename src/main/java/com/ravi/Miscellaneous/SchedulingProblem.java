package com.ravi.Miscellaneous;

import java.util.Arrays;

public class SchedulingProblem {

  class JobNode implements Comparable{
    int startTime;
    int endTime;
    int maxJobsPossible;

    public boolean overlapping(JobNode other) {
      if(startTime > endTime || other.startTime > other.endTime) return false;
      if(startTime >= other.startTime && startTime < other.endTime ||
         endTime > other.startTime && endTime <= other.endTime ||
         startTime <= other.startTime && endTime >= other.endTime)
        return true;
      return false;
    }

    @Override
    public int compareTo(Object o) {
      if(endTime > ((JobNode) o).endTime) return 1;
      else if(endTime < ((JobNode) o).endTime) return -1;
      return 0;
    }
  }

  public int getCountJobsPossible(int[] startTimes, int[] endTimes) {
    JobNode[] jobs = new JobNode[startTimes.length];
    for(int i=0; i<startTimes.length; i++) {
      jobs[i] = new JobNode();
      jobs[i].startTime = startTimes[i];
      jobs[i].endTime = endTimes[i];
      jobs[i].maxJobsPossible = 1;
    }
    Arrays.sort(jobs);

    int returnMaxValue = 0;
    for(int i=1; i<jobs.length; i++) {
      for(int j=0; j<i;j++) {
        if( ! jobs[i].overlapping(jobs[j]) && jobs[j].maxJobsPossible >= jobs[i].maxJobsPossible) {
          jobs[i].maxJobsPossible = 1 + jobs[j].maxJobsPossible;
        }
      }
      if(jobs[i].maxJobsPossible > returnMaxValue) {
        returnMaxValue = jobs[i].maxJobsPossible;
      }
    }
    return returnMaxValue;
  }

}

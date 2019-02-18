package com.ravi.leetcode.facebook;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> output = new LinkedList();
      for(int i=0; i<nums.length; i++) {
        HashSet<Integer> cache = new HashSet<Integer>();
        for(int j=i+1; j<nums.length;j++) {
          if(cache.contains(-1 * (nums[i] + nums[j]))) {
            MyList<Integer> match = new MyList<Integer>();
            match.add(nums[i]);
            match.add(nums[j]);
            match.add(-1 * (nums[i] + nums[j]));
            AtomicBoolean canAdd = new AtomicBoolean(true);
            output.forEach((x) -> {
              if(match.compareTo(x) == 0) {
                canAdd.getAndSet(false);
              }
            });
            if(canAdd.get()) output.add(match);
          } else {
            cache.add(nums[j]);
          }
        }
      }
      return output;
  }

  class MyList<Integer> extends LinkedList<Integer> implements Comparable {

    @Override
    public int compareTo(Object o2) {
      LinkedList other = (LinkedList) o2;
      LinkedList current = (LinkedList) this;
      Collections.sort(current);
      Collections.sort(other);
      for(int i=0; i<3; i++) {
        if((int)current.get(i) > (int)other.get(i)) {
          return 1;
        } else if((int)current.get(i) < (int)other.get(i)) return -1;
      }
      return 0;
    }
  }

}

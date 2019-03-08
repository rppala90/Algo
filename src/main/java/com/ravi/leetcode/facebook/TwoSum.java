package com.ravi.leetcode.facebook;

import java.util.Hashtable;
import java.util.LinkedList;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int[] retVal = new int[2];
    Hashtable<Integer, Integer> cache = new Hashtable<Integer, Integer>();
    for(int i=0; i<nums.length; i++) {
      cache.put(nums[i], i);
    }
    for(int i=0; i<nums.length; i++) {
      if(cache.containsKey(target - nums[i]) && i != cache.get(target-nums[i])) {
        retVal[0] = i;
        retVal[1] = cache.get(target-nums[i]);
        break;
      }
    }

    return retVal;
  }

}
